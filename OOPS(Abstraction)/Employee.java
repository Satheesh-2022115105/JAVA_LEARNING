package day9;
public class Employee extends Person{
    int exp;

    public Employee(int exp) {
        this.exp = exp;
    }

    public Employee(String name,int age,int exp){
        super(name,age);
        this.exp=exp;
    }
   
    
    @Override 
    void work(){
        System.out.println("I am working as an employee");
    }
    @Override 
    void workexp(){
        System.out.println("I am working as an employee for: " + exp+"years");
    }
    
}
