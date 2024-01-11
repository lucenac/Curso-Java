package application;

import entities.JuridicalPerson;
import entities.LegalEntity;
import entities.NaturalPerson;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<LegalEntity> list = new ArrayList<>();
        double totalTaxes = 0.0;

        System.out.print("Enter the number of tax payers: ");
        int quantity = sc.nextInt();

        for (int i=1; i <= quantity; i++) {
            System.out.println("Tax payer #" + i + " data:");

            System.out.print("Individual or company (i/c): ");
            char condition = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();


            System.out.print("Annual Income: ");
            double annualIncome = sc.nextDouble();

            if (condition == 'i') {
                System.out.print("Health Expenditure: ");
                double healthExpenditures = sc.nextDouble();
                list.add(new NaturalPerson(name, annualIncome, healthExpenditures));
            }
            else {
                System.out.print("Number of employees: ");
                int employee = sc.nextInt();
                list.add(new JuridicalPerson(name, annualIncome, employee));
            }
        }

        System.out.println("TAXES PAID: ");
        for (LegalEntity person : list) {
            System.out.printf("%s: $ %.2f\n" ,person.getName(),person.taxes());
            totalTaxes += person.taxes();
        }
        System.out.println();
        System.out.println("TOTAL TAXES: $ " + totalTaxes);
    }
}
