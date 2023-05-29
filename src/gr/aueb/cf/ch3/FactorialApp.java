package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Calculate the factorial of a number
 * User inputs the number
 */
public class FactorialApp {

    public static void main(String[] args) {

        int number = 0;
        int i = 1;
        long factorial = 1L;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please insert a number");
        number = sc.nextInt();

        while (i <= number){
            factorial *= i;
            i++;
        }
        System.out.printf("Number : %d, Factorial : %,d", number , factorial);




    }
}
