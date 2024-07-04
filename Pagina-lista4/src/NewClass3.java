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
public class NewClass3 {
    public static void main(String[] args) {
        Scanner marcador = new Scanner (System.in);
        System.out.println("--------------------------------");
        System.out.println(" Especificação  | Código | Lanche");
        System.out.println("Cachorro quente |  100   |  4,00 ");
        System.out.println("  X Salada      |  101   |  6,00 ");
        System.out.println(" Bauru com ovo  |  102   |  6,50 ");
        System.out.println(" Refrigerante   |  103   |  2,00 ");
        int codigo = 0;
        int quantidade;
        float preço;
        System.out.println("digite o codigo ");
        codigo = marcador.nextInt();
        System.out.println("digite a quantidade ");
        quantidade = marcador.nextInt ();
        
        for (int i = 100; i==codigo; i++ ){
            preço = quantidade*4;
            System.out.println("o valor a ser pago é :" + preço);
            
        }
         for (int i = 101; i==codigo; i++ ){
            preço = quantidade*6;
            System.out.println("o valor a ser pago é : " + preço);
            
    }
     for (int i = 102; i==codigo; i++ ){
            preço = (float) (quantidade*6.50);
            System.out.println("o valor a ser pago é : " + preço);
            
}
     for (int i = 103; i==codigo; i++ ){
            preço = (float) (quantidade*2);
            System.out.println("o valor a ser pago é : " + preço);
            
}
    }
}

