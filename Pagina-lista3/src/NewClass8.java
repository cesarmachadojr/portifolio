/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author alunolages
 */
import java.util.Scanner;

public class NewClass8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leitura dos dados da conta bancária
        System.out.print("Digite o número da conta bancária: ");
        String numeroConta = scanner.nextLine();
        
        System.out.print("Digite o saldo atual da conta: ");
        double saldoAtual = scanner.nextDouble();
        
        // Leitura da operação a ser realizada
        System.out.println("Digite o tipo de operação:");
        System.out.println("1 - Depósito");
        System.out.println("2 - Saque");
        System.out.print("Escolha 1 ou 2: ");
        int tipoOperacao = scanner.nextInt();
        
        // Leitura do valor da operação
        System.out.print("Digite o valor da operação: ");
        double valorOperacao = scanner.nextDouble();
        
        // Cálculo do novo saldo
        double novoSaldo = 0.0;
        if (tipoOperacao == 1) {  // Depósito
            novoSaldo = saldoAtual + valorOperacao;
        } else if (tipoOperacao == 2) {  // Saque
            novoSaldo = saldoAtual - valorOperacao;
        } else {
            System.out.println("Opção inválida.");
            return;
        }
        
        // Verificação se o novo saldo ficou negativo
        if (novoSaldo < 0) {
            System.out.printf("Novo saldo: %.2f\n", novoSaldo);
            System.out.println("Conta estourada!");
        } else {
            System.out.printf("Novo saldo: %.2f\n", novoSaldo);
        }
        
        scanner.close();
    }
}

