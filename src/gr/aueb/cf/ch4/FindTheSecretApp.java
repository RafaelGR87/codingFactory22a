package gr.aueb.cf.ch4;

import java.util.Scanner;

/*
user has 10 chances to find
one secret key (int). If he finds it
in less than the 10th chance, for will stop
 */
public class FindTheSecretApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final int SECRET_KEY = 12;
        int num ;
        boolean found = false;

        for (int i = 1 ; i <= 10; i++){
            System.out.println("Please make a guess");
            num = in.nextInt();
            if (num == SECRET_KEY){
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("No worries, play again");
            System.exit(1);
        }
        System.out.println("Sucecss! Play again ");
    }
}
