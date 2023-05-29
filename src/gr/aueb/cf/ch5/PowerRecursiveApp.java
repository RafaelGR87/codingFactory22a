package gr.aueb.cf.ch5;

public class PowerRecursiveApp {

    public static void main(String[] args) {
    float a = 2F;
    float b = -3F;
        System.out.println(power(a,b));
    }

    public static float power (float a, float b){
        if (b < 0) {
            return 1 / (power (a, -b ));
        }
        if (b < 1) return 1;
        return a * power (a, b-1);
    }
}
