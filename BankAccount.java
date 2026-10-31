/**
 *
 *
 *This class (BankAccount class) will repesents a bank account 
 * that tracks balance, deposits,
 * withdrawals, and interest earned. Bank Account class.
 *
 * @author Sana Abbas
 * @since 10/31/26
 * @version 21.0.6
 */
public class BankAccount
{
    //this is the account balances/transaction totals
    private double balance;
    private double deposit;
    private double withdraw;
    private double interest;

    //the monthly interest rate
    private double monthlyIntRate;

    // creating a bank account with a zero balance and a default
    // this is going to be the annual interest rate ( that is of 4.4%)
    public BankAccount()
    {
        balance = 0.0;
        deposit = 0.0;
        withdraw = 0.0;
        interest = 0.0;
        monthlyIntRate = 0.044 / 12;
    }

    /** now creating an account with a whole-dollar starting balance.
    * inBalance is the starting balance.
    * intRate is the annual interest rate as a percentage.
    */ 
    public BankAccount(int inBalance, double intRate)
    {
        balance = inBalance;
        deposit = 0.0;
        withdraw = 0.0;
        interest = 0.0;
        monthlyIntRate = (intRate / 100) / 12;
    }

    /**
    * creates an account with a starting balance that may include cents.
    * inBalance is the starting balance.
    * intRate is the annual interest rate as a percentage.
    */ 
    public BankAccount(double inBalance, double intRate)
    {
        balance = inBalance;
        deposit = 0.0;
        withdraw = 0.0;
        interest = 0.0;
        monthlyIntRate = (intRate / 100) / 12;
    }

    //this adds a deposit to the account
    //the amount is the amount deposited
    public void makeDeposit(double add)
    {
        balance += add;
        deposit += add;
    }

    // this will add a whole-dollar deposit to the account.
    // the amount is the whole-dollar amount deposited
    public void makeDeposit(int add)
    {
        balance += add;
        deposit += add;
    }

    // this subtracts a withdrawal from the account
    // this is the amount that is the amount that is withdrawn
    public void makeWithdraw(double sub)
    {
        balance -= sub;
        withdraw += sub;
    }

    /**
     * this subtracts a whole-dollar withdrawal from the account
     * amount is the whole-dollar amount that is withdrawned
     */ 
    public void makeWithdraw(int sub)
    {
        balance -= sub;
        withdraw += sub;
    }

    /** 
     * the monthly interest calculated when the balance is positive
     * adds the interest to the balance and total interest earned.
     */ 
    public void calcInterest()
    {
        if (balance > 0)
        {
            double monthlyInterest = balance * monthlyIntRate;
            balance += monthlyInterest;
            interest += monthlyInterest;
        }
    }

    // this will return the current account balance
    public double getBalance()
    {
        return balance;
    }

    // this is the returned total amount that is deposited
    public double getDeposit()
    {
        return deposit;
    }

    // this is the total amount that is withdrawned
    public double getWithdraw()
    {
        return withdraw;
    }

    // this is the total interest thats earned
    public double getInterest()
    {
        return interest;
    }
}
