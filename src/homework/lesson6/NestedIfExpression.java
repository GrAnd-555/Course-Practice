package homework.lesson6;

import java.util.Scanner;

public class NestedIfExpression {
    public static void main(String[] args) {
        Scanner tempInput = new Scanner(System.in);
        System.out.println("Introduceti valorile: temperatura, temperatura minima, temperatura maxima: ");
        int temperature = tempInput.nextInt();
        int minTemp = tempInput.nextInt();
        int maxTemp = tempInput.nextInt();
        tempInput.close();

        if (temperature > maxTemp) {
            System.out.println("Porridge is too hot.");
        } else if (temperature < minTemp) {
            System.out.println("Porridge is too cold.");
        } else {
            System.out.println("Porridge is just right.");
        }

    }
}
