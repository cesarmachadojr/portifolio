/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class dasafio {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tamanho da pista (em Km):");
        double tamanhoPista = scanner.nextDouble();

        System.out.println("Informe o peso do avião (em toneladas):");
        double pesoAviao = scanner.nextDouble();

        System.out.println("Informe a visibilidade (em metros):");
        int visibilidade = scanner.nextInt();

        System.out.println("Informe a intensidade da chuva (em mm) ou 0 caso não esteja chovendo:");
        double intensidadeChuva = scanner.nextDouble();

        System.out.println("Informe o número de passageiros:");
        int numPassageiros = scanner.nextInt();

        System.out.println("O avião possui sistema de decolagem automatizada? (true/false):");
        boolean sistemaDecolagemAutomatizada = scanner.nextBoolean();

        boolean podeDecolar = true;

        if (tamanhoPista < 1.5) {
            if (pesoAviao >= 40) {
                podeDecolar = false;
            }
        } else if (tamanhoPista >= 1.5 && tamanhoPista <= 2) {
            if (pesoAviao > 60) {
                podeDecolar = false;
            }
        }

        if (visibilidade < 20 && !sistemaDecolagemAutomatizada) {
            podeDecolar = false;
        }

        if (intensidadeChuva > 5) {
            podeDecolar = false;
        }

        if (numPassageiros > 100 && intensidadeChuva > 0) {
            podeDecolar = false;
        }

        if (podeDecolar) {
            System.out.println("O avião pode decolar.");
        } else {
            System.out.println("O avião não pode decolar.");
        }

    }
}

    
