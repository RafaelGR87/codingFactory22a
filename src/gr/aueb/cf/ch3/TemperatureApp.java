package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Decides if its snowing
 * if temp<0 its snowing
 * user inputs temperature
 */
public class TemperatureApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean isSnowning = false;
        int temp = 0;

        System.out.println("Please insert current temperature");
        temp = in.nextInt();

        isSnowning = (temp < 0);

        System.out.println("Is snowing: " + isSnowning);

    }
}
