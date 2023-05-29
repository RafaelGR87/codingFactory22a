package gr.aueb.cf.ch6;

public class ArraySearchApp {

    public static void main(String[] args) {
        final int SECRET = 12;
        int[] arr = {1, 3, 5, 9, 12};
        boolean secretIsFound = false;

        for (int item : arr) {
            if (item == SECRET) {
                secretIsFound = true;
                break;
            }
        }

        if (secretIsFound) {
            System.out.println("Secret key was found");
        } else {
            System.out.println("Secret key was not found");
        }
    }
}
