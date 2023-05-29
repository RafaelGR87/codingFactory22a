package gr.aueb.cf.ch2;

import java.util.Scanner;

/** user enters 3 integers representing
 *  day, month and year
 *  and the outcome is a date
 *  with format DD/MM/YY
 */
public class DateOutput {
    public static void main(String[] args) {

        int day = 0;
        int month = 0;
        int year =0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please input day then month and year");
        day = sc.nextInt();
        month = sc.nextInt();
        year = sc.nextInt();

        System.out.printf("Date is : %02d/%02d/%02d", day, month, year%100);
    }
}
