package test;

/** int random number between int a and int b
 */
public class MyMethods {

    public static int rng(int a , int b){
        return (int)(Math.random() * (b - a +1))+1;
    }

    public static int score(int a, int b, int c) {

        int result = 0;
        if (a == 1) result += 100;
        if (b == 1) result += 100;
        if (c == 1) result += 100;
        if (a == 6) result += 60;
        if (b == 6) result += 60;
        if (c == 6) result += 60;
        if (a!=1 && a!=6) result += a;
        if (b!=1 && b!=6) result += b;
        if (c!=1 && c!=6) result += c;
        return result;
    }

}
