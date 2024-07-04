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
public class NewClass5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro:");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro:");
        int num2 = scanner.nextInt();

        System.out.println("Digite o terceiro número inteiro:");
        int num3 = scanner.nextInt();

        int menor = num1; 

        if (num2 < menor) {
            menor = num2; 
        }

        if (num3 < menor) {
            menor = num3; 
        }

        System.out.println("O menor número é: " + menor);

    }
}
