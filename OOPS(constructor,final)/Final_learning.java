package day6;

public class Final_learning {
    public static void main(String[] args) {
        //final variable should be initialised while declaring itself 
        final int price=500;
        //price+=200;(final varaible cannot be modified for primitive data type)
        final Integer a= 20;
        //a+=10; (Wrapper class cannot be modified)
        System.out.println(a);

        //
        final Teacher t1=new Teacher("YOGI",101);
        //can be modified (changes within it allowed)
        t1.name="BoGi";
        
        System.out.println(t1.name);

        //assign to new object not applicable
        //t1=new  Teacher("LoGi",102);
        Teacher A;
        for(int i=0;i<1000000;i++){
            A=new Teacher("BOGI",102);
        }

    }
}
class Teacher{
    String name;
    int  id;
    Teacher(String name,int id){
        this.name=name;
        this.id=id;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object destroyed");
    }
    
}
