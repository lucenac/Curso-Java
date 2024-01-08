package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student notes = new Student();

        String name = sc.nextLine();
        notes.n1 = sc.nextDouble();
        notes.n2 = sc.nextDouble();
        notes.n3 = sc.nextDouble();

        double media = notes.media();
        String condicion = notes.condicion();
        System.out.println("FINAL GRADE = "+media);
        System.out.println(condicion);

        sc.close();
    }
}
