package com.NunesDev.Loops;
import java.util.Scanner;
import com.NunesDev.Leitura;

public class NotaIdade {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in, "UTF-8")) {
            while (true) {
                System.out.println("Nome (0 para sair):");
                if (!input.hasNextLine()) return;
                String nome = input.nextLine().trim();
                if (nome.equals("0")) return;
                if (nome.isEmpty()) { System.out.println("Nome obrigatório."); continue; }
                System.out.println("Idade de 0 a 130:");
                Integer idade = Leitura.inteiro(input, 0, 130);
                if (idade == null) return;
                System.out.println(nome + ": " + idade + " anos");
            }
        }
    }
}
