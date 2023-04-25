package com.hsp.javacode.chapter07;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-01-31 16:09
 * Version 1.0
 */
public class HanoiTower {
    public static void main(String[] args) {

        Tower tower = new Tower();
        tower.move(6, 'A', 'B', 'C');
    }
}

class Tower {
    //move方法
    //num表示要移动的个数，a,b,c分别表示A塔,B塔,C塔
    public void move(int num, char a, char b, char c) {
        //如果只有一个盘 num=1
        if (num == 1) {
            System.out.println(a + "->" + c);
        } else {
            //如果有多个盘，可以看成两个，最下面的和上面的所有盘(num-1)
            //1.先移动上面所有的盘到b,借助c
            move(num - 1, a, c, b);
            //2.把最下面的盘，移动到c
            System.out.println(a + "->" + c);
            //3.把b塔的所有盘，移动到c,借助a
            move(num - 1, b, a, c);

        }
    }
}