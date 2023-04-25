package com.hsp.javacode.chapter07;

import java.util.Arrays;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-01-31 14:53
 * Version 1.0
 */
public class MiGong {
    public static void main(String[] args) {
        /*
        //1.先创建迷宫，用二维数组表示int[][] map = new int[8][7]
        //2.先规定map数组的元素值：0表示可以走 1表示障碍物
         */
        int[][] map = new int[8][7];
        //3.将最上面的一行和最下面的一行，设置为1
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }
        //4.将最左面的一行和最右面的一行，设置为1
        for (int i = 0; i < 8; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }
        //5.设定障碍物
        map[3][1] = 1;
        map[3][2] = 1;


        System.out.println("=========原始地图的情况=========");
        for (int i = 0; i < map.length; i++) {
            System.out.println(Arrays.toString(map[i]));
        }
        B b = new B();
        b.findWay(map, 1, 1);
        System.out.println("=========找路的情况如下========");
        for (int i = 0; i < map.length; i++) {
            System.out.println(Arrays.toString(map[i]));
        }
    }
}

class B {

    //1.findWay方法就是专门来找出迷宫的路径
    //2.如果找到，就返回true,否则返回false
    //3.map就是二维数组，即迷宫
    //4.i,j就是老鼠的位置，初始化的位置为(1,1)
    //5.因为我们是递归的找路，所以先规定map数组的各个值的含义
    // 0表示可以走  1表示障碍物 2表示可以走 3表示走过，但是走不通是死路
    //6.当map[6][5]=2就说明找到通路，就可以结束，否则就继续找
    //7.先确定老鼠找路策略，下->右->上->左
    public boolean findWay(int[][] map, int i, int j) {
        if (map[6][5] == 2) {//map[6][5]=2就说明找到通路
            return true;
        } else {
            if (map[i][j] == 0) {//0表示可以走
                //假定可以走通
                map[i][j] = 2;
                if (findWay(map, i + 1, j)) {//向下
                    return true;
                } else if (findWay(map, i, j + 1)) {//向右
                    return true;
                } else if (findWay(map, i - 1, j)) {//向上
                    return true;
                } else if (findWay(map, i, j - 1)) {//向右
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }
            } else {
                return false;//1表示障碍物 2表示可以走 3表示走过，但是走不通是死路
            }
        }
    }
}
