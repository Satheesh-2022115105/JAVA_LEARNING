package day2;

public class String_fns {

    public static void main(String[] args) {

        String str = "Hello Java";
        String str2 = "hello java";

        // =========================================
        // 1. length()
        // =========================================

        System.out.println(str.length());


        // =========================================
        // 2. charAt()
        // =========================================

        System.out.println(str.charAt(0));
        System.out.println(str.charAt(6));


        // =========================================
        // 3. equals()
        // =========================================

        System.out.println(str.equals(str2));


        // =========================================
        // 4. equalsIgnoreCase()
        // =========================================

        System.out.println(str.equalsIgnoreCase(str2));


        // =========================================
        // 5. compareTo()
        // =========================================

        System.out.println(str.compareTo(str2));


        // =========================================
        // 6. compareToIgnoreCase()
        // =========================================

        System.out.println(str.compareToIgnoreCase(str2));


        // =========================================
        // 7. contains()
        // =========================================

        System.out.println(str.contains("Java"));
        System.out.println(str.contains("Python"));


        // =========================================
        // 8. startsWith()
        // =========================================

        System.out.println(str.startsWith("Hello"));


        // =========================================
        // 9. endsWith()
        // =========================================

        System.out.println(str.endsWith("Java"));


        // =========================================
        // 10. indexOf()
        // =========================================

        System.out.println(str.indexOf("Java"));
        System.out.println(str.indexOf('o'));


        // =========================================
        // 11. lastIndexOf()
        // =========================================

        String s = "banana";

        System.out.println(s.indexOf('a'));
        System.out.println(s.lastIndexOf('a'));


        // =========================================
        // 12. substring()
        // =========================================

        System.out.println(str.substring(6));
        System.out.println(str.substring(0, 5));


        // =========================================
        // 13. toUpperCase()
        // =========================================

        System.out.println(str.toUpperCase());


        // =========================================
        // 14. toLowerCase()
        // =========================================

        System.out.println(str.toLowerCase());


        // =========================================
        // 15. trim()
        // =========================================

        String space = "   Hello Java   ";

        System.out.println(space.trim());


        // =========================================
        // 16. strip()
        // =========================================

        System.out.println(space.strip());


        // =========================================
        // 17. replace()
        // =========================================

        System.out.println(str.replace("Java", "World"));


        // =========================================
        // 18. replaceAll()
        // =========================================

        String numbers = "Java123";

        System.out.println(numbers.replaceAll("[0-9]", ""));


        // =========================================
        // 19. replaceFirst()
        // =========================================

        String fruits = "apple apple apple";

        System.out.println(fruits.replaceFirst("apple", "mango"));


        // =========================================
        // 20. isEmpty()
        // =========================================

        String empty = "";

        System.out.println(empty.isEmpty());


        // =========================================
        // 21. isBlank()
        // =========================================

        String blank = "   ";

        System.out.println(blank.isBlank());


        // =========================================
        // 22. concat()
        // =========================================

        String a = "Hello ";
        String b = "World";

        System.out.println(a.concat(b));


        // =========================================
        // 23. join()
        // =========================================

        String result = String.join("-", "Java", "Python", "C++");

        System.out.println(result);


        // =========================================
        // 24. split()
        // =========================================

        String names = "Ram,Sam,John";

        String[] arr = names.split(",");

        for (String name : arr) {
            System.out.println(name);
        }


        // =========================================
        // 25. toCharArray()
        // =========================================

        char[] chars = str.toCharArray();

        for (char ch : chars) {
            System.out.println(ch);
        }


        // =========================================
        // 26. getBytes()
        // =========================================

        byte[] bytes = str.getBytes();

        for (byte value : bytes) {
            System.out.println(value);
        }


        // =========================================
        // 27. valueOf()
        // =========================================

        int num = 100;

        String numberString = String.valueOf(num);

        System.out.println(numberString);


        // =========================================
        // 28. format()
        // =========================================

        String message = String.format(
                "Name: %s, Age: %d",
                "Ram",
                20
        );

        System.out.println(message);


        // =========================================
        // 29. repeat()
        // =========================================

        System.out.println("Java ".repeat(3));


        // =========================================
        // 30. matches()
        // =========================================

        String digits = "12345";

        System.out.println(digits.matches("[0-9]+"));
    }
}