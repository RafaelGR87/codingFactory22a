package gr.aueb.cf.ch4;

import java.util.Scanner;

/* a frog wants to cross a river
   frog is in position X and wants to reach
   in position Y (or in position > Y). the frog jumps
   a fixed distance D.
   App finds the minimum number of jumps that frog must make

   For instance if
   x=10
   y=85
   d=30
   then frog needs 3 jumps (10, 40, 70, 100)
 */
public class FrogApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int d = 0;
        int jumps = 0;
        //x = Math.ceil()
        System.out.println("Please insert starting position (x),desired position (y) and distance of jump (d)");
        x = in.nextInt();
        y = in.nextInt();
        d = in.nextInt();

        while (x < y){
            jumps += 1;
            x += d;
        }

        System.out.printf("Number of jumps : %d", jumps);





    }
}
