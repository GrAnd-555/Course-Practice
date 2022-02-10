package Lesson5HomeWork;

import java.util.Scanner;

public class FloatPointNumber {
    public static void main(String[] args) {
        System.out.println("Introduce a float number: ");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        if (a == 0) {
            System.out.println("zero");
        } else if (a > 0) {
            if (a < 1) {
                System.out.println("positive small");
            } else if (a < 1_000_000) {
                System.out.println("positive");
            } else
                System.out.println("positive large");
        } else if (Math.abs(a) < 1) {
            System.out.println("negative small");
        } else if (Math.abs(a) < 1_000_000) {
            System.out.println("negative");
        } else {
            System.out.println("negative large");
        }
    }
}
