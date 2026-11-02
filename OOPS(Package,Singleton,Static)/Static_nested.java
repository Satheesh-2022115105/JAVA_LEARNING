package day7;

//outerclass cannot be static it is error
public class Static_nested {
    //only inner can be static
    static class Test {
         String name;
        public Test(String name) {
            this.name = name;
        }

        
    }
    //Test1 cannot be reference from static  method so it should be like Test or it should outside from current class
    /*class Test1{
        static String name;
        public Test1(String name){
            Test1.name=name;
        }
    }*/

    public static void main(String[] args) {
        Test a = new Test("Kunal");
        Test b = new Test("Rahul");
        

       System.out.println(a.name);
       System.out.println(b.name);

        Test1 a1 = new Test1("Kunal");
        Test1 b1 = new Test1("Rahul");
        System.out.println(a1.name);
        System.out.println(b1.name);
    }
}

//like this should be declared outside
class Test1{
        String name;
        public Test1(String name){
            this.name=name;
        }
    }
