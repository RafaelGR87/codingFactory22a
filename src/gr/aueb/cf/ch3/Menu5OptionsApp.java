package gr.aueb.cf.ch3;

import java.util.Scanner;

/** Εμφανίζει μενου 5 επιλογών
 *  υπάρχει ανταποκριση μετα απο κάθε επιλογή
 *  και ελεγχος αν δωσουμε λαθος επιλογή
 */

public class Menu5OptionsApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int input = 0;
        boolean exit = false;

        do {
            System.out.println("1.Εισαγωγή");
            System.out.println("2.Διαγραφή");
            System.out.println("3.Ενημέρωση");
            System.out.println("4.Αναζήτηση");
            System.out.println("5.Έξοδος");
            System.out.println("Παρακαλώ επιλέξτε χρησιμοποιώντας αριθμο (1 έως 5)");
            input = in.nextInt();
            if ((input < 0) || (input > 5)) {
                System.out.println("Παρακαλώ εισάγετε κάποιον έγκυρο αριθμό (1 έως 5)\n");
            }
            else if (input == 1) {
                System.out.println("Επιλέξατε Εισαγωγή\n");
            }
            else if (input == 2) {
                System.out.println("Επιλέξατε Διαγραφή\n");
            }
            else if (input == 3) {
                System.out.println("Επιλέξατε Ενημέρωση\n");
            }
            else if (input == 4) {
                System.out.println("Επιλέξατε Αναζήτηση\n");
            }
            else if (input == 5) {
                System.out.println("Ευχαριστούμε");
                exit = true;
            }
        }while (!exit);
    }
}
