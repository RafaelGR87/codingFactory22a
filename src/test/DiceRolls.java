package test;

/**
 * Test 10 random dice rolls
 */
public class DiceRolls {

    public static void main(String[] args) {

        int a = 1;
        int b = 6;
        int result ;

        for (int i=1 ; i<=10 ; i++ ) {
            result = MyMethods.rng(a, b);
            System.out.println(result);
        }
    }
}
