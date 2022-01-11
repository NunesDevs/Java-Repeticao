package com.NunesDev.Loops;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        int entrada;
        int qntPar = 0;
        int qntImpar = 0;

        System.out.println("Quantidade de numeros: ");
        num = scan.nextInt();

        int i = 0;

        do {
            System.out.println("Numero: ");
            entrada = scan.nextInt();
            if (entrada % 2 == 0) qntPar++;
            else qntImpar++;
            i ++;
        }while( i < num);

        System.out.println("Quantidadespares: " + qntPar);
        System.out.println("Quantidade impares: " + qntImpar);
    }
}
