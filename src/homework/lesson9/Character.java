package homework.lesson9;

import java.util.Scanner;

public class Character {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce String:");
        String input = scanner.nextLine();
        char search = 'e';
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == search)
                count++;
        }
        ystem.out.println("The Character '" + search + "' appears " + count + " times.");
    }
}
