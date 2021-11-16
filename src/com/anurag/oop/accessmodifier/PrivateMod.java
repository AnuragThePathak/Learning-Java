package com.anurag.oop.accessmodifier;

public class PrivateMod {
    public static void main(String[] args) {
        Student privateMod = new Student(21);
        Student privateMod1 = new Student(25);

        System.out.println("Roll no of privateMod is " + privateMod.getRoll());
        System.out.println("Total no of student is " + Student.getCount());
    }
}

class Student {

    static int count; // Static fields as well as methods are not inherited
    // but as long as they are accessible (depending on public/protected/package
    //-private, we can access them inside subclass without specifying scope.

    int roll;

    Student(int roll) {
        this.roll = roll;
        count++;
    }

    public int getRoll() {
        return roll;
    }

    public static int getCount() {
        return count;
    }
}
