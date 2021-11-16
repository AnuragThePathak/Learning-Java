package com.anurag.oop.functionoverriding;

public class FunctionOverriding {

    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.area();
    }
}

class Shape {

    void area() {
        System.out.println("Area of a shape is non-negative.");
    }
}

class Circle extends Shape {

    @Override  // This annotation only makes sure we are overriding some function.
    // If we don't override anything throws error.
    void area() {
        System.out.println("Area of circle is pi * r * r.");
    }
    // In Java, it's not required to be of abstract function in order to get
    // overridden.
}
