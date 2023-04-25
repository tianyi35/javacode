package com.hsp.javacode.chapter17;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-14 9:19
 * Version 1.0
 */
public class CpuNum {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        //获取当前电脑Cpu数量/核心数
        int i = runtime.availableProcessors();
        System.out.println("电脑cpu数=" + i);


    }
}
