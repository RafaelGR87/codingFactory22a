package test;

public class ChicagoDiceGame {
    public static void main(String[] args) {

        int dice1 = 0;
        int dice2 = 0;
        int dice3 = 0;

        dice1 = MyMethods.rng(1,6);
        dice2 = MyMethods.rng(1,6);
        dice3 = MyMethods.rng(1,6);

        System.out.println("Dice 1 : " + dice1);
        System.out.println("Dice 2 : " + dice2);
        System.out.println("Dice 3 : " + dice3);
        System.out.println("Score : " + MyMethods.score(dice1, dice2, dice3));

    }

}
