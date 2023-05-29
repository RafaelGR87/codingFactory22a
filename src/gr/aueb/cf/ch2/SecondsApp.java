package gr.aueb.cf.ch2;

import java.util.Locale;
import java.util.Scanner;

public class SecondsApp {

    /** Reads hours, mins, secs
     * and converts to seconds
     */

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int inputHours = 0;
        int inputMinutes = 0;
        int inputSeconds = 0;
        int totalSecs = 0;
        final int SECONDS_PER_HOUR = 3600;
        final int SECONDS_PER_MINUTE = 60;

        System.out.println("Please insert hours, minutes and seconds");
        inputHours = in.nextInt();
        inputMinutes = in.nextInt();
        inputSeconds = in.nextInt();

        totalSecs = inputHours * SECONDS_PER_HOUR + inputMinutes * SECONDS_PER_MINUTE + inputSeconds;

        System.out.printf(Locale.forLanguageTag("el"),"%d hours, %d minutes, %d sexonds = %,d seconds", inputHours, inputMinutes, inputSeconds, totalSecs);

    }
}
