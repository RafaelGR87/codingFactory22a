package gr.aueb.cf.ch3;

import java.util.Scanner;

/** Aircraft has 2 fuel tanks
 * if one has less than 1/4 then shows orange signal
 * if both of them have less than 1/4 then it shows red signal
 * pilot (user) inputs true or false
 *
 */
public class OrangeRedSignalApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isTank1LessThanQuarter = false;
        boolean isTank2LessThanQuarter = false;
        boolean orangeOn = false;
        boolean redOn = false;

        System.out.println("Please insert if tank1 , tank2 are less than 1/4");
        isTank1LessThanQuarter = in.nextBoolean();
        isTank2LessThanQuarter = in.nextBoolean();

        orangeOn = isTank1LessThanQuarter || isTank2LessThanQuarter;
        redOn = isTank1LessThanQuarter && isTank2LessThanQuarter;

        System.out.println("Orange on:" + orangeOn);
        System.out.println("Red on:" + redOn);


    }
}
