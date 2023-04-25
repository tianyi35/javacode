package com.hsp.javacode.chapter18.tankgame3;

/**
 * Description: 自己的坦克
 * Author: Lixp
 * Date: 2023-03-13 9:00
 * Version 1.0
 */
public class Hero extends Tank {

    //定义一个Shot对象，表示一个射击(线程)
    Shot shot = null;

    public Hero(int x, int y) {
        super(x, y);
    }

    public void shotEnemyTank() {
        //创建Shot对象，根据当前Hero对象的位置和方向来创建shot

        switch (getDirect()) {//Hero对象的方向
            case 0://上
                shot = new Shot(getX() + 20, getY(), 0);
                break;
            case 1://右
                shot = new Shot(getX() + 60, getY() + 20, 1);
                break;
            case 2://下
                shot = new Shot(getX() + 20, getY() + 60, 2);
                break;
            case 3://左
                shot = new Shot(getX(), getY() + 20, 3);
                break;
        }
        //启动我们的Shot线程
        new Thread(shot).start();
    }
}
