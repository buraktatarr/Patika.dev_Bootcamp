package CodingBasics;

public class ForBasics {
    public static void main(String[] args) {
/***
 * What is a For loop?
 * A For loop allows the compiler to perform a repetitive task based on specified conditions instead of you doing it manually.
 *
 * Let's explain with an example:
 * for(int i = 0; i < 10; i++) is written as follows. Here:
 * - i is initialized to 0,
 * - The loop continues as long as i is less than 10,
 * - i increases by one in each iteration.
 *
 * This allows the computer to perform the incrementing instead of me doing it manually.
 * When we run System.out.println(i);, the output will be: 0,1,2,3,4...9 displayed on the screen.
 *
 * Let me show you as a script down below;
 ***/

        for (int i = 0; i < 10; i++) {
            System.out.println(i);

        }

/***
 * Also we can do such things like;
 *
 * for(i=0; i<100; i+=10)
 * In this code i variable will increase by 10.
 *
 * Also, you can make it go down from 100 to zero by i-- or i-=(X) Note: x is a variable.
 *
 * Let's see down below;
  */
        for (int i = 0; i < 100; i+=10) {
            System.out.println(i);

        }

        for (int i = 100; i > 0; i-=10) {
            System.out.println(i);

        }
/**
 * As far, we learned a lot of basics about "for" loop!
 * Thanks for reading, goodbye!
 */


    }
}
