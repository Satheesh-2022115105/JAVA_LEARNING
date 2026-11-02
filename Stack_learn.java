
package day15;

import java.util.*;

public class Stack_learn {

    public static void main(String[] args) {

        // Creating Stack
        Stack<Integer> stack = new Stack<>();

        // push() - adds elements to top
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack);

        // peek() - returns top element
        System.out.println(stack.peek());

        // pop() - removes top element
        System.out.println(stack.pop());
        System.out.println(stack);

        // push() again
        stack.push(50);
        System.out.println(stack);

        // empty() - checks whether stack is empty
        System.out.println(stack.empty());

        // search() - returns position from top (starts from 1)
        System.out.println(stack.search(20));

        // contains() - checks element exists
        System.out.println(stack.contains(30));

        // size() - number of elements
        System.out.println(stack.size());

        // get() - retrieves element using index
        System.out.println(stack.get(0));

        // remove() - removes element using index
        System.out.println(stack.remove(1));

        System.out.println(stack);

        // Traversing using enhanced for loop
        for (int num : stack) {
            System.out.println(num);
        }

        // Traversing using Iterator
        Iterator<Integer> it = stack.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // clear() - removes all elements
        stack.clear();

        System.out.println(stack);
        System.out.println(stack.empty());
    }
}
