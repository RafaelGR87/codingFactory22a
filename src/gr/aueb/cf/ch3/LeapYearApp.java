package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * User inputs a year (integer)
 * and the program returns if that year
 * is a leap year or not
 */
public class LeapYearApp {

    public static void main(String[] args) {

        int year = 0;
        boolean isLeap = false;
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter a year (integer)");
        year = in.nextInt();

        isLeap = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);

        if (isLeap){
            System.out.printf("The year %d IS a leap year", year);}
        else{
            System.out.printf("The year %d IS NOT a leap year", year);}
    }
}


