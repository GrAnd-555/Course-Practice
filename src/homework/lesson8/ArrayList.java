package homework.lesson8;

import java.util.Scanner;

public class ArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please introduce the length of array: ");
        int[] listArray;
        listArray = new int[scanner.nextInt()];
        System.out.println("Enter the values of array:");
        for (int i = 0; i < listArray.length; i++) {
            listArray[i] = scanner.nextInt();
        }
        for (int interValue : listArray) {
            System.out.print(interValue + " ");
        }


    }
}