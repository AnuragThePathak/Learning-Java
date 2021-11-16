package com.anurag.oop.accessmodifier;

import com.anurag.oop.differentpackage.Human;

public class ProtectedModifier {
    public static void main(String[] args) {
        Kid kid = new Kid(9);
        Kid kid1 = new Kid(6);
        Human kid2 = new Kid(3);

        System.out.println(Kid.getTotalKids());
        System.out.println(kid.name);
        System.out.println(kid.game);
    }
}

class Kid extends Human {

    String name = "Blah";
    protected String game = "Cricket";

    Kid(int age) {
        super(age);
    }

    static int getTotalKids() {
        return population;
    }

    int memberMethodTest() {
        Human person = new Kid(15);
//        int x = person.age;  // In this case can't access anything because Human
//        // class is in different package, which is type of reference, and it determines
//        // what we can access.

        Kid kiddo = new Kid(12);
        int y = kiddo.age;
        return y;
    }

    static int staticMethodTest() {
        return Human.population; // As protected members made available/inherited to
        // all derived classes, hence it's accessible here.
    }
}
