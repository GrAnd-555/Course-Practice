package homework.lesson9;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        System.out.println("Introduce the width and the length of rectangle: ");
        Scanner scanner = new Scanner(System.in);
        Area rectangle1 = new Area();
        rectangle1.setDim(scanner.nextInt(), scanner.nextInt());
        scanner.close();
        System.out.println("The area of introduced rectangle is: " + rectangle1.calculateArea());
    }
}
