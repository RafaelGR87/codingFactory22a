package gr.aueb.cf.ch8;

import java.util.Scanner;

public class ArithmeticExceptionApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numinator = 0;
        int denominator = 0;
        int result = 0;
        while (true) {
          try {
                System.out.println("Give two numbers");
                numinator = in.nextInt();
                denominator = in.nextInt();

                result = numinator / denominator;
                System.out.println("Result : " + result);
            } catch (ArithmeticException e) {
                e.printStackTrace();
                break;
           }
        }
        System.out.println("Thanks");
    }
}
