package gr.aueb.cf.ch2;

import java.util.Scanner;

/** Converts a temperature
 *  from Fahrenheit to Celsius
 */
public class FahrenheitToCelsius {

    public static void main(String[] args) {

        int fahrDegrees = 0;
        int celsDegrees = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please input a temperature in Fahrenheit degrees");
        fahrDegrees = sc.nextInt();
        celsDegrees = 5 * (fahrDegrees - 32) / 9;

        System.out.printf("%d \u2109 are %d \u2103", fahrDegrees, celsDegrees);
    }
}
