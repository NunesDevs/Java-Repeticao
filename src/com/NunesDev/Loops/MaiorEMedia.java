package com.NunesDev.Loops;

import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int numero;
        int maior = 0;
        int soma = 0;
        int media;
        int i = 0;
        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();
            soma = soma + numero;
            media = soma / 5;
            if(numero > maior) maior = numero;
            i = i + 1;
        } while(i < 5);
        System.out.println("Media: " + media);
        System.out.println("Maior: " + maior);
    }
}
