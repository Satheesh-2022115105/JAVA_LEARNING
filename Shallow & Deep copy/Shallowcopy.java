package day14;

import java.util.Arrays;

public class Shallowcopy {
    public static void main(String[] args) {

        Student s1 = new Student(
            "Ajay", 21, new int[]{80, 90, 85}
        );

        // Create a separate Student object using the copy constructor
        Student s2 = new Student(s1);

        // Change primitive and String fields
        s2.name = "Vijay";
        s2.age = 22;

        // Change an element in the array through s2
        s2.marks[0] = 100;

        System.out.println(s1.name + " " + s1.age);
        System.out.println(s2.name + " " + s2.age);

        System.out.println(Arrays.toString(s1.marks));
        System.out.println(Arrays.toString(s2.marks));
    }
}