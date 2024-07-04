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
public class NewClass6 {
      public static void main(String[] args) {
      


        Scanner scanner = new Scanner(System.in);

        char continuar = 'S';

        while (continuar == 'S') {
            System.out.println("Digite o nome do hóspede:");
            String nomeHospede = scanner.nextLine();

            System.out.println("Digite o tipo do apartamento utilizado (A, B, C):");
            char tipoApartamento = scanner.next().charAt(0);

            System.out.println("Digite o número de diárias utilizadas pelo hóspede:");
            int numeroDiarias = scanner.nextInt();

            double valorDiaria = 0;

            switch (tipoApartamento) {
                case 'A':
                    valorDiaria = 150.00;
                    break;
                case 'B':
                    valorDiaria = 100.00;
                    break;
                case 'C':
                    valorDiaria = 75.00;
                    break;
                default:
                    System.out.println("Tipo de apartamento inválido.");
            }

            if (numeroDiarias <= 0) {
                System.out.println("O número de diárias deve ser superior a zero.");
            } else {
                double totalPagar = valorDiaria * numeroDiarias;

                System.out.println("Conta final:");
                System.out.println("Nome do hóspede: " + nomeHospede);
                System.out.println("Tipo do apartamento: " + tipoApartamento);
                System.out.printf("Valor total das diárias: R$%.2f%n", totalPagar);
            }

            System.out.println("Deseja continuar (S/N)?");
            continuar = scanner.next().charAt(0);
            scanner.nextLine(); // Limpar o buffer do scanner
        }

        scanner.close();
    }
}
