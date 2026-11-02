package day15;
import java.util.*;
public class Arraylist_learn {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(12);
        arr.add(3);
        arr.add(11);
        arr.add(14);
        arr.add(4,7);
        System.out.println(arr);
        arr.set(2,9);
        System.out.println(arr);
        System.out.println(arr.get(2));
        System.out.println(arr.remove(1));
        System.out.println(arr);
        System.out.println(arr.remove(Integer.valueOf(14)));
        System.out.println(arr);
        System.out.println(arr.isEmpty());
        System.out.println(arr.size());
        System.out.println(arr.contains(12));
        //indexOf(value)	Returns first matching index	
        //lastIndexOf(value)	Returns last matching index
        //clear()	Removes all elements
        Collections.sort(arr);//list.sort(Comparator.naturalOrder());
        System.out.println(arr);
        //Collections.sort(arr,Collections.reverseOrder());//list.sort(Comparator.reverseOrder());
        arr.add(2);
        System.out.println(arr);
        Collections.reverse(arr);// reversing list
        System.out.println(arr);
    }
}
