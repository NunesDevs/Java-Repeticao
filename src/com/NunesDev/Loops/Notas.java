package com.NunesDev.Loops;
import java.util.Scanner;
import com.NunesDev.Leitura;

public class Notas {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in, "UTF-8")) {
            System.out.println("Nota de 0 a 10:");
            if (Leitura.inteiro(input, 0, 10) != null) System.out.println("Nota válida!");
        }
    }
}
