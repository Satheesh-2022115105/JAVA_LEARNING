
package day15;

import java.util.*;

public class Queue_learn {

    public static void main(String[] args) {

        // Creating Queue using LinkedList
        Queue<Integer> queue = new LinkedList<>();

        // offer() - inserts elements
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);

        System.out.println(queue);

        // add() - inserts element
        queue.add(50);
        System.out.println(queue);

        // peek() - returns front element
        System.out.println(queue.peek());

        // element() - returns front element
        System.out.println(queue.element());

        // poll() - removes front element
        System.out.println(queue.poll());
        System.out.println(queue);

        // remove() - removes front element
        System.out.println(queue.remove());
        System.out.println(queue);

        // size() - number of elements
        System.out.println(queue.size());

        // contains() - checks element exists
        System.out.println(queue.contains(30));

        // isEmpty() - checks whether queue is empty
        System.out.println(queue.isEmpty());

        // Traversing using enhanced for loop
        for (int num : queue) {
            System.out.println(num);
        }

        // Traversing using Iterator
        Iterator<Integer> it = queue.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // forEach using lambda
        queue.forEach(num -> System.out.println(num));

        // clear() - removes all elements
        queue.clear();

        System.out.println(queue);
        System.out.println(queue.isEmpty());
    }
}
]