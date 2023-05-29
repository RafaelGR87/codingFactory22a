package gr.aueb.cf.tenProjects;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Project01 {

    static String myFilePath = "C:/JavaTemp/integers.txt";
    static String myFilePathOutcome = "C:/JavaTemp/integersOutcome.txt";

    public static void main(String[] args) {

        int numberOfIntegers = getNumberOfIntegers(myFilePath);
        int[] numberArr = new int[49];
        int[][] combinationsArr = new int[numberOfCombinations(numberOfIntegers,6)][6];
        if (numberOfIntegers < 6 || numberOfIntegers > 49) {
            System.err.printf("The File does not have the required number of integers\nMinimum : 6, Maximum : 49, Current : %d", numberOfIntegers);
        } else {
            insertIntoArray(numberArr, myFilePath);
            Arrays.sort(numberArr, 0, numberOfIntegers);
            createCombinations(numberArr, combinationsArr, numberOfCombinations(numberOfIntegers,6));
        }
    }

    /**
     * Returns how many integers with values from 1 to 49
     * are in a file. File is located in the path parameter
     * It
     * @param path The path of the file
     * @return  The number of integers on that file
     */
      public static int getNumberOfIntegers (String path) {
        try {
            File sourceFile = new File(path);
            Scanner sc = new Scanner(sourceFile);
            int counterNumbers = 0;
            boolean lastNumber = false;
            while ((sc.hasNextInt() == true) && (lastNumber == false)) {
                int nextNumber = sc.nextInt();
                if (nextNumber == -1) {
                    lastNumber = true;
                }
                if (nextNumber <= 0 || nextNumber > 49){
                    counterNumbers--;
                }
                counterNumbers++;
            }
            sc.close();
            return counterNumbers;
        } catch (FileNotFoundException ex){
            System.err.println("File not found");
            return -1;
        }
      }

    /**
     * Inserts into an array, the integers who are valued between 1 and 49 that exist
     * in a file. File is located in the path parameter
     * @param arr The array that will be filled
     * @param path The path of the file
     */
      public static void insertIntoArray (int[] arr, String path){
          try {
              File sourceFile = new File(path);
              Scanner sc = new Scanner(sourceFile);
              boolean lastNumber = false;
              int i = 0;
              while ((sc.hasNextInt() == true) && (lastNumber == false)) {
                  int nextNumber = sc.nextInt();
                  if (nextNumber == -1) {
                      lastNumber = true;
                  } else if (nextNumber >= 1 && nextNumber <= 49) {
                             arr[i] = nextNumber;
                             i++;
                  }
              }
              sc.close();
          } catch (FileNotFoundException ex){
              System.err.println("File not found");
          }
      }

    /**
     * Creates an array of all possible combination of 6 numbers
     * from integers that are located in a array source
     * @param arrSource We take our integers here
     * @param arrOutcome Here are put all possible combinations (2D array)
     * @param numberOfIndexes How many indexed we want to take from the arrSource
     */
      public static void createCombinations (int[] arrSource, int[][] arrOutcome, int numberOfIndexes){
          
          int i = 0;
          boolean isValid = false ;
          try {
              File fileOutcome = new File (myFilePathOutcome);
              FileWriter fileWriter = new FileWriter(fileOutcome,true);
              PrintWriter pw = new PrintWriter (fileWriter);
              for (int a = 0; a < numberOfIndexes - 5; a++) {
                  for (int b = a + 1; b < numberOfIndexes - 4; b++) {
                      for (int c = b + 1; c < numberOfIndexes - 3; c++) {
                          for (int d = c + 1; d < numberOfIndexes - 2; d++) {
                              for (int e = d + 1; e < numberOfIndexes - 1; e++) {
                                  for (int f = e + 1; f < numberOfIndexes; f++) {
                                      arrOutcome[i][0] = arrSource[a];
                                      arrOutcome[i][1] = arrSource[b];
                                      arrOutcome[i][2] = arrSource[c];
                                      arrOutcome[i][3] = arrSource[d];
                                      arrOutcome[i][4] = arrSource[e];
                                      arrOutcome[i][5] = arrSource[f];
                                      isValid = ((!isEven(arrOutcome[i])) && (!isOdd(arrOutcome[i])) && (!isContinuous(arrOutcome[i])) && (!isSameTen(arrOutcome[i])) && (!isSameEnding(arrOutcome[i])));
                                      if (isValid) {
                                          System.out.printf("%d, %d, %d, %d, %d, %d\n",arrOutcome[i][0],arrOutcome[i][1],arrOutcome[i][2],arrOutcome[i][3],arrOutcome[i][4],arrOutcome[i][5]);
                                          pw.printf("%d, %d, %d, %d, %d, %d\n",arrOutcome[i][0],arrOutcome[i][1],arrOutcome[i][2],arrOutcome[i][3],arrOutcome[i][4],arrOutcome[i][5]);
                                          pw.close();
                                      }
                                      i++;
                                  }
                              }
                          }
                      }
                  }
              }
              pw.close();
          }catch (IOException ex){
              System.err.println("Destination File hasn't been found");
          }
      }

    /**
     * We have n elements and we want to make all combination of k of them
     * @param n
     * @param k
     * @return how many are those combinations
     */
    public static int numberOfCombinations (int n, int k) {
        return (factorial(n))/(factorial(k) * factorial(n - k));
    }
//    n! / (k! * (n - k)!)

    /**
     * Returns the factorial of an integer
     * @param number the number we need to find its factorial
     * @return the factorial of the number
     */
    public static int factorial (int number) {
        int result = 1;
        for (int i = 1; i <= number ; i++ ){
            result *= i;}
        return result;
    }

    /**
     * Checks if an array has 5 or more even numbers
     * @param arr The array in which we check
     * @return True if there are 5 or more evens. False otherwise
     */
    public static boolean isEven (int[] arr){
        int countOfEvens = 0;
        for (int i = 0; i < arr.length ; i++){
            if (arr[i] % 2 == 0)
                countOfEvens++;
        }
        return (countOfEvens > 4);
    }
    /**
     * Checks if an array has 5 or more odd numbers
     * @param arr The array in which we check
     * @return True if there are 5 or more odds. False otherwise
     */
    public static boolean isOdd (int[] arr){
        int countOfOdds = 0;
        for (int i = 0; i < arr.length ; i++){
            if (arr[i] % 2 == 1)
                countOfOdds++;
        }
        return (countOfOdds > 4);
    }
    /**
     * Checks if an array has 3 or more continuous numbers
     * @param arr The array in which we check
     * @return True if there are 3 or more continuous numbers. False otherwise
     */
    public static boolean isContinuous (int[] arr){
        int countOfContinuous = 0;
        boolean result = false;
        for (int i = 0; i < arr.length - 1 ; i++){
            if (arr[i] == arr[i + 1] - 1) {
                countOfContinuous++;
                if (countOfContinuous > 2) {
                    result = true;
                    i = arr.length; //to exit
                }
            }else {
                countOfContinuous = 0;
            }
        }
        return (result);
    }

    /**
     * Checks if in an array has 4 numbers or more that have the same last digit
     * @param arr The array in which we check
     * @return True if there are 4 or more numbers with the same ending. False otherwise
     */
    public static boolean isSameEnding (int[] arr){

        boolean result = false;
        int[] tempArray = new int[10];
        for (int i = 0 ; i < arr.length; i++ ){
            tempArray[(arr[i] % 10)]++;
        }
        for (int i = 0; i < 10 ; i++){
            if (tempArray[i] > 3){
                result = true;
                i = 10; //to exit
            }
        }
        return result;
    }

    /**
     * Checks in an array if 4 or more numbers belong to the same tens (decade)
     * @param arr The array in which we check
     * @return True if there are 4 or more numbers in the same tens (decade). False otherwise
     */
    public static boolean isSameTen (int[] arr) {

        boolean result = false;
        int[] tempArray = new int[5];
        for (int i = 0 ; i < arr.length; i++ ){
            tempArray[(arr[i] / 10)]++;
        }
        for (int i = 0; i < 5 ; i++){
            if (tempArray[i] > 3){
                result = true;
                i = 5; //to exit
            }
        }
        return result;
    }
}


