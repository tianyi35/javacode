package com.hsp.javacode.chapter16.tankgame_;


import javax.swing.*;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-13 9:49
 * Version 1.0
 */
public class HspTankGame01 extends JFrame {
    //定义一个画板
    private MyPanel mp = null;

    public static void main(String[] args) {
        new HspTankGame01();
    }

    public HspTankGame01() {
        mp = new MyPanel();//初始化画板
        //把画板放入到窗口
        this.add(mp);
        //设置窗口的大小
        this.setSize(1000, 750);
        //点击关闭按钮，程序退出
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置可见
        this.setVisible(true);
    }
}
