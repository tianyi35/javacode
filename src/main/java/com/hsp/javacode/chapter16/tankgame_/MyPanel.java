package com.hsp.javacode.chapter16.tankgame_;

import javax.swing.*;
import java.awt.*;

/**
 * Description: 坦克大战的绘图区域
 * Author: Lixp
 * Date: 2023-03-13 9:48
 * Version 1.0
 */
public class MyPanel extends JPanel {
    //定义我的坦克
    Hero hero = null;

    public MyPanel() {
        hero = new Hero(100, 100);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);//填充矩形，默认黑色
        //画出坦克--封装方法
        drawTank(hero.getX(), hero.getY(), g, 0, 0);
        //画出坦克--封装方法
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
            //我方坦克
            case 0:
                g.setColor(Color.cyan);
                break;
            //敌方坦克
            case 1:
                g.setColor(Color.yellow);
                break;
        }

        //根据坦克方向，来绘制坦克
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
            default:
                System.out.println("暂时不处理");
        }
    }
}
