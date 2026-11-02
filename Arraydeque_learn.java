
package day15;

import java.util.*;

public class Arraydeque_learn {

    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();

        // 1. addFirst() - adds at beginning
        dq.addFirst(20);
        dq.addFirst(10);

        // 2. addLast() - adds at end
        dq.addLast(30);
        dq.addLast(40);

        System.out.println(dq);

        // 3. offerFirst() - adds at beginning
        dq.offerFirst(5);

        // 4. offerLast() - adds at end
        dq.offerLast(50);

        System.out.println(dq);

        // 5. add() - adds at end
        dq.add(60);

        // 6. offer() - adds at end
        dq.offer(70);

        // 7. getFirst() - returns first element
        System.out.println(dq.getFirst());

        // 8. getLast() - returns last element
        System.out.println(dq.getLast());

        // 9. peekFirst() - returns first without removing
        System.out.println(dq.peekFirst());

        // 10. peekLast() - returns last without removing
        System.out.println(dq.peekLast());

        // 11. removeFirst() - removes first
        System.out.println(dq.removeFirst());

        // 12. removeLast() - removes last
        System.out.println(dq.removeLast());

        // 13. pollFirst() - removes first; null if empty
        System.out.println(dq.pollFirst());

        // 14. pollLast() - removes last; null if empty
        System.out.println(dq.pollLast());

        // 15. push() - adds at beginning (Stack)
        dq.push(100);
        dq.push(200);

        // 16. pop() - removes first (Stack)
        System.out.println(dq.pop());

        // 17. contains() - checks element
        System.out.println(dq.contains(30));

        // 18. remove(Object) - removes element
        dq.remove(Integer.valueOf(30));

        // 19. removeFirstOccurrence()
        dq.addLast(10);
        dq.addLast(10);
        dq.removeFirstOccurrence(10);

        // 20. removeLastOccurrence()
        dq.removeLastOccurrence(10);

        // 21. size()
        System.out.println(dq.size());

        // 22. isEmpty()
        System.out.println(dq.isEmpty());

        // 23. iterator() - forward traversal
        Iterator<Integer> itr = dq.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // 24. descendingIterator() - reverse traversal
        Iterator<Integer> ditr = dq.descendingIterator();

        while (ditr.hasNext()) {
            System.out.println(ditr.next());
        }

        // 25. toArray() - converts to array
        Object[] arr = dq.toArray();

        System.out.println(Arrays.toString(arr));

        // 26. addAll() - adds another collection
        ArrayDeque<Integer> other = new ArrayDeque<>();

        other.add(80);
        other.add(90);

        dq.addAll(other);

        System.out.println(dq);

        // 27. clear() - removes all elements
        dq.clear();

        System.out.println(dq.isEmpty());
    }
}
