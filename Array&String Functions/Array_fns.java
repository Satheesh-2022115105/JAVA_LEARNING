package day2;

import java.util.Arrays;

public class Array_fns {

    public static void main(String[] args) {

        // =========================================
        // 1. length
        // =========================================

        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Length: " + arr.length);


        // =========================================
        // 2. Arrays.toString()
        // =========================================

        System.out.println("Array: " + Arrays.toString(arr));


        // =========================================
        // 3. Arrays.sort()
        // =========================================

        int[] sortArr = {50, 10, 40, 20, 30};

        Arrays.sort(sortArr);

        System.out.println("Sorted: " + Arrays.toString(sortArr));


        // =========================================
        // 4. Arrays.equals()
        // =========================================

        int[] a = {10, 20, 30};
        int[] b = {10, 20, 30};

        System.out.println("Equals: " + Arrays.equals(a, b));


        // =========================================
        // 5. Arrays.copyOf()
        // =========================================

        int[] original = {10, 20, 30};

        int[] copy = Arrays.copyOf(original, original.length);

        System.out.println("Copy: " + Arrays.toString(copy));


        // Copy with larger size

        int[] biggerCopy = Arrays.copyOf(original, 5);

        System.out.println("Bigger Copy: "
                + Arrays.toString(biggerCopy));


        // =========================================
        // 6. Arrays.copyOfRange()
        // =========================================

        int[] range = {10, 20, 30, 40, 50};

        int[] part = Arrays.copyOfRange(range, 1, 4);

        System.out.println("Range Copy: "
                + Arrays.toString(part));


        // =========================================
        // 7. Arrays.fill()
        // =========================================

        int[] fillArr = new int[5];

        Arrays.fill(fillArr, 100);

        System.out.println("Filled: "
                + Arrays.toString(fillArr));


        // =========================================
        // 8. Arrays.binarySearch()
        // =========================================

        int[] searchArr = {10, 20, 30, 40, 50};

        int index = Arrays.binarySearch(searchArr, 30);

        System.out.println("Index of 30: " + index);


        // =========================================
        // 9. Arrays.deepToString()
        // =========================================

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println("2D Array: "
                + Arrays.deepToString(matrix));


        // =========================================
        // 10. Arrays.deepEquals()
        // =========================================

        int[][] matrix1 = {
            {1, 2},
            {3, 4}
        };

        int[][] matrix2 = {
            {1, 2},
            {3, 4}
        };

        System.out.println("Deep Equals: "
                + Arrays.deepEquals(matrix1, matrix2));


        // =========================================
        // 11. Arrays.compare()
        // =========================================

        int[] c = {10, 20, 30};
        int[] d = {10, 20, 40};

        System.out.println("Compare: "
                + Arrays.compare(c, d));


        // =========================================
        // 12. Arrays.mismatch()
        // =========================================

        int[] e = {10, 20, 30, 40};
        int[] f = {10, 20, 99, 40};

        System.out.println("Mismatch index: "
                + Arrays.mismatch(e, f));
    }
}
