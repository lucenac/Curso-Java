package application;

import entities.Items;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        String inPath = "/home/lucenac/Documentos/curso_java/java_udemy/Project28/src/files/in.csv";
        List<Items> fileLines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(inPath))) {
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

        boolean out = new File("/home/lucenac/Documentos/curso_java/java_udemy/Project28/src/files" + "/out").mkdir();
        try {
            boolean outFile = new File("/home/lucenac/Documentos/curso_java/java_udemy/Project28/src/files/out" + "/summary.csv").createNewFile();
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("/home/lucenac/Documentos/curso_java/java_udemy/Project28/src/files/out/summary.csv"))) {
                for (Items i : fileLines) {
                    bw.write(i.toString());
                    bw.newLine();
                }
            }
            catch (IOException e) {
                System.out.println(e.getMessage());
            }

        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
}
