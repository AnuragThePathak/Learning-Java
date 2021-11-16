package com.anurag.oop.accessmodifier;

public class PackagePrivateMod {
    public static void main(String[] args) {

        Student student = new Student(32);
        CollegeStudent collegeStudent = new CollegeStudent(34, 1);
        System.out.println(Student.count + " " + CollegeStudent.count);
        // From this example we can see that Student.count and CollegeStudent.count
        // both are same. Hence, it is not inherited.

        System.out.println(CollegeStudent.getCount());
        // However, in case of function also same logic applies, but we can also say
        // to be inherited as at the end


    }
}

class CollegeStudent extends Student {

    private final int experience;

    CollegeStudent(int roll, int experience) {
        super(roll);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

//    @Override  // As static methods are not inherited, it's not possible to
    // override them.
    public static int getCount() {
        return count; // We can't access the static
    }

    static void currentStudent() {
//        System.out.println("The roll of current student is " + roll);
        // This is as usual we know, static methods being object-independent
        // can't use non-static properties.
    }
}
