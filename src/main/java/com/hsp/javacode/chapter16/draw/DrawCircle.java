package com.hsp.javacode.chapter16.draw;

import javax.swing.*;
import java.awt.*;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-10 15:38
 * Version 1.0
 */
public class DrawCircle extends JFrame {//JFrame是一个画图的窗口

    //定义一个画板
    private MyPanel mp = null;

    public static void main(String[] args) {
        new DrawCircle();
        System.out.println("退出程序");
    }
    public DrawCircle(){//构造器
        mp = new MyPanel();//初始化画板
        //把画板放入到窗口
        this.add(mp);
        //设置窗口的大小
        this.setSize(400, 300);
        //点击关闭按钮，程序退出
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置可见
        this.setVisible(true);


    }
}

//定义一个MyPanel，继承JPanel类，画图形就在面板上画
class MyPanel extends JPanel {

    //说明
    //1.MyPanel对象就是一个画板
    //2.Graphics g 把 g 理解成一个画笔
    //3.Graphics 提供了很多绘图的方法

    @Override
    public void paint(Graphics g) {//paint 绘图方法
        System.out.println("paint方法被调用...");
        super.paint(g);//调用父类的方法完成初始化
        g.drawOval(10, 10, 100, 100);

    }
}
