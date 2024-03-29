package homework.lesson11;

public class SavingAccount {
    static  double  annualInterestRate;
    private double savingsBalance;

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public SavingAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        SavingAccount.annualInterestRate = annualInterestRate;
        System.out.println("New Annual Interest Rate setted to :" + annualInterestRate);
    }

    public void calculateMonthlyInterest() {
       this.savingsBalance += (this.savingsBalance * annualInterestRate)/12;

    }
    public static void modifyInterestRate (double interestRate){
        annualInterestRate = interestRate;
    }
}
//Create class SavingsAccount. Use a static variable annualInterestRate to store the annual interest rate for all account holders.
// Each object of the class contains a private instance variable savingsBalance indicating the amount the saver currently has on deposit.
//Provide method calculateMonthlyInterest to calculate the monthly interest by multiplying the savingsBalance by annualInterestRate divided
// by 12—this interest should be added to savingsBalance. Provide a static method modifyInterestRate that sets the annualInterestRate
// to a new value.
//Write a program to test class SavingsAccount. Instantiate two savingsAccount objects, saver1 and saver2,
// with balances of $2000.00 and $3000.00, respectively. Set annualInterestRate to 4%, then calculate the current monthly interest
// and print the new balances for both savers. Next, set the annualInterestRate to 5%, calculate the next month’s interest and print
// the new balances for both savers.