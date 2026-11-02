package day11;

public class Main_gq {
    public static void main(String[] args) {
        Generic_queue<Integer> q=new Generic_queue<>();
        q.enqueue(5);
        q.enqueue(3);
        q.enqueue(7);
        q.enqueue(2);
        System.out.println(q);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        //System.out.println(q.dequeue());
        //System.out.println(q.dequeue());
        //System.out.println(q);
    }
    
}
