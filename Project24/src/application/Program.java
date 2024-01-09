package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        String dateInput = sc.nextLine();
        LocalDate date = LocalDate.parse(dateInput, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        Client client = new Client(name, email, date);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        String status = sc.nextLine();
        LocalDateTime moment = LocalDateTime.now();

        System.out.print("How many items to this order? ");
        int qnt = sc.nextInt();

        Order order = new Order(moment, OrderStatus.valueOf(status), client);

        for (int i = 1; i <= qnt; i++) {
            sc.nextLine();
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            String nameProduct = sc.nextLine();
            System.out.print("Product price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            Product product = new Product(nameProduct, price);
            OrderItem orderItem = new OrderItem(quantity, price, product);
            order.addItem(orderItem);
        }



        System.out.println();
        System.out.println("ORDER SUMMARY:");

        System.out.println(order.toString());



    }

}
