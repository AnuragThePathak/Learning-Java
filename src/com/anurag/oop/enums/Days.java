package com.anurag.oop.enums;

enum Week {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    Week() {
        System.out.println("This is " + this);
    }

    public static void main(String[] args) {
        System.out.println(Week.FRIDAY);
//        System.out.println(Week.Monday + Week.Wednesday); // Can't be concatenated
//        // like string

        System.out.println(Week.MONDAY + " " + Week.WEDNESDAY);

        Week day = Week.SUNDAY;
        System.out.println(day);
        System.out.println(day.ordinal());
        System.out.println(Week.valueOf("Thursday"));
    }
}
