package com.hsp.javacode.chapter11;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-22 16:13
 * Version 1.0
 */
public enum Season {
    SPRING("春天", "炎热"),
    SUMMER("春天", "炎热"),
    AUTUMN("春天", "炎热"),
    WINNER("春天", "炎热"),
    ;

    private String name;
    private String description;

    Season(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

}
