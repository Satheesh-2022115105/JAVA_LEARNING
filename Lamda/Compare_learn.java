package day12;


import java.util.*;

public class Compare_learn {
    public static void main(String[] args) {

        int[] arr = {2, 1, 4, 5, 8};

        // Convert int[] to Integer[]
        Integer[] temp = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        // Sort in descending order using lambda
        Arrays.sort(temp, (a, b) -> Integer.compare(b, a));

        // Convert Integer[] back to int[]
        arr = Arrays.stream(temp).mapToInt(Integer::intValue).toArray();

        System.out.println(Arrays.toString(arr));
    }
}

