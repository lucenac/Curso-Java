package apllication;

import model.entities.Account;
import model.excepitions.DomainExcepition;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Initial Balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account acc = new Account(number, name, balance, withdrawLimit);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            double withdrawAmount = sc.nextDouble();
            acc.withdraw(withdrawAmount);

            System.out.println("New balance: " + acc.getBalance());
        }
        catch (DomainExcepition e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Unexpected error");
        }
    }
}
