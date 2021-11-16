package com.anurag.oop.differentpackage;

public class Human {

    protected static int population;
    protected int age;

    protected Human(int age) {
        this.age = age;
        population++;
    }
}
