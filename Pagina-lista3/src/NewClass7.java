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
public class NewClass7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário:");
        String nome = scanner.nextLine();

        System.out.println("Digite a categoria do funcionário (A, B, C, D, E, F, G ou H):");
        char categoria = scanner.next().charAt(0); 

        System.out.println("Digite o salário atual do funcionário:");
        double salarioAtual = scanner.nextDouble();

        double aumento;
        switch (categoria) {
            case 'A':
            case 'H':
                aumento = salarioAtual * 0.10; 
            case 'B':
            case 'D':
            case 'E':
                aumento = salarioAtual * 0.15; 
                break;
            case 'C':
            case 'F':
                aumento = salarioAtual * 0.25; 
                break;
            default:
                aumento = salarioAtual * 0.30; 
        }

        double salarioReajustado = salarioAtual + aumento;

        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Categoria do funcionário: " + categoria);
        System.out.println("Salário reajustado: R$ " + salarioReajustado);

        scanner.close();
    }
}
    
