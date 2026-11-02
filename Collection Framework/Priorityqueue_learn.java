package day15;

import java.util.*;

public class Priorityqueue_learn {

    public static void main(String[] args) {

        // Creating PriorityQueue in ascending order
        PriorityQueue<Integer> pq =
                new PriorityQueue<>();//by default asc if we add collection.reverseorder it will be desc

        // 1. add()
        pq.add(30);
        pq.add(10);
        pq.add(50);

        // 2. offer()
        pq.offer(20);
        pq.offer(5);

        // 3. peek() - returns small element
        System.out.println("Peek: " + pq.peek());

        // 4. element()
        System.out.println("Element: " + pq.element());

        // 5. contains()
        System.out.println("Contains 30: " + pq.contains(30));

        // 6. size()
        System.out.println("Size: " + pq.size());

        // 7. isEmpty()
        System.out.println("Empty: " + pq.isEmpty());

        // 8. remove() - removes small element
        System.out.println("Remove: " + pq.remove());

        // 9. poll() - removes small element
        System.out.println("Poll: " + pq.poll());

        // 10. Iterator traversal
        System.out.println("Iterator traversal:");

        Iterator<Integer> itr = pq.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // 11. Ascending priority order
        System.out.println("Ascending order:");

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

        // 12. clear()
        pq.clear();

        System.out.println("Empty: " + pq.isEmpty());
    }
}
