import java.util.Scanner;
/**
 * 
 * 
 * This runs the BankAccount savings account program. 
 * Bank Account Demo Class.
 *
 * @author Sana Abbas
 * @since 10/31/26
 * @version 21.0.6
 */
public class BankAccountDemo
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int choice = 0;

        while (choice != 1 && choice != 2)
        {
            System.out.print(
                "Press 1 to use whole dollars or 2 to use currency: "
            );
            choice = keyboard.nextInt();
        }

        if (choice == 1)
        {
            useWholeDollarMode();
        }
        else
        {
            useCurrencyMode();
        }
    }

    // this is menu 1
    /**
     * Runs the bank account program using whole-dollar amounts.
     */
    public static void useWholeDollarMode()
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("What is your starting balance: $");
        int balance = keyboard.nextInt();

        System.out.print(
            "What is your interest rate? (ie enter 4.4 for 4.4%): "
        );
        double intRate = keyboard.nextDouble();

        System.out.print("How many months do you want to calculate? ");
        int counter = keyboard.nextInt();

        System.out.println("==================================");

        BankAccount bankAccount = new BankAccount(balance, intRate);

        for (int i = 1; i <= counter; i++)
        {
            System.out.print("Enter Month " + i + " deposits $");
            bankAccount.makeDeposit(keyboard.nextInt());

            System.out.print("Enter Month " + i + " withdraws $");
            bankAccount.makeWithdraw(keyboard.nextInt());

            bankAccount.calcInterest();
        }

        System.out.printf(
            "\nEnding balance:\n$%,.2f",
            bankAccount.getBalance()
        );
        System.out.printf(
            "\nTotal deposits:\n$%,.2f",
            bankAccount.getDeposit()
        );
        System.out.printf(
            "\nTotal withdraws:\n$%,.2f",
            bankAccount.getWithdraw()
        );
        System.out.printf(
            "\nTotal interest:\n$%,.2f\n",
            bankAccount.getInterest()
        );
    }

    // this is menu 2
    /**
     * Runs the bank account program using amounts with cents.
     */
    public static void useCurrencyMode()
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("What is your starting balance: $");
        double balance = keyboard.nextDouble();

        System.out.print(
            "What is your interest rate? (ie enter 4.4 for 4.4%): "
        );
        double intRate = keyboard.nextDouble();

        System.out.print("How many months do you want to calculate? ");
        int counter = keyboard.nextInt();

        System.out.println("===============================");

        BankAccount bankAccount = new BankAccount(balance, intRate);

        for (int i = 1; i <= counter; i++)
        {
            System.out.print("Enter Month " + i + " deposits $");
            bankAccount.makeDeposit(keyboard.nextDouble());

            System.out.print("Enter Month " + i + " withdraws $");
            bankAccount.makeWithdraw(keyboard.nextDouble());

            bankAccount.calcInterest();
        }

        System.out.printf(
            "\nEnding balance:\n$%,.2f",
            bankAccount.getBalance()
        );
        System.out.printf(
            "\nTotal deposits:\n$%,.2f",
            bankAccount.getDeposit()
        );
        System.out.printf(
            "\nTotal withdraws:\n$%,.2f",
            bankAccount.getWithdraw()
        );
        System.out.printf(
            "\nTotal interest:\n$%,.2f\n",
            bankAccount.getInterest()
        );
    }
}
