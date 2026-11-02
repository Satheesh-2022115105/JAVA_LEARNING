package day2;

public class Character_fns {

    public static void main(String[] args) {

        char ch = 'A';

        // 1. isLetter()
        System.out.println(Character.isLetter(ch));

        // 2. isDigit()
        System.out.println(Character.isDigit(ch));

        // 3. isLetterOrDigit()
        System.out.println(Character.isLetterOrDigit(ch));

        // 4. isUpperCase()
        System.out.println(Character.isUpperCase(ch));

        // 5. isLowerCase()
        System.out.println(Character.isLowerCase(ch));

        // 6. toUpperCase()
        System.out.println(Character.toUpperCase('a'));

        // 7. toLowerCase()
        System.out.println(Character.toLowerCase('A'));

        // 8. isWhitespace()
        System.out.println(Character.isWhitespace(' '));

        // 9. isSpaceChar()
        System.out.println(Character.isSpaceChar(' '));

        // 10. digit()
        System.out.println(Character.digit('7', 10));
        System.out.println(Character.digit('A', 16));

        // 11. forDigit()
        System.out.println(Character.forDigit(7, 10));

        // 12. compare()
        System.out.println(Character.compare('A', 'B'));

        // 13. toString()
        System.out.println(Character.toString('A'));

        // 14. getNumericValue()
        System.out.println(Character.getNumericValue('5'));
    }
}