package com.NunesDev.Arrays;

public class OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {-7, -5, 15, 50, 8, 4};
        System.out.print("Vetor: ");
        int i =0;
        while(i < (vetor.length - 1)){
            System.out.print(vetor[i] + " ");
            i++;

        }
        System.out.print("\nVetor: ");
    for( int c = vetor.length - 1; c >= 0; c --){
        System.out.print(vetor[c] + " ");


    }

    }

}
