
package day15;

import java.util.*;

public class Treeset_learn {
    public static void main(String[] args) {

        // Creating TreeSet
        TreeSet<Integer> set = new TreeSet<>();//with in paranthesis if u put Collections.reverseOrder() then it will be descending set


        // add(value) - adds elements
        set.add(12);
        set.add(3);
        set.add(11);
        set.add(14);
        set.add(7);
        set.add(12); // duplicates not allowed

        // Automatically maintains ascending order
        System.out.println(set);

        // add(value) - returns false for duplicates
        System.out.println(set.add(12));
        System.out.println(set.add(20));

        // remove(value) - removes an element
        System.out.println(set.remove(11));
        System.out.println(set);

        // contains(value) - checks element exists
        System.out.println(set.contains(12));

        // size() - number of elements
        System.out.println(set.size());

        // isEmpty() - checks whether empty
        System.out.println(set.isEmpty());

        // first() - returns smallest element
        System.out.println(set.first());

        // last() - returns largest element
        System.out.println(set.last());

        // higher(value) - smallest element greater than given value
        System.out.println(set.higher(12));

        // lower(value) - largest element smaller than given value
        System.out.println(set.lower(12));

        // ceiling(value) - smallest element greater than or equal to value
        System.out.println(set.ceiling(12));

        // floor(value) - largest element smaller than or equal to value
        System.out.println(set.floor(12));

        // pollFirst() - retrieves and removes smallest element
        System.out.println(set.pollFirst());
        System.out.println(set);

        // pollLast() - retrieves and removes largest element
        System.out.println(set.pollLast());
        System.out.println(set);

        // descendingSet() - returns elements in descending order
        System.out.println(set.descendingSet());

        // headSet(value) - elements smaller than given value
        System.out.println(set.headSet(12));

        // tailSet(value) - elements greater than or equal to given value
        System.out.println(set.tailSet(12));

        // subSet(from, to) - elements from starting value to ending value
        // starting value included, ending value excluded
        System.out.println(set.subSet(3, 14));

        // Traversing using enhanced for loop
        for (int num : set) {
            System.out.println(num);
        }

        // Traversing using Iterator
        Iterator<Integer> it = set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Traversing in descending order
        Iterator<Integer> desc = set.descendingIterator();

        while (desc.hasNext()) {
            System.out.println(desc.next());
        }

        // forEach using lambda
        set.forEach(num -> System.out.println(num));

        // clear() - removes all elements
        set.clear();

        System.out.println(set);
        System.out.println(set.isEmpty());
    }
}
