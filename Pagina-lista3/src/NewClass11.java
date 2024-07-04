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
public class NewClass11 {
  


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a hora (0 a 23):");
        int hora = scanner.nextInt();

        System.out.println("Digite os minutos (0 a 59):");
        int minuto = scanner.nextInt();

        System.out.println("Digite os segundos (0 a 59):");
        int segundo = scanner.nextInt();

        
        segundo++; 

        if (segundo == 60) {
            segundo = 0;
            minuto++; 

            if (minuto == 60) {
                minuto = 0;
                hora++; 

                if (hora == 24) {
                    hora = 0;
                }
            }
        }

        
        System.out.printf("Novo horário: %02d:%02d:%02d%n", hora, minuto, segundo);
    }
}
