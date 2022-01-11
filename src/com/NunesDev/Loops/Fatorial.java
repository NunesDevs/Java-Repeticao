package com.NunesDev.Loops;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        System.out.println("Entre com o numero: ");
        num = scan.nextInt();

        int mult = 1;
        System.out.println(num +"! = ");
        for( int i = num; i >= 1 ; i -- ){

        mult = mult * i;



        }
        System.out.println(mult);
    }
}
