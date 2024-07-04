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
public class NewClass7 {
   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int bilhetesInfantisVendidos = 0;
        int bilhetesAdultosVendidos = 0;
        
        String continuar = "sim";

        while (continuar.equalsIgnoreCase("sim")) {
            System.out.println("Informe a idade do visitante:");
            int idade = scanner.nextInt();
            
            if (idade <= 12) {
                System.out.println("O visitante deve comprar um bilhete infantil.");
                bilhetesInfantisVendidos++;
            } else {
                System.out.println("O visitante deve comprar um bilhete de adulto.");
                bilhetesAdultosVendidos++;
            }
            
            System.out.println("Deseja vender outro bilhete? (sim/não):");
            continuar = scanner.next();
        }

        System.out.println("Quantidade de bilhetes infantis vendidos: " + bilhetesInfantisVendidos);
        System.out.println("Quantidade de bilhetes de adultos vendidos: " + bilhetesAdultosVendidos);

        scanner.close();
    }
}

    

