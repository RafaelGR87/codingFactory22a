package test;

import java.util.Scanner;

/*
create the mario tree
 */
public class Mario {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int height = 0;

        System.out.println("How tall will be the mario tree ? (max 8)");
        height = in.nextInt();

        while (height < 1 || height > 8) {
            System.out.println("Wrong input. Try again (1-8)");
            height = in.nextInt();
        }

        for (int i = 1 ; i <= height ; i++ ){
            System.out.printf("%s%s%s%s", " ".repeat(height - i), "*".repeat(i)," ", "*".repeat(i));
            System.out.println();
        }
         }


}
