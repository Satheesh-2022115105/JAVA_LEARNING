package day7;

public class Static_block_learning {

    static int a=5;
    static int b;
    static  {
        System.out.println("I am in static block");
        b=a*4;
    }
    static {
        a=b*2;
        
    }

    public static void main(String[] args) {
        System.out.println("im outside ");
        Static_block_learning obj=new Static_block_learning();
        System.out.println(a+" "+b);//with in same class no need for classname before a and b using .operator
        b+=3;
        Static_block_learning obj1=new Static_block_learning();
        System.out.println(a+" "+b);


    }
}
