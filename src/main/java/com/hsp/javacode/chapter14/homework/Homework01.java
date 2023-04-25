package com.hsp.javacode.chapter14.homework;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-08 15:22
 * Version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {
        News news1 = new News("新冠确诊病例超千万，数百万印度教信徒赴恒河\"圣浴\"");
        News news2 = new News("男子想起2个月前钓的鱼");

        List list = new ArrayList();
        list.add(news1);
        list.add(news2);

        list.sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((News) o2).getTitle().compareTo(((News) o1).getTitle());
            }
        });

       //System.out.println("list=" + list);

        for (Object obj : list) {
            if (obj instanceof News) {
                String title = ((News) obj).getTitle();
                if (null != title && title.length() > 15) {
                    title = title.substring(0, 15) + "...";
                }
                System.out.println(title);
            }
        }

    }
}

class News {
    private String title;
    private String context;

    @Override
    public String toString() {
        return "news{" +
                "title='" + title + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public News(String title) {
        this.title = title;
    }
}
