package Lesson5HomeWork;
import java.util.Scanner;

public class OddOrEvenCheck {
    public static void main(String[] args){
     Scanner input= new Scanner(System.in);
     int number;
     System.out.println("Introduceti un numar intreg:");
     number = input.nextInt();

     if ( number % 2 == 0 ){
         System.out.println("Numarul introdus: " + number + " este par!");
     } else {
          System.out.println("Numarul introdus: " + number + " este impar!");
     }
    }
}
