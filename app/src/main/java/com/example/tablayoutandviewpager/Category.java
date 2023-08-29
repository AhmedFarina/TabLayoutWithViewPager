package com.example.tablayoutandviewpager;

public class Category {
    private int id;
    private String name;

    int baseCounter = 0;
    public Category( String name) {
        this.id = ++baseCounter;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
