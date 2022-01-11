package com.NunesDev.Arrays;

import java.util.Random;
import java.util.Scanner;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int[] num = new int[20];

        for( int i = 0 ; i< num.length; i ++){
            int memory = random.nextInt(100);
            num[i] = memory;

        }
        System.out.println("Numeros aleatórios: ");
        for ( int memory : num ) {
            System.out.println(memory + " ");

        }

        System.out.println("Sucessores numeros aleatórios: ");
        for ( int memory : num ) {
            System.out.println((memory + 1) + " ");

        }

        System.out.println("Antecessores numeros aleatórios: ");
        for ( int memory : num ) {
            System.out.println((memory - 1) + " ");

        }

    }
}
