package CodingBasics;

public class SwappingNumbers {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        System.out.println("a:" + a + " - "  + "b:" + b);

        int temp = a;
        a = b;

        System.out.println("a:" + a + " - "  + "b:" + b);


        b = temp;

        System.out.println("a:" + a + " - "  + "b:" + b);

    }
}
