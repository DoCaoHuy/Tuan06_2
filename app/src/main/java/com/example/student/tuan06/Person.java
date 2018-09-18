package com.example.student.tuan06;

/**
 * Created by Student on 9/18/2018.
 */

public class Person {
    private String name;
    private int age;
    private int image;

    public Person(String name, int age, int image) {
        this.name = name;
        this.age = age;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
