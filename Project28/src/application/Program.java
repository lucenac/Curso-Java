package application;

import entities.Items;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        String path = "/home/lucenac/Documentos/curso_java/java_udemy/Project28/src/files/in.csv";
        List<Items> fileLines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String [] items = line.split(", ");
                fileLines.add(new Items(items));
                line = br.readLine();
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        for (Items i : fileLines) {
            System.out.println(i);
        }

    }
}
