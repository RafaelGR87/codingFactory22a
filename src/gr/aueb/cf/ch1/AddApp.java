package gr.aueb.cf.ch1;

/**
 * Προσθετει 2 ακεραιους και εμφανιζει το απολεσμα στο stdout
 */
public class AddApp {
    public static void main(String[] args) {
        //Δήλωση και αρχικοποιήση
        int num1=10;
        int num2=7;
        int result;

        //Εντολες

        result = num1 + num2;

        //Εκτύπψση αποτελεσματων

        System.out.println("Το αποτέλεσμα είναι : " + result);
        System.out.printf("Το αποτέλσμα των %d και %d ειναι %d", num1, num2, result);
    }
}
