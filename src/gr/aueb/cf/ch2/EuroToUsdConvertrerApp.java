package gr.aueb.cf.ch2;

import java.util.Scanner;

/** Coverts Euros to us dollars
 *
 */
public class EuroToUsdConvertrerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputEuros = 0;
        int totalUsaCents = 0;
        int usaDollars = 0;
        int usaCents = 0;
        final int PARITY = 108;

        System.out.println("Please insert an amount (in Euros)");
        inputEuros = scanner.nextInt();

        totalUsaCents = inputEuros * PARITY;
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;

        System.out.printf("%d Euros = %d USA dollars, %d USA cents",inputEuros, usaDollars, usaCents);
    }
}
