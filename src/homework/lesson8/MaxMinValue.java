package homework.lesson8;

public class MaxMinValue {
    public static void main(String[] args) {
        int[] arrayList = {42, 435, 75, 64, 7, 34, 6346, 18, 976, 875, 4354, 43};
        System.out.println("Minimal value of array is: " + minValue(arrayList));
        System.out.println("Maximal value or array is: " + maxValue(arrayList));

    }

    public static int minValue(int[] array) {
        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    public static int maxValue(int[] array) {
        int maxValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxValue < array[i]) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }
}
