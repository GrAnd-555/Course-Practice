package homework.lesson7;
import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean decision = false;

        do {
            System.out.println("Introduce 2 integer numbers: ");
            int firstNumber = scanner.nextInt();
            int secondNumber = scanner.nextInt();
            int sum = firstNumber +secondNumber;
            System.out.println("The sum of introduced numbers is: " + sum);
            System.out.print("Do you want to perform operation again? " +
                    "(Respond yes by typing 1 and No by typing 2 ): ");
            int response = scanner.nextInt();
            if (response == 1){
                decision = true;
            } else {
                decision = false;
            }
        } while (decision);
        scanner.close();
    }
}

// Write a do-while loop that asks the user to enter two numbers.
// The numbers should be added(sum) and the sum displayed.
// The loop should ask the user whether he or she wishes to perform the operation again.
// If so, the loop should repeat, otherwise it should terminate.