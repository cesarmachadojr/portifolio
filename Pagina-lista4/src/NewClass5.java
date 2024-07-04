/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class NewClass5 {
   


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeOtimo = 0;
        int somaIdadeRuim = 0;
        int quantidadeRuim = 0;
        int maiorIdade = Integer.MIN_VALUE;
        int menorIdade = Integer.MAX_VALUE;

        for (int i = 0; i < 20; i++) {
            System.out.println("Informe a idade do espectador " + (i + 1) + ":");
            int idade = scanner.nextInt();

            System.out.println("Informe a opinião em relação ao filme (A - Ótimo, B - Bom, C - Regular, D - Ruim):");
            String opiniao = scanner.next();

            if (opiniao.equalsIgnoreCase("A")) {
                quantidadeOtimo++;
            }

            if (opiniao.equalsIgnoreCase("D")) {
                somaIdadeRuim += idade;
                quantidadeRuim++;
            }

            if (idade > maiorIdade) {
                maiorIdade = idade;
            }

            if (idade < menorIdade) {
                menorIdade = idade;
            }
        }

        double mediaIdadeRuim = quantidadeRuim > 0 ? (double) somaIdadeRuim / quantidadeRuim : 0;
        int diferencaIdade = maiorIdade - menorIdade;

        System.out.println("Quantidade de respostas 'Ótimo': " + quantidadeOtimo);
        System.out.println("Média de idade das pessoas que responderam 'Ruim': " + mediaIdadeRuim);
        System.out.println("Diferença de idade entre a pessoa de maior idade e a de menor idade: " + diferencaIdade);

        scanner.close();
    }
}
