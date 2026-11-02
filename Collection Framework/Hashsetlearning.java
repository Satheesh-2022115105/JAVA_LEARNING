
package day15;

import java.util.*;

public class Hashsetlearning {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        // add(value) - adds an element
        set.add(12);
        set.add(3);
        set.add(11);
        set.add(14);
        set.add(12); // duplicates are not allowed

        System.out.println(set);

        // add(value) returns false if element already exists
        System.out.println(set.add(12));
        System.out.println(set.add(7));

        // remove(value) - removes an element
        System.out.println(set.remove(11));
        System.out.println(set);

        // contains(value) - checks whether element exists
        System.out.println(set.contains(12));
        System.out.println(set.contains(50));

        // size() - returns number of elements
        System.out.println(set.size());

        // isEmpty() - checks whether set is empty
        System.out.println(set.isEmpty());

        // Traversing using enhanced for loop
        for (int num : set) {
            System.out.println(num);
        }

        // Traversing using Iterator
        Iterator<Integer> it = set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // forEach() using lambda
        set.forEach(num -> System.out.println(num));

        // addAll() - adds all elements from another collection
        HashSet<Integer> set2 = new HashSet<>(
            Arrays.asList(20, 30, 40)
        );

        set.addAll(set2);
        System.out.println(set);

        // containsAll() - checks whether all elements exist
        System.out.println(set.containsAll(set2));

        // removeAll() - removes all matching elements
        set.removeAll(set2);
        System.out.println(set);

        // retainAll() - keeps only common elements
        HashSet<Integer> set3 = new HashSet<>(
            Arrays.asList(3, 7, 50, 60)
        );

        set.retainAll(set3);
        System.out.println(set);

        // clear() - removes all elements
        set.clear();
        System.out.println(set);

        // isEmpty() after clear
        System.out.println(set.isEmpty());

        //sorting not possible in set so it should converted to list to do  it
       // ArrayList<Integer> arr = new ArrayList<>(set);

        // Ascending order
       // Collections.sort(arr);

       // System.out.println(arr);
    }
}

