
package day13;

// Interface: an enum can implement an interface
interface Display {
    void show();
}

// Enum type
// Enum constants are implicitly public static final.
// An enum cannot extend another class because it already
// extends java.lang.Enum. Java does not support multiple class inheritance.
// But an enum CAN implement one or more interfaces.
enum Day implements Display {

    // These are the enum constants
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    // Enum constructor
    Day() {
        System.out.println("Constructor called for " + this);
    }

    // Implementing the interface method
    @Override
    public void show() {
        System.out.println("Today is " + this);
    }
}

public class EnumLearn {
    public static void main(String[] args) {

        System.out.println("Inside main method");

        // First active use of Day initializes the enum.
        // Java calls the constructor once for EVERY constant,
        // not just MONDAY. This happens only once per class loader.
        Day d = Day.MONDAY;

        System.out.println("Selected day: " + d);

        // 1. values() returns an array containing all enum constants
        System.out.println("\nAll days:");
        for (Day day : Day.values()) {
            System.out.println(day);
        }

        // 2. ordinal() returns the zero-based position of a constant
        // MONDAY = 0, TUESDAY = 1, WEDNESDAY = 2, and so on.
        System.out.println("\nOrdinal of FRIDAY: " + Day.FRIDAY.ordinal());

        // 3. valueOf() converts an exact name String into an enum constant
        Day selected = Day.valueOf("SUNDAY");
        System.out.println("\nValue returned by valueOf: " + selected);

        // 4. Calling the interface method
        // The enum implements Display, so it can use show().
        selected.show();

        // Example of inheritance restriction:
        // enum Day cannot extend another class such as Animal.
        // This is invalid:
        // enum Day extends Animal { MONDAY, TUESDAY }
    }
}
