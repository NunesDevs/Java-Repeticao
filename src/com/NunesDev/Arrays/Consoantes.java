package com.NunesDev.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.Normalizer;
import java.util.Locale;

public class Consoantes {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in, "UTF-8")) {
            List<String> consoantes = new ArrayList<>();
            for (int i=0; i<6;) {
                System.out.println("Letra:");
                if (!input.hasNextLine()) return;
                String letra = input.nextLine().trim();
                String normalized = Normalizer.normalize(letra, Normalizer.Form.NFD).replaceAll("\\p{M}", "").toLowerCase(Locale.ROOT);
                if (!normalized.matches("[a-z]")) { System.out.println("Informe uma única letra."); continue; }
                if (!"aeiou".contains(normalized)) consoantes.add(letra);
                i++;
            }
            System.out.println("Consoantes: " + consoantes);
            System.out.println("Quantidade de consoantes: " + consoantes.size());
        }
    }
}
