package gr.aueb.cf.ch3;

import java.util.Scanner;

/** Decides if the lights of a car will switch on
 * based on if its raining and simultaneously
 * applies minimum one of the following :
 * its dark or we are speeding (speed > 100)
 *
 */
public class LightsOnApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isRaining = false;
        boolean isDark = false;
        boolean isRunning = false;
        int speed = 0;
        boolean lightsOn = false;

        System.out.println("Please insert if its raining (true/false)");
        isRaining = in.nextBoolean();
        System.out.println("Please insert if its dark");
        isDark = in.nextBoolean();
        System.out.println("Please insert car's speed");
        speed = in.nextInt();

        isRunning = (speed > 100);
        lightsOn = isRaining && (isDark || isRunning);

        System.out.println("Lights ON :" + lightsOn);


    }
}
