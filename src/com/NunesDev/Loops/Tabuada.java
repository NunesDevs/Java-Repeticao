package com.NunesDev.Loops;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Qual numero deseja saber a tabuada? ");
        num = scan.nextInt();

        System.out.println("Tabuada do: " + num);

        for( int i = 1; i <= 10; i ++){
            System.out.println(num + " x " + i +" = " + (num*i));
        }
    }
}
