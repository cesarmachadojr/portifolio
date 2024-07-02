/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class NewClass13 {
    public static void main(String[] args) {
        int a ;
        int b;
        int c;
        int soma;
        boolean maior;
        Scanner marcador = new Scanner (System.in);
        System.out.println("digite um numero");
        a = marcador.nextInt();
        System.out.println("digite um numero");
        b = marcador.nextInt();
        System.out.println("digite um numero");
        c = marcador.nextInt ();
        soma = a+b ;
        System.out.println("o resultado da soma é ");
        System.out.println(soma);
        
        if (soma > c ) {
            maior = true ;
            System.out.println("maior");
        }
        else if (soma < c ) {
            maior = false ;
            System.out.println("menor");
        }
    }
            
    
}
