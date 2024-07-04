/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class NewClass10 {
    public static void main(String[] args) {
        int x;
        int y;
        int z;
        boolean isoceles;
        boolean equilatero;
        boolean escaleno;
        Scanner marcador = new Scanner (System.in);
        System.out.println("Digite o primeiro lado do triangulo");
        x = marcador.nextInt();
        System.out.println("Digite o segundo lado do triangulo");
        y = marcador.nextInt();
        System.out.println("Digite o terceiro lado do triangulo");
        z = marcador.nextInt();
        
        if (x + y > z && x + z > y && y + z > x) {
            System.out.println("Os valores podem formar um triângulo.");

            if (x == y && y == z) {
                System.out.println("Triângulo equilátero.");
            } else if (x == y || x == z || y == z) {
                System.out.println("Triângulo isósceles.");
            } else {
                System.out.println("Triângulo escaleno.");
            }
        } else {
            System.out.println("Os valores não podem formar um triângulo.");
        }
        
        
    }
    
}
