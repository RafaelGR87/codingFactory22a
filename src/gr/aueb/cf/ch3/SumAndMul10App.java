package gr.aueb.cf.ch3;

/**
 * sum and mul of first 10 integers
 */
public class SumAndMul10App {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int mul = 1;
        while (i <= 10){
            sum += i;
            mul *=i;
            i++;
        }
        System.out.printf("Sum : %d, Mul : %d", sum, mul);
    }
}
