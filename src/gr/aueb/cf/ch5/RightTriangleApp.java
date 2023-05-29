package gr.aueb.cf.ch5;

import java.util.Scanner;

/*
user inputs a ( biggest triangle edge)
b and c (the other two) and checks if the triangle
is ορθογωνιο
EPSILON = 0.000005
 */
public class RightTriangleApp {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;
        final double EPSILON = 0.000005;
        boolean isRight = false;


        System.out.println("Please insert a first and then b and c");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        if ((a*a - b*b - c*c) <= EPSILON ){
            isRight = true;
        }

        System.out.println(isRight);




    }
}
