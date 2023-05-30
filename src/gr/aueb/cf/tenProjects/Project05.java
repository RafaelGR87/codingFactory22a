package gr.aueb.cf.tenProjects;

public class Project05 {
    /**
     * Testing of getLowAndHighIndexOf method
     * @param args
     */
    public static void main(String[] args) {

        int[] array = {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};
        int[] results = new int[2];

        results = getLowAndHighIndexOf(array, 8);
        System.out.printf("Low Index : %d, High index : %d", results[0], results[1]);
    }
    /**
     * If an integer exists in an array it returns the lowest index that this integer appears
     * and the highest index
     * @param arr
     * @param key
     * @return
     */
    public static int[] getLowAndHighIndexOf (int[] arr, int key ){
        int[] outcomeArr = {-1,-1};
        if (isInArray(arr, key)){
            outcomeArr[0] = getIndexOf(arr, key);
            outcomeArr[1] = outcomeArr[0] + numberOfIndexes(arr, key) - 1;
        }
        return outcomeArr;
    }
    /**
     * Checks if an integer exists in an array
     * @param arr the array in whuch we look
     * @param key the indeger we are looking
     * @return true if the integer exists in the array, False otherwise
     */
    public static boolean isInArray (int[] arr, int key){
        boolean found = false;
        int i = 0;
            for ( i = 0; i < arr.length; i++){
                if (arr[i] == key){
                    found = true;
                    i = arr.length; //to exit
                }
            }
        return found;
    }
    /**
     * If an integer exists in an array, it returns the first index of this array that
     * this integer exists.
     * @param arr The array in which we are looking
     * @param key The ineger we are looking
     * @return  The index of the first key in the arr
     */
    public static int getIndexOf (int[] arr, int key){
        int index = -1;
        if (isInArray(arr,key)){
            for (int i = 0; i < arr.length; i++){
                if (arr[i] == key){
                    index = i;
                    i = arr.length; //to exit
                }
            }
        }
        return index;
    }
    /**
     * If an integer exists in an array, it returns the amount of integers that
     * exist in this array
     * @param arr The array in which we are looking
     * @param key The ineger we are looking
     * @return  The number of keys in that arr
     */
    public static int numberOfIndexes (int[] arr, int key){
        int counter = 0;
        if (isInArray(arr, key)){
            for (int i = getIndexOf(arr, key); i < arr.length; i++){
                if (arr[i] == key) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
