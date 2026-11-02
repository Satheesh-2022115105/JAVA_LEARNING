package day3;

 public class decimal_to_bin_oct_hex {

    public static void main(String[] args) {

        int decimal = 100;

        // Decimal → Binary
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary: " + binary);

        // Decimal → Octal
        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal: " + octal);

        // Decimal → Hexadecimal
        String hex = Integer.toHexString(decimal);
        System.out.println("Hexadecimal: " + hex);


        // Binary → Decimal
        int fromBinary = Integer.parseInt("100", 2);
        System.out.println("Binary to Decimal: " + fromBinary);

        // Octal → Decimal
        int fromOctal = Integer.parseInt("14", 8);
        System.out.println("Octal to Decimal: " + fromOctal);

        // Hexadecimal → Decimal
        int fromHex = Integer.parseInt("1A", 16);
        System.out.println("Hexadecimal to Decimal: " + fromHex);
    }
} 
