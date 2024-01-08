package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Employee> list = new ArrayList<>();

        System.out.print("How many people will be registered? ");
        int qtd = sc.nextInt();

        for (int i = 1; i <= qtd; i++) {
            System.out.println("Employee #" + i + ": ");
            System.out.print("Id: ");
            int id = sc.nextInt();
            while (hasId(list, id)) { // Check if there is any Id
                System.out.println("Id already taken. Try again: ");
                id = sc.nextInt();
            }

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            list.add(new Employee(id, name, salary));

        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary incrase: ");
        int id = sc.nextInt();
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null) {
            System.out.println("This id not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percentege = sc.nextDouble();
            emp.increaseSalary(percentege);
        }


        System.out.println();
        System.out.println("List of empĺoyees: ");
        for (Employee x : list) {
            System.out.println(x);
        }

    }

    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}