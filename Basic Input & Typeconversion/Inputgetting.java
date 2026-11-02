package day.day1;

import java.util.*;

public class Inputgetting{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        System.out.println("Sum is:"+(a+b));

        String str1=sc.next();
        String str2= sc.next();
        sc.nextLine();
        String str3=sc.nextLine();

        System.out.println(str1+" "+str2);
        System.out.println(str3);
    }
    
}
