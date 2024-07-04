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
public class NewClass8 {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String cpf;
        double rendaMensal;
        char classeRenda;
        
        while (true) {
            System.out.println("Informe o CPF do contribuinte (ou digite '00' para encerrar):");
            cpf = scanner.nextLine();
            
            if (cpf.equals("00")) {
                System.out.println("Programa encerrado.");
                break;
            }
            
            System.out.println("Informe a renda mensal do contribuinte:");
            rendaMensal = scanner.nextDouble();
            
            scanner.nextLine(); // Limpar o buffer
            
            System.out.println("Informe a classe de renda do contribuinte (A, B, C, D ou E):");
            classeRenda = scanner.next().charAt(0);
            
            double desconto = 0;
            String aliquota = "";
            
            switch (classeRenda) {
                case 'A':
                    aliquota = "Isento";
                    break;
                case 'B':
                    aliquota = "5%";
                    desconto = rendaMensal * 0.05;
                    break;
                case 'C':
                    aliquota = "10%";
                    desconto = rendaMensal * 0.10;
                    break;
                case 'D':
                    aliquota = "15%";
                    desconto = rendaMensal * 0.15;
                    break;
                case 'E':
                    aliquota = "20%";
                    desconto = rendaMensal * 0.20;
                    break;
                default:
                    System.out.println("Classe de renda inválida.");
                    continue;
            }
            
            System.out.println("CPF: " + cpf);
            System.out.println("Alíquota de desconto: " + aliquota);
            System.out.printf("Valor a ser descontado: R$%.2f%n", desconto);
        }
        
        scanner.close();
    }
}

    

