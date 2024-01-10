package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int quantity = sc.nextInt();
        sc.nextLine();
        List<Product> productsList = new ArrayList<>();

        for (int i = 1; i <= quantity; i++) {
            System.out.println("Product #"+i+" data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char condicion = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine();
                switch (condicion) {
                    case 'c':
                        Product product = new Product(name, price);
                        productsList.add(product);
                        break;

                    case 'u':
                        System.out.print("Manufacture date (DD/MM/YYYY): ");
                        LocalDate manufactureDate = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                        Product usedProduct = new UsedProduct(name, price, manufactureDate);
                        productsList.add(usedProduct);
                        break;

                    default:
                        System.out.print("Customs fee: ");
                        double customsFee = sc.nextDouble();

                        Product importedProduct = new ImportedProduct(name, price, customsFee);
                        productsList.add(importedProduct);
                        break;
                }
        }

        System.out.println();
        for (Product product : productsList) {
            System.out.println(product.priceTag());
        }
    }
}
