package gr.aueb.cf.ch3;

import java.util.Scanner;

/** Decides if its snowing
 *  based on temp and if its raining
 *
 */
public class SnowingApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isSnowing = false;
        boolean isRaining = false;
        int temp = 0;

        System.out.println("Please insert if its raining (true/false)");
        isRaining = in.nextBoolean();
        System.out.println("Please insert temperature");
        temp = in.nextInt();

        isSnowing = isRaining && (temp < 0);
        System.out.println("Is snowing :" + isSnowing);



    }
}
