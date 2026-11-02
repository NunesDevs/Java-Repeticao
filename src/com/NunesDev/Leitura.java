package com.NunesDev;
import java.util.Scanner;
public final class Leitura {
    private Leitura() { }
    public static Integer inteiro(Scanner input, int minimo, int maximo) {
        while (input.hasNextLine()) {
            try {
                int value = Integer.parseInt(input.nextLine().trim());
                if (value >= minimo && value <= maximo) return value;
            } catch (NumberFormatException ignored) { }
            System.out.println("Informe um inteiro entre " + minimo + " e " + maximo + ".");
        }
        return null;
    }
}
