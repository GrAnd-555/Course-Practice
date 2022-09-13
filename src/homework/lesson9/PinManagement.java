package homework.lesson9;

import java.util.Scanner;

public class PinManagement {
    static final int PIN = 3445;

    public static void main(String[] args) {
     enterPin();
    }

    public static void enterPin() {
        System.out.println("Please introduce your PIN code: ");
        Scanner scanner = new Scanner(System.in);
        int tries= 0;
        for (int i = 0; i < 3; i++) {
            int introducedPin = scanner.nextInt();
            tries++;
            if (introducedPin == PIN) {
                System.out.println("Correct, welcome back.");
                break;
            } else if (tries ==3){
                System.out.println("Sorry but you have been locked out.");
            } else
                System.out.println("Incorrect, try again");
            }

        }

    }
//4. You have to design the code such that the user has only three tries to guess the correct pin of the account.
// You set the pin as a constant with a final attribute. When correct, display “Correct, welcome back.”;  When incorrect,
// display “Incorrect, try again.”. When ran out of tries, display “Sorry but you have been locked out.”