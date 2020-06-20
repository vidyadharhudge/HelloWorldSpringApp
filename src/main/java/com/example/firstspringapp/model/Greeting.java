package com.example.firstspringapp.model;

public class Greeting {
    private long counter;
    private String name;

    public Greeting(long counter, String name) {
        this.counter = counter;
        this.name = name;
    }

    public long getCounter() {
        return counter;
    }

    public void setCounter(long counter) {
        this.counter = counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
