package gr.aueb.cf.ch4;

import java.util.Scanner;

/*
    Adds and muls n first integers
    user inputs n
 */
public class AddMullApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n;
        int sum = 0;
        int result = 1;

        System.out.println("Please insert a number");
        n = in.nextInt();

        for (int i = 1 ; i <= n ; i++){
            sum += i;
            result *= i;
        }

        System.out.printf(" Sum : %d , Mul : %,d", sum, result);
    }
}
