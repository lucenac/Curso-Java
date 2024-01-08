package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Name:");
        String name = sc.nextLine();
        employee.name = name;

        System.out.print("Gross Salary:");
        employee.gs = sc.nextDouble();

        System.out.print("Tax:");
        employee.t = sc.nextDouble();

        double netSalary = employee.netSalary(employee.gs, employee.t);

        System.out.println();
        System.out.printf("Employee: %s, R$%.2f\n", name, netSalary);

        System.out.println();
        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.increseSalary(percentage);

        System.out.println();
        System.out.println(employee);

    }
}
