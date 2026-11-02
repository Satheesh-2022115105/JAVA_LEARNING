package day12;
import java.util.Arrays;

class Student implements Comparable<Student> {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.marks, other.marks);
    }
}

public class Main_comparable {
    public static void main(String[] args) {
        Student[] arr = {
            new Student("Arun", 80),
            new Student("Bala", 60),
            new Student("Charan", 90)
        };

        Arrays.sort(arr);

        for (Student s : arr) {
            System.out.println(s.name + " " + s.marks);
        }
    }
}