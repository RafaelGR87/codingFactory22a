package test;

import java.util.Arrays;

public class ToCamelCase {

    public static void main(String[] args) {

        String input="Raf-ael-pattas";
        int positionOfDash = -1;
        int positionOfUnder = -1;

        positionOfDash = input.indexOf('-');
        positionOfUnder = input.indexOf('_');

        while (positionOfDash >= 0){
          input = input.substring(0,positionOfDash) + Character.toUpperCase(input.charAt(positionOfDash + 1)) + input.substring(positionOfDash + 2);
          positionOfDash = -1;
          positionOfDash = input.indexOf('-');
        }

        while (positionOfUnder >= 0){
            input = input.substring(0,positionOfUnder) + Character.toUpperCase(input.charAt(positionOfUnder + 1)) + input.substring(positionOfUnder + 2);
            positionOfUnder = -1;
            positionOfUnder = input.indexOf('-');
        }

        System.out.println(input);
    }

}
