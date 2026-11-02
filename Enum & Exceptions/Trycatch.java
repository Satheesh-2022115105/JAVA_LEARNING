package day13;

public class Trycatch {
    public static void main(String[] args) {
        try {
            int a=10;
            int b=0;
            int[] arr={1,3,4};
            System.out.println(a/b);
            //only arithmetic occurs because it causes an exception and move to catch block below this does not works
            //you can use separate try-catch for this array or other exception
            System.out.println(arr[3]);
            
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("Arithmetic Catch block");
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println("Parent exception Catch block");
        }
        finally{
            System.out.println("I will always execute if exception occurs or not");
        }
        System.out.println("Program completed");
    }
    
}
