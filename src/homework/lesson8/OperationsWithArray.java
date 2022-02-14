package homework.lesson8;

public class OperationsWithArray {
    public static void main(String[] args) {
        int[] singleArray = {2, 54, 65, 3, 7, 23, 87, 35, 76, 98, 43, 432, 45};
        int[][] twoDimensionalArray = {{1, 2, 34, 4, 5, 7, 8}, {34, 65, 2,6456,653,43, 65, 87, 64, 3}};
        int sum = 0;
        int counter = 0;
        int evenCounter = 0;
        int oddCounter = 0;
        double average;

        for (int i : singleArray) {
            sum += i;
            counter++;
            if ((i % 2) == 0) {
                evenCounter++;
            } else {
                oddCounter++;
            }
        }
        average = (double) sum / counter;
        System.out.println("The sum of elements of one-dimensional array= " + sum);
        System.out.print("The average of elements of one-dimensional array= ");
        System.out.printf("%.2f", average);
        System.out.println("\n" + "The number of even elements of one-dimensional array= " + evenCounter);
        System.out.println("The number of odd elements of one-dimensional array= " + oddCounter);

        int twoDimensionalSum = 0;
        int twoCounter = 0;
        int evenCounterTwo = 0;
        int oddCounterTwo = 0;
        double averageTwo;
        for (int j = 0; j < twoDimensionalArray.length; j++) {
            for (int k = 0; k < twoDimensionalArray[j].length; k++) {
                twoDimensionalSum = twoDimensionalSum + twoDimensionalArray[j][k];
                twoCounter++;
                if ((twoDimensionalArray[j][k] % 2) == 0) {
                    evenCounterTwo++;
                } else {
                    oddCounterTwo++;
                }
            }
        } averageTwo = (double) twoDimensionalSum/twoCounter;
        System.out.println("The sum of elements of two-dimensional array= " + twoDimensionalSum);
        System.out.print("The average of elements of two-dimensional array= ");
        System.out.printf("%.2f", averageTwo);
        System.out.println("\n" + "The number of even elements of two-dimensional array= " + evenCounterTwo);
        System.out.println("The number of odd elements of two-dimensional array= " + oddCounterTwo);
    }
}
