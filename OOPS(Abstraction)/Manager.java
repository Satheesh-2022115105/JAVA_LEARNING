package day9;

public class Manager extends  Person{
    int exp;

    public Manager(int exp) {
        this.exp = exp;
    }

    public Manager(int exp, String name, int age) {
        super(name, age);
        this.exp = exp;
    }
    
    void work(){
        System.out.println("I am working as a Manager");

    }
    void workexp(){
        System.out.println("I am working as a Manager with: "+exp+" years");
    }
    
}
