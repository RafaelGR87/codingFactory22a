package gr.aueb.cf.ch8;

import java.util.Scanner;

public class Homework8 {
    /**
     * Prints a menu of 5 options. 5th option is Exit
     */
    public static void printMenu() {
        System.out.println("1. First Option");
        System.out.println("2. Second Option");
        System.out.println("3. Third Option");
        System.out.println("4. Fourth Option");
        System.out.println("5. Exit");
    }
    /**
     * Prompts the user to input an integer
     *
     * @return An integer from the user
     */
    public static int getChoice() {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        boolean errorFlag = false;
        do {
            if (!errorFlag) {
                System.out.println("Please input a number (integer)");
            }
            if (!sc.hasNextInt()) {
                System.out.println("Wrong input. Please insert an integer");
                errorFlag = true;
                sc.nextLine();
            } else {
                number = sc.nextInt();
                errorFlag = false;
            }
        } while (errorFlag);
        return number;
    }
    /**
     * Informs the user that a selection has been made
     *
     * @param choice The selection
     */
    public static void printChoice(int choice) throws IllegalArgumentException{
        System.out.println("You have selected the option number " + choice);
    }
    /**
     * Prints our menu. User selects an option
     * The app checks if the selection is between 1 and 5
     * App terminates with option 5
     */
    public static void main(String[] args) {
        int selection = 0;
        boolean exit = false;
        printMenu();
        while (!exit) {
            try {
                selection = getChoice();
                if ((selection >= 1) && (selection <= 5)) {
                    printChoice(selection);
                }else {
                    throw new IllegalArgumentException();
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Wrong input. Number must be between 1 and 5. [1,5]");
            }
            if (selection == 5){
                exit = true;
                System.out.println("App will be terminated");
            }
        }
    }
}
