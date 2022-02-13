package homework.lesson7;
import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Please introduce a positive integer number: ");
        int number= scanner.nextInt();
        int reverse = 0;
        do {
            int intermediateNumber = number % 10;
            reverse = reverse * 10 + intermediateNumber;
            number = number/10;
            }  while (number != 0);
       System.out.println("The reverse of the given number is: " + reverse);
    }

    }

