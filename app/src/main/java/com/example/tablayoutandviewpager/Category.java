package com.example.tablayoutandviewpager;

import androidx.fragment.app.Fragment;

public class Category {
    private int id;
    private String name;
    Fragment fragment;

    int baseCounter = 0;
    public Category( String name , Fragment fragment) {
        this.id = ++baseCounter;
        this.name = name;
        this.fragment = fragment;
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
