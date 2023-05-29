package gr.aueb.cf.ch6;

public class MaxPosition {
    /** Returns the position where the max value of an array is.
     *  The search is limited. It starts from the position low up to the position high
     * @param arr   The array in which we search the max value
     * @param low   From this position in the arr array we will start the search
     * @param high  In this position we will end the search
     * @return  The position in which the highest value is
     */
    public static int getMaxPosition (int [] arr, int low, int high){

        if (low < 0 || high > arr.length){
            System.out.println("Wrong starting/ending point");
            return -1;
        }
        int maxPosition = low;
        int maxValue = arr[low];

        for (int i = low + 1 ; i <= high ; i++ ){
            if (arr[i] > maxValue){
                maxPosition = i;
                maxValue = arr[i];
            }
        }
        return maxPosition;
    }
}
