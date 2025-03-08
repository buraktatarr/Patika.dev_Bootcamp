package CodingBasics;

import java.util.Scanner;

public class DoWhileBasics {
    public static void main(String[] args) {
        /***
         * What is a Do-While loop?
         * A Do-While loop ensures that a block of code executes at least once before checking the condition.
         * This is useful when you want to perform an action and then decide whether to repeat it based on user input or a specific condition.
         ***/

        Scanner scanner = new Scanner(System.in);
        String answer;

        /***
         * Step 1: The loop starts by executing the code inside the "do" block.
         * Step 2: After the first execution, the condition in "while" is checked.
         * Step 3: If the condition is true, the loop runs again; otherwise, it stops.
         ***/

        do {
            // Asking user a question
            System.out.println("Do you want to continue? (yes/no)");
            answer = scanner.nextLine();

            /***
             * If the user enters "yes", the loop will run again.
             * If the user enters "no", the loop will stop.
             ***/

        } while (answer.equalsIgnoreCase("yes"));

        /***
         * When the user types "no", the loop exits, and this final message is printed.
         ***/
        System.out.println("Loop ended. Thank you!");

        scanner.close();
    }
}
