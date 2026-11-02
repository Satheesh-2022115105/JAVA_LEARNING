package day7;

public class Static_method_learning{
    public static void main(String[] args) {
        Static_method_learning.message();
        Static_method_learning s=new Static_method_learning();
        s.message1();
        Static_method_learning.message2();
    }
    static  void message(){
        System.out.println("Without Creating obj displayed");

    }
    void message1(){
        System.out.println("With creatinng obj from main displayed");
        message();//possible to call static fn from non_static
    }
    static void message2(){
        //message1();not possible to call like this .non-static method cannot called from  static
        //create obj to access non-static to access in static
        Static_method_learning s1=new Static_method_learning();
        s1.message1();
    }
}