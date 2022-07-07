package homework.lesson8;

import java.util.Scanner;

public class SpecificValue {
    public static void main(String[] args) {
        int[] arrayList = {523, 56, 76, 87, 965, 546, 978, 8, 34, 658, 2};
        System.out.println("Introduce value that you want to check: ");
        Scanner scanner = new Scanner(System.in);
        int checkValue = scanner.nextInt();
        int response = 0;
        for (int intermediate : arrayList) {
            //for (int i = 0; i < arrayList.length; i++) {
            if (checkValue == intermediate) {
                response = intermediate;

            }
            break;
        }
        if (response != 0) {
            System.out.println("Introduced value " + checkValue + " is  contained in array.");
        } else {
            System.out.println("Introduced value " + checkValue + " is not contained in array.");
        }
    }


}


