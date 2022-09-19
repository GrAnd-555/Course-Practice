package homework.lesson11;

public class Test {
    public static void main(String[] args) {
        SavingAccount saver1 = new SavingAccount(2000.00);
        SavingAccount saver2 = new SavingAccount(3000.00);
        SavingAccount.setAnnualInterestRate(0.04);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("New balance for saver1 = " + saver1.getSavingsBalance() );
        System.out.println("New balance for saver2 = " + saver2.getSavingsBalance() );saver1.calculateMonthlyInterest();
        SavingAccount.setAnnualInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("New balance for saver1 = " + saver1.getSavingsBalance() );
        System.out.println("New balance for saver2 = " + saver2.getSavingsBalance() );

    }

}
 //   Write a program to test class SavingsAccount. Instantiate two savingsAccount objects, saver1 and saver2,
// with balances of $2000.00 and $3000.00, respectively. Set annualInterestRate to 4%, then calculate the current monthly interest
// and print the new balances for both savers. Next, set the annualInterestRate to 5%, calculate the next month’s interest and print
// the new balances for both savers.