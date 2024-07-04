/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class NewClass9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Digite o número da conta:");
        String numeroConta = scanner.nextLine();

        System.out.println("Digite o saldo atual da conta:");
        double saldo = scanner.nextDouble();

        System.out.println("Digite o tipo de operação a ser realizada:");
        System.out.println("1 - Depósito");
        System.out.println("2 - Saque");
        int tipoOperacao = scanner.nextInt();

        System.out.println("Digite o valor da operação:");
        double valorOperacao = scanner.nextDouble();

       
        if (tipoOperacao == 1) {
            saldo += valorOperacao; 
        } else if (tipoOperacao == 2) {
            saldo -= valorOperacao; 
        } else {
            System.out.println("Tipo de operação inválido.");
            return;
        }

        System.out.println("Novo saldo: " + saldo);
        if (saldo < 0) {
            System.out.println("Conta estourada.");
        }
    }
}

