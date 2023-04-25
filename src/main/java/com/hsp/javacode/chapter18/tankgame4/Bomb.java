package com.hsp.javacode.chapter18.tankgame4;

/**
 * Description: 炸弹
 * Author: Lixp
 * Date: 2023-03-16 10:36
 * Version 1.0
 */
public class Bomb {

    private int x;
    private int y;
    int life = 9;//炸弹生命周期
    boolean isLive = true;//是否存活


    //减少生命值，配合炸弹效果
    public void lifeDown() {
        if (life > 0) {
            life--;
        } else {
            isLive = false;
        }
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
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


    public Bomb(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
