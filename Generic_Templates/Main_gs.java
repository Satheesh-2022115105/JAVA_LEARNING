package day11;

public class Main_gs {
    public static void main(String[] args) {
        Generic_stack<Integer> gs=new Generic_stack<>();
        gs.push(7);
        gs.push(8);
        gs.push(5);
        gs.push(11);
        gs.push(21);
        System.out.println(gs);
        System.out.println("Removed Element from stack is: "+gs.pop());
        System.out.println("Peek element is:  "+gs.peek());
        System.out.println(gs);

        Generic_stack<String> gs1=new Generic_stack<>();
        gs1.push("Apple");
        gs1.push("Orange");
        gs1.push("Mango");
        gs1.push("Banana");
        gs1.push("Guava"); 
        System.out.println(gs1);
        System.out.println("Removed Element from stack is: "+gs1.pop());
        System.out.println("Peek element is:  "+gs1.peek());

    }
    
}
