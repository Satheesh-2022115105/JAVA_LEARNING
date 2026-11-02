package day2;

public class Operators {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        // =================================
        // 1. ARITHMETIC OPERATORS
        // =================================

        System.out.println("ARITHMETIC");

        System.out.println(a + b);  // Addition
        System.out.println(a - b);  // Subtraction
        System.out.println(a * b);  // Multiplication
        System.out.println(a / b);  // Division
        System.out.println(a % b);  // Modulus


        // =================================
        // 2. RELATIONAL / COMPARISON
        // =================================

        System.out.println("\nRELATIONAL");

        System.out.println(a == b);  // Equal
        System.out.println(a != b);  // Not equal
        System.out.println(a > b);   // Greater than
        System.out.println(a < b);   // Less than
        System.out.println(a >= b);  // Greater than or equal
        System.out.println(a <= b);  // Less than or equal


        // =================================
        // 3. LOGICAL OPERATORS
        // =================================

        boolean x = true;
        boolean y = false;

        System.out.println("\nLOGICAL");

        System.out.println(x && y);  // AND
        System.out.println(x || y);  // OR
        System.out.println(!x);      // NOT


        // =================================
        // 4. ASSIGNMENT OPERATORS
        // =================================

        System.out.println("\nASSIGNMENT");

        int n = 10;

        n += 5;   // n = n + 5
        System.out.println(n);

        n -= 3;   // n = n - 3
        System.out.println(n);

        n *= 2;   // n = n * 2
        System.out.println(n);

        n /= 4;   // n = n / 4
        System.out.println(n);

        n %= 3;   // n = n % 3
        System.out.println(n);


        // =================================
        // 5. UNARY OPERATORS
        // =================================

        System.out.println("\nUNARY");

        int p = 5;

        System.out.println(+p);  // Positive
        System.out.println(-p);  // Negative

        p++;
        System.out.println(p);   // Increment

        p--;
        System.out.println(p);   // Decrement


        // =================================
        // 6. PRE-INCREMENT / POST-INCREMENT
        // =================================

        System.out.println("\nINCREMENT");

        int q = 5;

        System.out.println(++q); // Pre-increment
        System.out.println(q++); // Post-increment
        System.out.println(q);


        // =================================
        // 7. TERNARY OPERATOR
        // =================================

        System.out.println("\nTERNARY");

        int age = 20;

        String result = (age >= 18) ? "Adult" : "Minor";

        System.out.println(result);


        // =================================
        // 8. BITWISE OPERATORS
        // =================================

        System.out.println("\nBITWISE");

        int m = 5;
        int k = 3;

        System.out.println(m & k);  // AND
        System.out.println(m | k);  // OR
        System.out.println(m ^ k);  // XOR
        System.out.println(~m);     // NOT


        // =================================
        // 9. SHIFT OPERATORS
        // =================================

        System.out.println("\nSHIFT");

        System.out.println(m << 1);  // Left shift
        System.out.println(m >> 1);  // Right shift
        System.out.println(m >>> 1); // Unsigned right shift
    }
}
