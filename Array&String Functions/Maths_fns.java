package day.day2;

public class Maths_fns{
    public static void main(String[] args) {
       int a=7;
       int b=11;
       double c=125.0;
       float d=24.396f;
       int n=-11;

       System.out.println("Absolute value of "+(b)+" is:"+Math.abs(n));
       System.out.println("Round value of "+(d)+ "is:"+Math.round(d));
       System.out.println("Floor value of "+(d)+ "is:"+Math.floor(d));
       System.out.println("Ceil value of "+(d)+ "is:"+Math.ceil(d));;
       System.out.println("MAX is:"+Math.max(a,b));
       System.out.println("MIN is:"+Math.min(a,b));
       System.out.println("Srt of 64 is: "+Math.sqrt(64));
       System.out.println("Cube root of 125 is: "+Math.cbrt(c));
       System.out.println("Power of (2,3) is:"+ Math.pow(2,3));
       System.out.println("Random number is:"+(int)Math.random()*10);
       System.out.println("Length of 123:"+ (int) (Math.log10(123)+1));
    }
}