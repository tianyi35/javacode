package com.hsp.javacode.chapter16.tankgame_;

/**
 * Description: 坦克
 * Author: Lixp
 * Date: 2023-03-13 8:50
 * Version 1.0
 */
public class Tank {
    private int x;//坦克横坐标
    private int y;//坦克纵坐标

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

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
