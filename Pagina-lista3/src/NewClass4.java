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
public class NewClass4 {
    public static void main(String[] args) {
        int n1 = 0;
        boolean numero;
        Scanner marcador = new Scanner (System.in);
        System.out.println("digite um numero");
        n1 = marcador.nextInt();
        if (n1 <= 10) {
            numero = true;
            System.out.println("F1");
            
        }
        else if (n1 > 10 && n1<=100){
            numero = true;
            System.out.println("F2");
        }
        else if (n1>100){
            numero = true;
            System.out.println("F3");
        }
    }
    
}
