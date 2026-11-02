
package day13;

// Step 1: Create a custom checked exception by extending Exception
class InvalidAgeException extends Exception {

    // Step 2: Constructor receives the error message
    public InvalidAgeException(String message) {

        // Pass the message to the parent Exception class
        // so we can retrieve it later using getMessage()
        super(message);
    }
}

public class CustomException {

    public static void main(String[] args) {

        int age = 15;

        // Step 3: Put the code that may throw an exception inside try
        try {

            // Check whether the person is eligible to vote
            if (age < 18) {

                // Step 4: Create and throw our custom exception
                throw new InvalidAgeException(
                    "Not eligible for voting"
                );
            }

            // Executes only if age is 18 or above
            System.out.println("Eligible for voting");
        }

        // Step 5: Catch and handle our custom exception
        catch (InvalidAgeException e) {

            // Print the error message passed to the constructor
            System.out.println(e.getMessage());
        }
    }
}
