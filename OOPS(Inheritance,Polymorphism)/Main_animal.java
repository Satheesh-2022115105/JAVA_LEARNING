package day8;

public class Main_animal{
    public static void main(String[] args){
        Dog d=new Dog();
        d.name="Tommy";
        System.out.println(d.name);
        d.sound();
        Cat c=new Cat();
        c.name="Yummy";
        System.out.println(d.name);
        System.out.println(c.name);
       
        c.sound();
        
    }
}
