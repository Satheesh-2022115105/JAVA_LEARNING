package day14;

public class Student {
    String name;
    int age;
    int[] marks;

    public Student(String name, int age, int[] marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    // Copy constructor: shallow copy
    public Student(Student other) {
        this.name = other.name;   // Copy String reference
        this.age = other.age;     // Copy primitive value
        this.marks = other.marks; // Copy array reference
        //this.marks = other.marks.clone();//Deep copy  Create a separate array
    }
}