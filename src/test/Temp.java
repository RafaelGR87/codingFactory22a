package test;

public class Temp {

    public static void main(String[] args) {

        System.out.println(nbYear(1500000, 2.5, 10000, 2000000));

    }

    public static int nbYear(int p0, double percent, int aug, int p) {

        int currentPopulation = p0;
        int years = 0;
        while (currentPopulation < p){
            currentPopulation += (int)(currentPopulation * (percent / 100) + aug);
            years++;
        }
        return years;
    }
}

