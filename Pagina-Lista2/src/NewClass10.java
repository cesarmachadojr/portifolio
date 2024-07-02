/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class NewClass5 {
    public static void main(String[] args) {
        float numero;
        float numeroo;
        boolean igual;
        Scanner marcador = new Scanner (System.in);
        System.out.println("digite um numero");
        numero = marcador.nextFloat();
        System.out.println("digite um numero");
        numeroo = marcador.nextFloat();
        if (numero==numeroo) {
            igual= true;
            System.out.println("igual");
            
        }
        else if (numero!=numeroo){
            igual= false;
            System.out.println("diferente");
        }
    }
    
}
