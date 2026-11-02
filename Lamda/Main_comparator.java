package day12;

import java.util.Arrays;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class Main_comparator {
    public static void main(String[] args) {
        Student[] arr = {
            new Student("Arun", 80),
            new Student("Bala", 60),
            new Student("Charan", 90)
        };

        //Comparator<Student> rule =
            //(a, b) -> Integer.compare(a.marks, b.marks);

        Arrays.sort(arr, (a, b) -> Integer.compare(a.marks, b.marks));
        // for arraylist object: list.sort((a, b) -> Integer.compare(a.marks, b.marks)); 
        //for collections without specifiying type: Collections.sort(list, (a, b) -> Integer.compare(b.marks, a.marks));
        //for namesorting: list.sort((a, b) -> a.name.compareTo(b.name));

        for (Student s : arr) {
            System.out.println(s.name + " " + s.marks);
        }
    }
}