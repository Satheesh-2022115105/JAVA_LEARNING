package day13;
public class ThrowsExample {

    static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Not eligible for voting");
        }

        System.out.println("Eligible for voting");
    }

    public static void main(String[] args) {
      

        try {
            ThrowsExample.checkAge(11);
        }
        catch (Exception e) {
           System.out.println(e.getMessage());
        }
    }
}