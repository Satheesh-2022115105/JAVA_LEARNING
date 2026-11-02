
package day15;

import java.util.*;

public class Hashmap_learn {

    public static void main(String[] args) {

        // Creating HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // put(key, value) - adds key-value pairs
        map.put(101, "Arun");
        map.put(102, "Vijay");
        map.put(103, "Ajay");
        map.put(104, "Kumar");

        // Duplicate key - old value gets replaced
        map.put(101, "Rahul");

        System.out.println(map);

        // get(key) - retrieves value using key
        System.out.println(map.get(101));

        // getOrDefault(key, defaultValue)
        System.out.println(map.getOrDefault(105, "Not Found"));

        // containsKey(key) - checks whether key exists
        System.out.println(map.containsKey(102));

        // containsValue(value) - checks whether value exists
        System.out.println(map.containsValue("Ajay"));

        // size() - number of key-value pairs
        System.out.println(map.size());

        // isEmpty() - checks whether map is empty
        System.out.println(map.isEmpty());

        // remove(key) - removes key and its value
        System.out.println(map.remove(103));

        System.out.println(map);

        // remove(key, value) - removes only if both match
        System.out.println(map.remove(102, "Vijay"));

        System.out.println(map);

        // replace(key, value) - replaces existing value
        map.replace(104, "Suresh");

        System.out.println(map);

        // putIfAbsent(key, value) - adds only if key is absent
        map.putIfAbsent(105, "Karthik");

        System.out.println(map);

        // keySet() - returns all keys
        System.out.println(map.keySet());

        // values() - returns all values
        System.out.println(map.values());

        // entrySet() - returns all key-value pairs
        System.out.println(map.entrySet());

        // Traversing using keySet()
        for (Integer key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }

        // Traversing using entrySet()
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // forEach using lambda
        map.forEach((key, value) ->
            System.out.println(key + " " + value)
        );

        // clear() - removes all entries
        map.clear();

        System.out.println(map);

        System.out.println(map.isEmpty());
        //sorting should be done via putting into list or treeMap for key
        /*
        HashMap<Integer, String> map = new HashMap<>();

        map.put(103, "Ajay");
        map.put(101, "Arun");
        map.put(102, "Vijay");

        TreeMap<Integer, String> sorted = new TreeMap<>(map);//desc new TreeMap<>(Collections.reverseOrder());

        System.out.println(sorted);
         */

        //sorting for values
        /*

        ArrayList<Map.Entry<Integer, String>> list =new ArrayList<>(map.entrySet());

        list.sort(Map.Entry.comparingByValue());

        System.out.println(list);

         */
    }
}
