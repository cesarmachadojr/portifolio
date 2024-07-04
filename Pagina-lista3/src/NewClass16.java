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
public class NewClass16 {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a coordenada x do ponto:");
        double x = scanner.nextDouble();

        System.out.println("Digite a coordenada y do ponto:");
        double y = scanner.nextDouble();

        int quadrante;
        if (x > 0 && y > 0) {
            quadrante = 1;
        } else if (x < 0 && y > 0) {
            quadrante = 2;
        } else if (x < 0 && y < 0) {
            quadrante = 3;
        } else if (x > 0 && y < 0) {
            quadrante = 4;
        } else {
            quadrante = 0; 
        }

        if (quadrante != 0) {
            System.out.println("O ponto está localizado no quadrante " + quadrante);
        } else {
            System.out.println("O ponto está na origem.");
        }
    }
}


