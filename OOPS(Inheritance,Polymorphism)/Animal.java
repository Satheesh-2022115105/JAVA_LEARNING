package day8;

public class Animal {
    String name;
    
    void sound(){
        System.out.println("Animal is eating");
    }
}

 class Dog extends Animal{
    @Override 
   void sound(){
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal{
    @Override 
     void sound(){
        System.out.println("Cat meow");
    }
}


