package com.NunesDev.Loops;
import java.util.Scanner;
import com.NunesDev.Leitura;

public class MaiorEMedia {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in, "UTF-8")) {
            int maior = Integer.MIN_VALUE;
            long soma = 0;
            for (int i=0; i<5; i++) {
                System.out.println("Número:");
                Integer numero = Leitura.inteiro(input, Integer.MIN_VALUE, Integer.MAX_VALUE);
                if (numero == null) return;
                maior = Math.max(maior, numero); soma += numero;
            }
            System.out.println("Média: " + soma / 5.0);
            System.out.println("Maior: " + maior);
        }
    }
}
