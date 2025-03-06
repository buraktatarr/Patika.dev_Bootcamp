package CodingBasics;

public class TernaryOperatorBasics {
    public static void main(String[] args) {

        // Example variable: person's age
        int age = 20;

        /**
         * Using if-else:
         * The 'if-else' statement is ideal when you have more complex conditions
         * or need to perform multiple actions.
         *
         * It is more readable when the condition involves multiple statements
         * or when the actions inside each block are more complex.
         *
         * Example: Checking if someone is an adult.
         */

        String messageIfElse;
        if (age >= 18) {
            // If age is 18 or more, the person is an adult
            messageIfElse = "You are an adult.";
        } else {
            // If age is less than 18, the person is not an adult
            messageIfElse = "You are not an adult yet.";
        }
        System.out.println("If-Else Result: " + messageIfElse); // Output: You are an adult.


        /**
         * Using Ternary Operator:
         * The ternary operator is ideal for simpler,
         * single-condition checks where you want to assign a value based on a condition.
         * It is more compact and concise but should be avoided for complex conditions or multiple actions.
         *
         * Example: Checking if someone is an adult with a concise one-line syntax.
         */

        String messageTernary = (age >= 18) ? "You are an adult." : "You are not an adult yet.";

        System.out.println("Ternary Result: " + messageTernary); // Output: You are an adult.
    }
}
