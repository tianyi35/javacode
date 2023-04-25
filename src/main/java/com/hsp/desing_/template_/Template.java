package com.hsp.desing_.template_;

/**
 * Description: 设计模式【模版设计模式】
 * Author: Lixp
 * Date: 2023-02-17 11:36
 * Version 1.0
 */
public abstract class Template {

    public abstract void job();

    public void caleTime() {
        //统计当前时间
        long start = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - start));
    }

}
