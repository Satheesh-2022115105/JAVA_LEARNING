
package day15;

import java.util.*;

public class Linkedlist_learn {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        // 1. add() - adds at end
        list.add(10);
        list.add(20);
        list.add(30);

        // 2. add(index,element) - adds at index
        list.add(1, 15);

        System.out.println(list);

        // 3. addFirst() - adds at beginning
        list.addFirst(5);

        // 4. addLast() - adds at end
        list.addLast(40);

        System.out.println(list);

        // 5. get() - retrieves element at index
        System.out.println(list.get(2));

        // 6. getFirst() - retrieves first element
        System.out.println(list.getFirst());

        // 7. getLast() - retrieves last element
        System.out.println(list.getLast());

        // 8. set() - replaces element at index
        list.set(2, 100);

        System.out.println(list);

        // 9. remove(index) - removes element at index
        list.remove(2);

        // 10. remove(Object) - removes element by value
        list.remove(Integer.valueOf(20));

        // 11. removeFirst() - removes first element
        System.out.println(list.removeFirst());

        // 12. removeLast() - removes last element
        System.out.println(list.removeLast());

        System.out.println(list);

        // 13. offerFirst() - adds at beginning
        list.offerFirst(1);

        // 14. offerLast() - adds at end
        list.offerLast(50);

        // 15. offer() - adds at end
        list.offer(60);

        System.out.println(list);

        // 16. peekFirst() - returns first without removing
        System.out.println(list.peekFirst());

        // 17. peekLast() - returns last without removing
        System.out.println(list.peekLast());

        // 18. peek() - returns first without removing
        System.out.println(list.peek());

        // 19. pollFirst() - removes first; null if empty
        System.out.println(list.pollFirst());

        // 20. pollLast() - removes last; null if empty
        System.out.println(list.pollLast());

        // 21. poll() - removes first; null if empty
        System.out.println(list.poll());

        // 22. contains() - checks element
        System.out.println(list.contains(50));

        // 23. indexOf() - first occurrence index
        System.out.println(list.indexOf(60));

        // 24. lastIndexOf() - last occurrence index
        list.add(60);

        System.out.println(list.lastIndexOf(60));

        // 25. size()
        System.out.println(list.size());

        // 26. isEmpty()
        System.out.println(list.isEmpty());

        // 27. Iterator traversal
        Iterator<Integer> itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // 28. descendingIterator() - reverse traversal
        Iterator<Integer> ditr = list.descendingIterator();

        while (ditr.hasNext()) {
            System.out.println(ditr.next());
        }

        // 29. toArray()
        Object[] arr = list.toArray();

        System.out.println(Arrays.toString(arr));

        // 30. addAll() - adds another collection
        LinkedList<Integer> other = new LinkedList<>();

        other.add(70);
        other.add(80);

        list.addAll(other);

        System.out.println(list);

        // 31. clear() - removes all elements
        list.clear();

        System.out.println(list.isEmpty());
    }
}
