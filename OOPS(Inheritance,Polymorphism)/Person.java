package day8;
public class Person {
    String name;
    void showname(){
        System.out.println("My name is: "+name);
    }
}
class Student extends Person{
    int rollno;
    void showrollno(){
        System.out.println("Rollno is: "+rollno);
    }
}
class Department extends Student{
    String department;
    void showdepartment(){
        System.out.println("Department is: "+department);
    }
}
