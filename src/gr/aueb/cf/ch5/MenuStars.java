package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * User inputs a number of stars (n)
 * and had the options of printing them
 * horizontally, vertically, nxn, 1....n and n....1
 */
public class MenuStars {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int choice = 0;
        int numberOfStars = 0;

        do{
            printMenu();
            choice = getNextInt("Δώστε επιλογή");

            while (choice < 1 || choice > 6){
                choice = getNextInt("Λάθος επίλογή. Επιλέξτε ξανα (1-6)");
            }

            if (choice == 6) break;
            numberOfStars = getNextInt("Δώστε αριθμό από αστεράκια (η)");

            switch (choice){
                case 1 :
                    printStars(1, numberOfStars, 0);
                    break;
                case 2 :
                    printStars(numberOfStars, 1, 0);
                    break;
                case 3 :
                    printStars(numberOfStars, numberOfStars, 0);
                    break;
                case 4 :
                    printStars(numberOfStars, 1, 1);
                    break;
                case 5 :
                    printStars(numberOfStars, numberOfStars, -1);
                    break;
            }
        }while (choice != 6);   //Έτσι όπως το εγραψα θα μπορουσε θεωρητικά να ηταν και while (true),
                                // οποτε δεν ξερω αν ειναι 100% σωστό όπως το έκανα
        
        System.out.println("Tο πρόγραμμα τερματίζεται");
    }
    /**
     * Prints our menu options
     */
    public static void printMenu(){
        System.out.println();
        System.out.println("1. Εμφάνισε η αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε η αστεράκια κάθετα");
        System.out.println("3. Εμφάνισε η γραμμές με η αστεράκια");
        System.out.println("4. Εμφάνισε η γραμμές με αστεράκια 1-η");
        System.out.println("5. Εμφάνισε η γραμμές με αστεράκια η-1");
        System.out.println("6. Έξοδος από το πρόγραμμα");
    }
    /**
     * Prompts the user to input an integer
     * @param s Prompt towards the user
     * @return  an integer we expect
     */
    public static int getNextInt (String s) {
        System.out.println(s);
        return in.nextInt();
    }
    /**
     * Prints rows of stars
     * @param rows  the number of rows we want
     * @param firstRowStars the number of stars on the first row
     * @param starsIncrement the difference of stars between 1st and
     *                       2nd row, 2nd and 3rd...etc
     */
    public static void printStars (int rows, int firstRowStars, int starsIncrement){
        for (int i = 1 ; i <= rows ; i++){
            for (int j = 1 ; j <= (firstRowStars +(i - 1) * starsIncrement ) ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
