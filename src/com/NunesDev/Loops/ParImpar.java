package com.NunesDev.Loops;
import java.util.Scanner;
import com.NunesDev.Leitura;

public class ParImpar {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in, "UTF-8")) {
            System.out.println("Quantidade de números (0 a 10000):");
            Integer quantidade = Leitura.inteiro(input, 0, 10000);
            if (quantidade == null) return;
            int pares = 0;
            for (int i=0; i<quantidade; i++) {
                System.out.println("Número:");
                Integer numero = Leitura.inteiro(input, Integer.MIN_VALUE, Integer.MAX_VALUE);
                if (numero == null) return;
                if (numero % 2 == 0) pares++;
            }
            System.out.println("Quantidade pares: " + pares);
            System.out.println("Quantidade ímpares: " + (quantidade-pares));
        }
    }
}
