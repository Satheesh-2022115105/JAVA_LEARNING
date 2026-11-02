package day11;

public class Main_cq {
    public static void main(String[] args) {
        Generic_cq<Integer> cq=new Generic_cq<>();
        cq.enqueue(3);
        cq.enqueue(23);
        cq.enqueue(13);
        cq.enqueue(33);
        System.out.println(cq);
        System.out.println(cq.dequeue());
        System.out.println(cq.dequeue());

    }
}
