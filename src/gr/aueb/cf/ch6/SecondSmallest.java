package gr.aueb.cf.ch6;

import java.util.Arrays;

public class SecondSmallest {

    /**
     * Returns the position (int) in which the smallest number of an array is
     * @param arr The array in which we want to search
     * @return The position in this array where the smallest number is
     */
    public static int getMinPosition(int[] arr) {

        int minPosition = 0;
        int minValue = arr[0];

        for (int i = 1; i <= arr.length - 1; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }
        return minPosition;
    }
    /**
     * Returns the position (int) in which the second-smallest number of an array is
     * @param arr The array in which we want to search
     * @return The position in this array where the second-smallest number is
     */
    public static int getSecondMinPosition(int[] arr) {

        int secondMinPosition = 0;
        int secondMinValue = Integer.MAX_VALUE;

        for (int i = 0; i <= arr.length - 1; i++) {
            if ((arr[i] < secondMinValue) && (arr[i] != arr[getMinPosition(arr)]))
            {
                secondMinPosition = i;
                secondMinValue = arr[i];
            }
        }
        return secondMinPosition;
    }
}