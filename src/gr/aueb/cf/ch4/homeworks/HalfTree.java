package gr.aueb.cf.ch4.homeworks;

import java.util.Scanner;

/*
Prints a number of stars.
1 in the first line, +1 in the second...etc
up to the nth line. User inputs n
Resembles a half tree
 */
public class HalfTree {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = 0;

        System.out.println("Please input a number :");
        n = in.nextInt();

        while (n < 0) {
            System.out.println("Please input a positive number :");
            n = in.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                if (j == i) {
                    System.out.println();
                }
            }
        }
    }
}