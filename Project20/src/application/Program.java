package application;


import java.util.Scanner;

import entites.Rent;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        Rent[] vect = new Rent[10];


        for (int i =1; i<=n; i++) {
            System.out.println("Rent #"+ (i)+":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.next();

            System.out.print("Room: ");
            int roomNumber = sc.nextInt();

            vect[roomNumber] = new Rent(name, email);
        }

        System.out.println("Busy rooms:");
        for (int i = 1; i < vect.length; i++) {
            if (vect[i] != null){
                System.out.println(i + ": " + vect[i].toString());
            }

        }
        sc.close();
    }

}
