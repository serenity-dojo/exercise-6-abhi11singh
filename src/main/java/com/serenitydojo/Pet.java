package com.serenitydojo;

public abstract class Pet {

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private String name;
    private int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age =age;
    }

    public abstract String play();
}
