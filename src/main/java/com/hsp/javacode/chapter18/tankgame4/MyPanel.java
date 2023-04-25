package com.hsp.javacode.chapter18.tankgame4;


import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * Description: 坦克大战的绘图区域
 * Author: Lixp
 * Date: 2023-03-13 9:48
 * Version 1.0
 */

//为了实现键盘监听事件，实现KeyListener
//为了让Panel不停的重绘子弹，需要将MyPanel实现Runnable接口，当做一个线程使用
public class MyPanel extends JPanel implements KeyListener, Runnable {
    //定义我的坦克
    Hero hero = null;

    //定义敌人坦克
    Vector<EnemyTank> enemyTanks = new Vector<>();
    int enemyTankSize = 3;

    //定义一个Vector,炸弹
    //说明，当子弹击中坦克，加入一个Bomb对象到Vector
    Vector<Bomb> bombs = new Vector<>();
    //定义三张图片，用于显示爆炸效果
    Image image1 = null;
    Image image2 = null;
    Image image3 = null;

    public MyPanel() {
        //初始化我方坦克
        hero = new Hero(100, 100);
        hero.setSpeed(5);

        //初始化敌人坦克
        for (int i = 0; i < enemyTankSize; i++) {
            //创建一个敌人坦克
            EnemyTank enemyTank = new EnemyTank(100 * (i + 1), 0);
            //设置方向
            enemyTank.setDirect(2);
            //让适合坦克动起来
            new Thread(enemyTank).start();
            //给enemyTank加入一颗子弹
            Shot shot = new Shot(enemyTank.getX() + 20, enemyTank.getY() + 60, enemyTank.getDirect());
            //加入enemyTank
            enemyTank.vector.add(shot);
            //启动 Shot
            new Thread(shot).start();

            enemyTanks.add(enemyTank);
        }

        //初始化图片对象
        image1 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/img1.png"));
        image2 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/img2.png"));
        image3 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/img3.png"));

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);//填充矩形，默认黑色
        //画出自己坦克--封装方法
        if (hero != null && hero.isLive()) {
            drawTank(hero.getX(), hero.getY(), g, hero.getDirect(), 1);
        }


        //画出hero射击的子弹
       /* if (hero.shot != null && hero.shot.isLive() == true) {
            System.out.println("子弹被绘制...");
            g.draw3DRect(hero.shot.getX(), hero.shot.getY(), 1, 1, false);
        }*/
        //将hero的子弹集合shots，遍历取出绘制
        for (int i = 0; i < hero.shots.size(); i++) {
            Shot shot = hero.shots.get(i);
            if (shot != null && shot.isLive()) {

                System.out.println("hero的子弹集合shots子弹被绘制...");
                g.draw3DRect(shot.getX(), shot.getY(), 1, 1, false);
            } else {//如果shot对象已经无效，就从shots集合中剔除
                hero.shots.remove(shot);
            }
        }

        for (int i = 0; i < bombs.size(); i++) {
            //取出炸弹
            Bomb bomb = bombs.get(i);
            //根据当前这个bomb对象的life值去画出对应的图片
            if (bomb.life > 6) {
                g.drawImage(image1, bomb.getX(), bomb.getY(), 60, 60, this);
            } else if (bomb.life > 3) {
                g.drawImage(image2, bomb.getX(), bomb.getY(), 60, 60, this);
            } else {
                g.drawImage(image3, bomb.getX(), bomb.getY(), 60, 60, this);
            }
            //让炸弹生命值减少
            bomb.lifeDown();
            //如果bomb life=0,就从bombs的集合中删除
            if (bomb.life == 0) {
                bombs.remove(bomb);
            }
        }

        //画出敌人坦克--遍历
        for (int i = 0; i < enemyTanks.size(); i++) {
            //取出坦克
            EnemyTank enemyTank = enemyTanks.get(i);
            //判断敌人坦克是否还存活,才去画出
            if (enemyTank.isLive()) {
                drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirect(), 0);

                //画出enemyTank所有子弹
                for (int j = 0; j < enemyTank.vector.size(); j++) {
                    //取出子弹
                    Shot shot = enemyTank.vector.get(j);
                    //绘制
                    if (shot.isLive()) {
                        g.draw3DRect(shot.getX(), shot.getY(), 1, 1, false);
                    } else {
                        //从Vector中移除
                        enemyTank.vector.remove(shot);
                    }
                }
            }

        }


    }

    /**
     * 画出坦克
     *
     * @param x      坦克x坐标
     * @param y      坦克xy坐标
     * @param g      画笔
     * @param direct 坦克方向（上下左右）
     * @param type   坦克类型
     */
    public void drawTank(int x, int y, Graphics g, int direct, int type) {
        //根据坦克类型不同，给坦克设置颜色
        switch (type) {
            //敌人坦克
            case 0:
                g.setColor(Color.cyan);
                break;
            //我方坦克
            case 1:
                g.setColor(Color.yellow);
                break;
        }

        //根据坦克方向，来绘制坦克(0向上 1向右 2向下 3向左)
        switch (direct) {
            //坦克向上
            case 0:
                //画出坦克左边的轮子
                g.fill3DRect(x, y, 10, 60, false);
                //画出坦克右边的轮子
                g.fill3DRect(x + 30, y, 10, 60, false);
                //画出坦克中间矩形
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                //画出坦克盖子
                g.fillOval(x + 10, y + 20, 20, 20);
                //画出坦克炮管(起点--->终点)
                g.drawLine(x + 20, y + 30, x + 20, y);
                break;
            //坦克向右
            case 1:
                //画出坦克左边的轮子
                g.fill3DRect(x, y, 60, 10, false);
                //画出坦克右边的轮子
                g.fill3DRect(x, y + 30, 60, 10, false);
                //画出坦克中间矩形
                g.fill3DRect(x + 10, y + 10, 40, 20, false);
                //画出坦克盖子
                g.fillOval(x + 20, y + 10, 20, 20);
                //画出坦克炮管(起点--->终点)
                g.drawLine(x + 30, y + 20, x + 60, y + 20);
                break;
            //坦克向下
            case 2:
                //画出坦克左边的轮子
                g.fill3DRect(x, y, 10, 60, false);
                //画出坦克右边的轮子
                g.fill3DRect(x + 30, y, 10, 60, false);
                //画出坦克中间矩形
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                //画出坦克盖子
                g.fillOval(x + 10, y + 20, 20, 20);
                //画出坦克炮管(起点--->终点)
                g.drawLine(x + 20, y + 30, x + 20, y + 60);
                break;
            //坦克向左
            case 3:
                //画出坦克左边的轮子
                g.fill3DRect(x, y, 60, 10, false);
                //画出坦克右边的轮子
                g.fill3DRect(x, y + 30, 60, 10, false);
                //画出坦克中间矩形
                g.fill3DRect(x + 10, y + 10, 40, 20, false);
                //画出坦克盖子
                g.fillOval(x + 20, y + 10, 20, 20);
                //画出坦克炮管(起点--->终点)
                g.drawLine(x + 30, y + 20, x, y + 20);
                break;
            default:
                System.out.println("暂时不处理");
        }
    }

    /**
     * 判断我方坦克发射的子弹是否击中敌人坦克
     * 什么时候判断我方的坦克发射的子弹是不中击中敌人的坦克？ run方法中
     *
     * @param shot
     * @param enemyTank
     */
    public void hitTank(Shot shot, Tank enemyTank) {
        //判断是否击中坦克
        switch (enemyTank.getDirect()) {
            case 0://坦克向上
            case 2://坦克向下
                if (shot.getX() > enemyTank.getX() && shot.getX() < enemyTank.getX() + 40
                        && shot.getY() > enemyTank.getY() && shot.getY() < enemyTank.getX() + 60) {
                    shot.setLive(false);
                    enemyTank.setLive(false);

                    //当我的方子弹击中敌人坦克后,将enemyTank从Vector剔除
                    enemyTanks.remove(enemyTank);
                    //创建Bomb对象，加入到Vector
                    Bomb bomb = new Bomb(enemyTank.getX(), enemyTank.getY());
                    bombs.add(bomb);

                }
                break;
            case 1://坦克向右
            case 3://坦克向左
                if (shot.getX() > enemyTank.getX() && shot.getX() < enemyTank.getX() + 60
                        && shot.getY() > enemyTank.getY() && shot.getY() < enemyTank.getX() + 40) {
                    shot.setLive(false);
                    enemyTank.setLive(false);

                    //当我的方子弹击中敌人坦克后,将enemyTank从Vector剔除
                    enemyTanks.remove(enemyTank);
                    //创建Bomb对象，加入到Vector
                    Bomb bomb = new Bomb(enemyTank.getX(), enemyTank.getY());
                    bombs.add(bomb);
                }
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //处理wdsa事件
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {//按下W键
            //改变tank的方向
            hero.setDirect(0);
            //修改tank的坐标 y-=1
            if (hero.getY() > 0) {
                hero.moveUp();
            }

        } else if (e.getKeyCode() == KeyEvent.VK_D) {//D键
            hero.setDirect(1);
            if (hero.getX() + 60 < 1000) {
                hero.moveRight();
            }

        } else if (e.getKeyCode() == KeyEvent.VK_S) {//S键
            hero.setDirect(2);
            if (hero.getY() + 60 < 750) {
                hero.moveDown();
            }

        } else if (e.getKeyCode() == KeyEvent.VK_A) {//A键
            hero.setDirect(3);
            if (hero.getX() > 0) {
                hero.moveLeft();
            }

        }

        //如果用户按下的是J,就发射
        if (e.getKeyCode() == KeyEvent.VK_J) {

            //发射一颗子弹
            /*if (hero.shot == null) {
                System.out.println("用户按下了J,开始射击...");
                hero.shotEnemyTank();
            }*/

            //发射多颗子弹
            hero.shotEnemyTank();

        }
        //让面板重绘
        this.repaint();

    }

    //判断敌人坦克是否击中我方坦克
    public  void hitHero() {
        //遍历敌人tank
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            //遍历敌人tank所有子弹
            for (int j = 0; j < enemyTank.vector.size(); j++) {
                Shot shot = enemyTank.vector.get(i);
                //判断shot是否击中我方tank
                if (hero.isLive() && shot.isLive()) {
                    hitTank(shot, hero);
                }
            }

        }

    }
    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {//每隔100毫秒，重绘区域,刷新绘图区域，让子弹移动
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //判断是否击中敌人坦克
            if (hero.shot != null && hero.shot.isLive()) {
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    hitTank(hero.shot, enemyTank);

                }
            }
            //判断敌人tank是否击中我方tank
            hitHero();
            this.repaint();
        }
    }
}
