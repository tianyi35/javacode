package com.hsp.javacode.chapter16.tankgame2;


import com.hsp.javacode.chapter14.list_.Vector_;

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
public class MyPanel extends JPanel implements KeyListener {
    //定义我的坦克
    Hero hero = null;

    //定义敌人坦克
    Vector<EnemyTank> enemyTanks = new Vector<>();
    int enemyTankSize=3;

    public MyPanel() {
        hero = new Hero(100, 100);
        hero.setSpeed(5);

        for (int i = 0; i < enemyTankSize; i++) {
            enemyTanks.add(new EnemyTank(100 * (i + 1), 0));
        }

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);//填充矩形，默认黑色
        //画出自己坦克--封装方法
        drawTank(hero.getX(), hero.getY(), g, hero.getDirect(), 1);

        //画出敌人坦克--遍历
        for (int i = 0; i < enemyTanks.size(); i++) {
            //取出坦克
            EnemyTank enemyTank = enemyTanks.get(i);
            enemyTank.setDirect(2);
            drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirect(), 0);
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
            hero.moveUp();
        } else if (e.getKeyCode() == KeyEvent.VK_D) {//D键
            hero.setDirect(1);
            hero.moveRight();
        } else if (e.getKeyCode() == KeyEvent.VK_S) {//S键
            hero.setDirect(2);
            hero.moveDown();
        } else if (e.getKeyCode() == KeyEvent.VK_A) {//A键
            hero.setDirect(3);
            hero.moveLeft();
        }

        //让面板重绘
        this.repaint();

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
