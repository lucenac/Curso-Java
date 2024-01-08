package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rectangle width and height:");

         Rectangle rectangle = new Rectangle();

         rectangle.h = sc.nextDouble();
         rectangle.w = sc.nextDouble();

         double area = rectangle.area();
         double perimeter = rectangle.perimeter();
         double diagonal = rectangle.diagonal();

        System.out.printf("AREA = %.2f\n", area);
        System.out.printf("PERIMETER = %.2f\n", perimeter);
        System.out.printf("DIAGONAL = %.2f\n", diagonal);

    }
}
