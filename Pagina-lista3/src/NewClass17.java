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
public class NewClass17 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o peso na Terra (em kg):");
        double pesoTerra = scanner.nextDouble();

        System.out.println("Digite o código do planeta:");
        System.out.println("1. Mercúrio");
        System.out.println("2. Vênus");
        System.out.println("3. Marte");
        System.out.println("4. Júpiter");
        System.out.println("5. Saturno");
        System.out.println("6. Urano");
        System.out.println("7. Netuno");
        int codigoPlaneta = scanner.nextInt();

        double[] gravidadeRelativa = {0.37, 0.88, 0.38, 2.64, 1.15, 1.17, 1.18};

        if (codigoPlaneta >= 1 && codigoPlaneta <= 7) {
            double pesoPlaneta = pesoTerra * gravidadeRelativa[codigoPlaneta - 1];
            System.out.println("Seu peso no planeta selecionado é: " + pesoPlaneta + " kg");
        } else {
            System.out.println("Código de planeta inválido.");
        }
    }
}

    

