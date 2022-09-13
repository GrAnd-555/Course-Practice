package homework.Lesson4;

public class TaxCalculator {
    public static void main(String[] args){
       double price = 170.5;
       double tax =1.3;
       int quantity = 56;
       double total = price * quantity * tax;
       System.out.println("Total cost with tax is: " +total);
    }
}
