package gr.aueb.cf.tenProjects;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Reads a txt file that has phone contacts (Surname, Firstname, Phone number)
 * Then the user has the options of searching, updating, deleting and inserting contacts
 * The changed can be put a txt file (can be the same)
 */
public class Project02 {

    static File mySourceFile = new File("C:/JavaTemp/contacts.txt"); //The source file of our contact list
    static File myOutputFile = new File("C:/JavaTemp/contacts.txt");

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int option = getUserChoice();
            int numberOfContacts = 0;
            boolean dataAreLoaded = false;
            String[][] contacts = new String[500][3];
            while (true){
                switch (option) {
                    case 1:
                        numberOfContacts = fromFileToArray(mySourceFile, contacts);
                        System.out.printf("Contacts' list has been loaded. Number of contacts : %d\n\n", numberOfContacts);
                        dataAreLoaded = true;
                        break;
                    case 2 :
                        if (!dataAreLoaded){
                            System.err.println("Please load the contact list first");
                            break;
                        } else {
                            System.out.println("Please enter the phone number you are looking for");
                            String numberToSearch = sc.next();
                            int indexOfNumber = getIndexOfPhone(contacts,numberOfContacts,numberToSearch);
                            if (indexOfNumber == -1){
                                System.out.println("Phone number " + numberToSearch + " is not on the contact list\n");
                            } else {
                                System.out.printf("%s %s %s\n", contacts[indexOfNumber][0],contacts[indexOfNumber][1],contacts[indexOfNumber][2]);
                            }
                        }break ;
                    case 3:
                        if (!dataAreLoaded) {
                            System.err.println("Please load the contact list first");
                            break;
                        }else {
                            System.out.println("Please insert Surname then Firstname and then Phone number");
                            String newSurname = sc.next();
                            String newFirstname = sc.next();
                            String newPhone = sc.next();
                            int indexOfPhone = getIndexOfPhone(contacts, numberOfContacts, newPhone);
                            if (indexOfPhone != -1) {
                                System.out.println("The phone number " + newPhone + " already exists in contacts");
                                break;
                            } else {
                                contacts[numberOfContacts][0] = newSurname;
                                contacts[numberOfContacts][1] = newFirstname;
                                contacts[numberOfContacts][2] = newPhone;
                                numberOfContacts++;
                                System.out.println("New contact has been added");
                                break;
                            }
                        }
                    case 4:
                        if (!dataAreLoaded) {
                            System.err.println("Please load the contact list first");
                            break;
                        }else {
                            System.out.println("Please insert Surname then Firstname and then Phone number");
                            String newSurname = sc.next();
                            String newFirstname = sc.next();
                            String newPhone = sc.next();
                            int indexOfPhone = getIndexOfPhone(contacts, numberOfContacts, newPhone);
                            if (indexOfPhone == -1) {
                                System.out.println("The phone number " + newPhone + " doesn't exists in contacts");
                                break;
                            } else {
                                contacts[indexOfPhone][0] = newSurname;
                                contacts[indexOfPhone][1] = newFirstname;
                                contacts[indexOfPhone][2] = newPhone;
                                System.out.println("Contact has been updated");
                                break;
                            }
                        }
                    case 5:
                        if (!dataAreLoaded) {
                        System.err.println("Please load the contact list first");
                        break;
                        }else {
                            System.out.println("Please insert the phone number you want to delete");
                            String numberToDelete = sc.next();
                            int indexOfPhone = getIndexOfPhone(contacts, numberOfContacts,numberToDelete);
                            if (indexOfPhone == -1){
                                System.out.println("The phone number " + numberToDelete + " doesn't exists in contacts");
                                break;
                            } else {
                                for (int i = indexOfPhone ; i <= numberOfContacts -1 ; i++ ){
                                    for (int j = 0 ; j < 3; j++){
                                        contacts[i][j] = contacts [i+1][j];
                                    }
                                }
                                numberOfContacts--;
                                System.out.println("Contact has been deleted");
                                break;
                            }
                        }
                    case 6:
                        if (!dataAreLoaded) {
                            System.err.println("Please load the contact list first");
                            break;
                        }else {
                        PrintWriter pw = new PrintWriter(myOutputFile);
                        for (int i = 0; i <= numberOfContacts - 1 ; i++) {
                            for (int j = 0; j < 3; j++) {
                                if (j <= 1) {
                                    pw.print(contacts[i][j] + ",");
                                } else {
                                    pw.println(contacts[i][j] );
                                }
                            }
                        }
                        pw.close();
                        System.out.println("Contacts have been copied to external txt");
                        break;
                        }
                        case 7:
                            System.out.println("App is closing");
                             System.exit(0);
                }
                option = getUserChoice();
            }
        } catch (FileNotFoundException ex) {
            System.err.println("File with contacts has not been found");
        }
    }

    /**
     * Reads from a file data that contain info for a contact list.
     * The format of this file should be lastname,firstname,phone number. New entry should be with a new line
     * The contacts are stored in a 2D array. Also returns the number of contacts
     * @param file The file we read the data
     * @param arr The array in which we will save the data from the file
     * @throws IOException
     * @return the number of contacts
     */
    public static int fromFileToArray (File file, String[][] arr) throws FileNotFoundException {
        try {
            Scanner sc = new Scanner(file);
            int i=0;
            int j=0;
            sc.useDelimiter(",|\\R");
            while (sc.hasNext()){
                arr [i][j] = sc.next();
                j++;
                if (j == arr[i].length){
                    i++;
                    j=0;
                }
            }
            sc.close();
            return i;
        }catch (FileNotFoundException ex){
            System.err.println("File has not been found");;
        }
        return -1;
    }

    /**
     * Prints the menu of our App
     */
    public static void  printMenu(){
        System.out.println("App Menu");
        System.out.println("1. Load the contact list from the txt file");
        System.out.println("2. Search a phone number");
        System.out.println("3. Insert a contact");
        System.out.println("4. Update a contact");
        System.out.println("5. Delete a contact");
        System.out.println("6. Upload the contact list to the txt file");
        System.out.println("7. Exit");
    }

    /**
     * Prompts the user to enter a selection
     * Checks if its a valid selection (1 to 7)
     * @return the selection from the user
     */
    public static int getUserChoice(){
        System.out.println("Please select an option\n");
        printMenu();
        Scanner sc = new Scanner(System.in);
        int option = 0;
        option = sc.nextInt();
        while (option < 1 || option > 7){
            System.err.println("Please select a valid option (1 to 7)");
            option = sc.nextInt();
        }
        return option;
    }

    /**
     * Checks if a phone number exists on our array of contacts
     * @param arr the array in which our contacts are. Format is lastname, firstname, phone number
     * @param phone the phone number we are looking for
     * @param numberOfContacts how many contacts are in the array
     * @return the index in which the phone number is. If not found returns -1
     */
    public static int getIndexOfPhone(String[][] arr, int numberOfContacts, String phone){
        int indexOfPhone = -1;
        for (int i = 0 ; i < numberOfContacts ; i++) {
            if (arr[i][2].equals(phone)){
                indexOfPhone = i;
            }
        }
        return indexOfPhone;
    }
}
