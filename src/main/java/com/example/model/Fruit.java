package com.example.model;

/**
 * Created by user on 16/8/15.
 */
public class Fruit<T> {
    private String name;
    private T fish;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getFish() {
        return fish;
    }

    public void setFish(T fish) {
        this.fish = fish;
    }
}
