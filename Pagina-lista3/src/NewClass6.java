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
public class NewClass6 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Digite o primeiro valor inteiro:");
        int valor1 = scanner.nextInt();

        System.out.println("Digite o segundo valor inteiro:");
        int valor2 = scanner.nextInt();

        System.out.println("Digite o terceiro valor inteiro:");
        int valor3 = scanner.nextInt();

        
        int menor, medio, maior;

      
        if (valor1 <= valor2 && valor1 <= valor3) {
            menor = valor1;
            if (valor2 <= valor3) {
                medio = valor2;
                maior = valor3;
            } else {
                medio = valor3;
                maior = valor2;
            }
        } else if (valor2 <= valor1 && valor2 <= valor3) {
            menor = valor2;
            if (valor1 <= valor3) {
                medio = valor1;
                maior = valor3;
            } else {
                medio = valor3;
                maior = valor1;
            }
        } else {
            menor = valor3;
            if (valor1 <= valor2) {
                medio = valor1;
                maior = valor2;
            } else {
                medio = valor2;
                maior = valor1;
            }
        }

        System.out.println("Os valores em ordem crescente são: " + menor + ", " + medio + ", " + maior);

        scanner.close();
    }
}

