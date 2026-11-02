package day2;

public class Integer_fns {
    public static void main(String[] args) {
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;

        System.out.println(max);
        System.out.println(min);

        System.out.println(Integer.compare(10,10));
        System.out.println(Integer.compare(10,11));

        int a= Integer.parseInt("123");
        String b=Integer.toString(a);

        System.out.println(a);
        System.out.println(b);

        int c=Integer.reverse(3);
        System.out.println(c);
        int d=Integer.reverseBytes(7);
        System.out.println(d);

    }
}
