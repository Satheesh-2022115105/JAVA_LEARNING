
package day15;

import java.util.*;

public class Letter_frequency {

    public static void main(String[] args) {

        String str = "bananaapple";

        // Step 1: Count character frequency
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.println(map);

        // Step 2: Convert HashMap entries into ArrayList
        ArrayList<Map.Entry<Character, Integer>> list =
            new ArrayList<>(map.entrySet());

        // Step 3: Sort by frequency descending
        // If frequency is same, sort character ascending
        list.sort((a, b) -> {

            if (!a.getValue().equals(b.getValue())) {
                return b.getValue() - a.getValue();
            }

            return a.getKey() - b.getKey();
        });

        // Step 4: Print sorted result
        for (Map.Entry<Character, Integer> entry : list) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
