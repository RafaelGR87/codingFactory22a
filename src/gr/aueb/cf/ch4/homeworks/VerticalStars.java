package gr.aueb.cf.ch4.homeworks;

import java.util.Scanner;

/*
Prints n vertical stars
user inputs n
 */
public class VerticalStars {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = 0;

        System.out.println("Please input a number :");
        n = in.nextInt();

        while (n < 0){
            System.out.println("Please input a positive number :");
            n = in.nextInt();
        }

        for (int i = 1 ; i <= n ; i++) {
            System.out.println("*");
        }
    }
}
