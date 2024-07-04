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
public class NewClass13 {
    public static void main(String[] args) {
       int produto1;
       int produto2;
       int produto3;
       boolean abaixo;
        Scanner marcador = new Scanner (System.in);
        System.out.println("digite a quantidade de estoque do produto 1");
        produto1 = marcador.nextInt();
        System.out.println("digite a quantidade de estoque do produto 2");
        produto2= marcador.nextInt();
        System.out.println("digite a quantidade de estoque do produto 3");
        produto3 = marcador.nextInt();      
        
        if (produto1 < 30) {
            abaixo = true;
            System.out.println("produto 1 abaixo do estoque minimo");
        }
        else {
            abaixo = false;
            System.out.println("produto 1 acima do estoque minimo");
        }
         if (produto2 < 30) {
            abaixo = true;
            System.out.println("produto 2 abaixo do estoque minimo");
        }
        else {
            abaixo = false;
            System.out.println("produto 2 acima do estoque minimo");    
    }
         if (produto3 < 30) {
            abaixo = true;
            System.out.println("produto 3 abaixo do estoque minimo");
        }
        else {
            abaixo = false;
            System.out.println("produto 3 acima do estoque minimo");
}
    }
}
