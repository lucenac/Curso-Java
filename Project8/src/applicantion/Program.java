package applicantion;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;


        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();

        System.out.print("Is there na initial deposit (y/n)? ");
        char condition = sc.next().charAt(0);

        double deposit = 0.0;
        if (condition == 'y') {
            System.out.print("Enter initial deposit value: ");
            deposit = sc.nextDouble();
            account = new Account(number, holder, deposit);
        }
        else {
            account = new Account(number, holder);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account.toString());
        System.out.println();

        System.out.print("Enter a deposit value: ");
        double amount = sc.nextDouble();
        account.setDeposit(account.deposit(amount));
        System.out.println("Updated account data: ");
        System.out.println(account.toString());

        System.out.println();

        System.out.print("Enter a withdraw value: ");
        amount = sc.nextDouble();
        account.setDeposit(account.newWithdraw(amount));
        System.out.println("Updated account data: ");
        System.out.println(account.toString());

        sc.close();
    }
}
