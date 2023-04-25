package com.hsp.javacode.chapter18.tankgame3;

/**
 * Description: 子弹
 * Author: Lixp
 * Date: 2023-03-15 16:30
 * Version 1.0
 */
public class Shot implements Runnable {
    private int x;
    private int y;
    private int direct;//方向 0向上 1向右 2向下 3向左
    private int speed = 2;//速度
    private boolean isLive = true;//子弹是否活着(默认活着)

    public Shot(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }

    //射击
    @Override
    public void run() {
        while (isLive) {

            try {
                //休眠50毫秒
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //根据方向来改变x,y坐标
            switch (direct) {
                case 0://上
                    y -= speed;
                    break;
                case 1://右
                    x += speed;
                    break;
                case 2://下
                    y += speed;
                    break;
                case 3://左
                    x -= speed;
                    break;
                default:
                    ;
            }
            System.out.println("子弹 x=" + x + " y=" + y);
            if (!(x >= 0 && x <= 1000 && y >= 0 && y <= 750)) {
                isLive = false;
                System.out.println("子弹退出");
                break;
            }

        }
    }
}
