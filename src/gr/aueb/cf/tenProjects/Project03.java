package gr.aueb.cf.tenProjects;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Reads a file that contains text. It checks what characters are in this text and how many of each one
 * Later it shows all these characters and the percentage of them appearing. In descending order of percentage
 */
public class Project03 {

    public static void main(String[] args) {
        int[][] chars = new int[256][2];
        int textLength = 0 ;
        try {
            String text = new String(Files.readAllBytes(Paths.get("C:/JavaTemp/TextFile.txt")));
            textLength = text.length();
            int distinctChars = 0;
            for (int i = 0 ; i < text.length(); i++) {
                boolean oldCharFound = false;
                for (int j = 0; j < distinctChars; j++) {
                    if (text.charAt(i) == chars[j][0]) {
                        chars[j][1]++;
                        oldCharFound = true;
                        break;
                    }
                }
                if (!oldCharFound) {
                    chars[distinctChars][0] = text.charAt(i);
                    chars[distinctChars][1]++;
                    distinctChars++;
                }
            }
        } catch (IOException ex) {
            System.err.println("File has not been found");
        }

        sortIntArraySecondColumn(chars);

        for (int k = 0; k < 256; k++) {
            if (chars[k][0] != 0) {
                if (chars[k][0] == 10 || chars[k][0] == 13){ //ASCII end of line and carriage return dont print correctly
                    System.out.printf("new_line (%d) %.1f %%\n",chars[k][1], (chars[k][1]/(float)textLength)*100);
                }else {
                    System.out.printf("%c (%d) %.1f %%\n", chars[k][0], chars[k][1], (chars[k][1] / (float) textLength)*100);
                }
            }
        }
    }

    /**
     * Sorts a two dimension integer array [x][2], on descending order of the second column
     * @param arr the array we will sort
     */
    public static void sortIntArraySecondColumn (int[][] arr){
        int indexToSort = 0;
        int maxValue = Integer.MIN_VALUE;
        int indexOfMaxValue = -1;
        for (int j = indexToSort ; j < arr.length; j++) {
            maxValue = Integer.MIN_VALUE;
            indexOfMaxValue = -1;
            for (int i = j ; i < arr.length; i++) {
                if (arr[i][1] > maxValue) {
                    maxValue = arr[i][1];
                    indexOfMaxValue = i;
                }
            }
            int temp1 = arr[indexToSort][0];
            int temp2 = arr[indexToSort][1];
            arr[indexToSort][0] = arr[indexOfMaxValue][0];
            arr[indexToSort][1] = maxValue;
            arr[indexOfMaxValue][0] = temp1;
            arr[indexOfMaxValue][1] = temp2;
            indexToSort++;
        }
    }
}

