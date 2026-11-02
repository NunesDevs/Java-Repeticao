package com.NunesDev.Loops;
import java.util.Scanner;
import com.NunesDev.Leitura;
import java.math.BigInteger;
public class Fatorial {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in, "UTF-8")) {
            System.out.println("Número de 0 a 10000:");
            Integer numero = Leitura.inteiro(input, 0, 10000);
            if (numero == null) return;
            BigInteger resultado = BigInteger.ONE;
            for (int i=2; i<=numero; i++) resultado = resultado.multiply(BigInteger.valueOf(i));
            System.out.println(numero + "! = " + resultado);
        }
    }
}
