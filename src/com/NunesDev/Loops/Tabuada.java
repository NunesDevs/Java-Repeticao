package com.NunesDev.Loops;
import java.util.Scanner;
import com.NunesDev.Leitura;

public class Tabuada {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in, "UTF-8")) {
            System.out.println("Número da tabuada:");
            Integer numero = Leitura.inteiro(input, Integer.MIN_VALUE, Integer.MAX_VALUE);
            if (numero == null) return;
            for (int i=1; i<=10; i++) System.out.println(numero + " x " + i + " = " + ((long)numero*i));
        }
    }
}
