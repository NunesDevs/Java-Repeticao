package com.NunesDev.Loops;


import java.util.Scanner;

public class Notas {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        while(nota < 0 | nota > 10){
            System.out.println("Nota invalida! Digite novamente: ");
            nota = scan.nextInt();
        }
        System.out.println("Nota valida!");
    }
}
