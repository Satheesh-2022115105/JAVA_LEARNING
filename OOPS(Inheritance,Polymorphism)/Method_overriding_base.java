package day8;
public class Method_overriding_base {
    static void print(){
        System.out.println("This is base class");
    }
    
}
class Derived extends Method_overriding_base{
    //@Override 
     static void print(){
        System.out.println("This is derived class");
    }

}
