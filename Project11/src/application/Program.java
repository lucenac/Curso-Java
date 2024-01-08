package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int qnt = sc.nextInt();
        String[] nome = new String[qnt];
        int[] idade = new int[qnt];
        int contIdade = 0;
        double altura = 0;

        for (int i = 0; i < qnt; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa");
            sc.nextLine();
            System.out.print("Nome: ");
            nome[i] = sc.nextLine();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            if (idade[i] < 16) {
                contIdade +=1;
            }
            System.out.print("Altura: ");
            altura += sc.nextDouble();
        }

        double porcentagem = (double) contIdade * 100 / (double) idade.length;

        System.out.printf("Altura média: %.2f\n", altura/qnt);
        System.out.println("Pessoas com menos de 16 anos: " + porcentagem + "%");
        for (int i = 0; i < qnt; i++) {
            if (idade[i] < 16) {
                System.out.println(nome[i]);
            }
        }
    }
}
