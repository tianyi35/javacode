package com.hsp.javacode.chapter18.tankgame4;

import com.hsp.javacode.chapter14.list_.Vector_;

import java.util.Vector;

/**
 * Description: 敌人坦克
 * Author: Lixp
 * Date: 2023-03-13 11:43
 * Version 1.0
 */
public class EnemyTank extends Tank implements Runnable {
    //创建敌人坦克类，使用Vector 保存多个Shot
    Vector<Shot> vector = new Vector<>();
    private boolean isLive = true;

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }

    public EnemyTank(int x, int y) {
        super(x, y);
    }

    @Override
    public void run() {
        while (true) {
            switch (getDirect()) {//方向
                case 0://上
                    for (int i = 0; i < 30; i++) {
                        if (getY() > 0) {
                            moveUp();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                    break;
                case 1://右
                    for (int i = 0; i < 30; i++) {
                        if (getX()+60 < 1000) {
                            moveRight();
                        }

                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 2://下
                    for (int i = 0; i < 30; i++) {
                        if (getY() + 60 < 750) {
                            moveDown();
                        }

                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 3://左
                    for (int i = 0; i < 30; i++) {
                        if (getX() > 0) {
                            moveLeft();
                        }

                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    break;
            }



            //然后随即改变坦克的方向0-3

            setDirect((int) (Math.random() * 4));

            //并发线程，一定要考虑清楚，线程什么时候结束
            if (!isLive) {
                break;//退出线程

            }
        }

    }
}
