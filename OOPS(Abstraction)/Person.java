package day9;

public abstract class Person {
    String name;
    int age;

    public Person() {
    }
    
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    abstract void work();
    abstract void workexp();
    
}
