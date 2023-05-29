package gr.aueb.cf.tenProjects;

public class Project04 {
    /**
     * Takes an array that lists the arrival and departure time of cars.
     * Figures out in which time we had the biggest number of cars and how many they were
     */
    public static void main(String[] args) {

        int[][] entries = {{1310, 1358}, {923, 1027}, {1805, 1915}, {752, 826}, {1622, 1656}, {2043, 2139}, {1137, 1205}, {845, 931}, {2010, 2104}, {1246, 1338}, {1419, 1453}, {925, 1001}, {1713, 1750}, {2002, 2034}, {559, 643}, {1234, 1320}, {1848, 1932}, {941, 1025}, {1639, 1718}, {1340, 1406}, {1905, 1947}, {1213, 1238}, {846, 931}, {2205, 2233}, {1017, 1051}, {1531, 1559}, {1735, 1814}, {1045, 1103}, {1610, 1649}, {1922, 2001}, {1351, 1431}, {901, 937}, {1752, 1825}, {2012, 2052}, {1229, 1258}, {743, 823}, {2027, 2103}, {942, 1014}, {607, 644}, {1315, 1344}, {1637, 1658}, {826, 859}, {1758, 1816}, {1354, 1415}, {934, 1013}, {2136, 2216}, {847, 934}, {1813, 1908}, {1123, 1159}, {1956, 2011}, {1023, 1043}, {1332, 1409}, {811, 852}, {1642, 1704}, {1857, 1947}, {1217, 1247}, {832, 914}, {1506, 1527}, {944, 1018}, {1612, 1638}, {1744, 1814}, {1108, 1150}, {832, 913}, {2007, 2029}, {1301, 1343}, {1923, 2004}, {1049, 1123}, {1352, 1407}, {1816, 1904}, {1053, 1108}, {1429, 1448}, {817, 901}, {1223, 1251}, {1721, 1757}, {959, 1022}, {1909, 1929}, {1215, 1253}, {857, 923}, {1444, 1503}, {1723, 1747}, {1211, 1249}, {2031, 2056}, {1602, 1630}, {844, 933}, {1907, 1933}, {1144, 1210}, {2010, 2034}, {913, 957}, {1707, 1750}, {1101, 1146}, {811, 837}, {1746, 1827}, {917, 957}, {1210, 1253}, {1146, 1231}, {1723, 1813}, {1013, 1032}};
        //entries table only for testing purposes

        int[][] allTimesArr;
        allTimesArr = makeAllTimesArr(entries);
        sortIntArrayFirstColumn(allTimesArr);

        int currentNumberCars = 0;
        int maxCars = 0;
        int timeOfMaximumCars = 0;

        for (int k = 0; k < allTimesArr.length; k++){
            currentNumberCars += allTimesArr[k][1];
            if (currentNumberCars > maxCars){
                maxCars = currentNumberCars;
                timeOfMaximumCars = k;
            }
        }
        System.out.println("Maximum number of cars : " + maxCars + ". During time between " + allTimesArr[timeOfMaximumCars][0] + " and " + allTimesArr[timeOfMaximumCars + 1][0]);
    }

    /**
     * Takes an array that lists the arrival and departure time and makes one array with all these hours
     * in the first column and the second column is 1 if its an arrival or -1 if its a departure
     * @param arr the array with arrivals and departures
     * @return an array with the different format
     */
    public static int[][] makeAllTimesArr(int[][] arr) {

        int[][] allTimesArr = new int[arr.length * 2][2];
        for (int i = 0; i < arr.length; i++) {
            allTimesArr[i * 2][0] = arr[i][0];
            allTimesArr[i * 2][1] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            allTimesArr[i * 2 + 1][0] = arr[i][1];
            allTimesArr[i * 2 + 1][1] = -1; //Στην εκφωνηση έλεγε 0. Το έκανα με -1
        }
        return allTimesArr;
    }
    /**
     * Sorts a two dimension integer array [x][2], on ascending order of the first column
     * @param arr the array we will sort
     */
    public static void sortIntArrayFirstColumn(int[][] arr) {
        int indexToSort = 0;
        int minValue = Integer.MAX_VALUE;
        int indexOfMinValue = -1;
        for (int j = indexToSort; j < arr.length; j++) {
            minValue = Integer.MAX_VALUE;
            indexOfMinValue = -1;
            for (int i = j; i < arr.length; i++) {
                if (arr[i][0] < minValue) {
                    minValue = arr[i][0];
                    indexOfMinValue = i;
                }
            }
            int temp1 = arr[indexToSort][0];
            int temp2 = arr[indexToSort][1];
            arr[indexToSort][0] = minValue;
            arr[indexToSort][1] = arr[indexOfMinValue][1];
            arr[indexOfMinValue][0] = temp1;
            arr[indexOfMinValue][1] = temp2;
            indexToSort++;
        }
    }
}
