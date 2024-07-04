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
public class NewClass14 {
   



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a altura (em metros):");
        double altura = scanner.nextDouble();

        System.out.println("Digite o gênero (M para masculino, F para feminino):");
        char genero = scanner.next().charAt(0);

        double pesoIdeal;
        if (genero == 'M' || genero == 'm') {
            pesoIdeal = 72.7 * altura - 58;
            System.out.println("O peso ideal para um homem com essa altura é: " + pesoIdeal + " kg");
        } else if (genero == 'F' || genero == 'f') {
            pesoIdeal = 62.1 * altura - 44.7;
            System.out.println("O peso ideal para uma mulher com essa altura é: " + pesoIdeal + " kg");
        } else {
            System.out.println("Erro: Gênero inválido. Por favor, insira M para masculino ou F para feminino.");
        }
    }
}
