package day13;
public class Throwcatch {
    public static void main (String[] args) {
        int age=11;
        try{
            if(age<18){
            throw new  Exception("Not eligible for voting");
            }
        }   
        catch(Exception e){
            System.out.println(e.getMessage());

        }
    }
}
