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
public class NewClass15 {
    public static void main(String[] args) {
        int idade;
        boolean categoria;
        Scanner marcador = new Scanner (System.in);
        System.out.println("digite a idade do nadador");
        idade = marcador.nextInt();
        
        if (idade>= 5 && idade<=10) {
            categoria = true;
            System.out.println("sua categoria é infantil (5 a 10 anos)");
        }
         if (idade>= 11 && idade<=17) {
            categoria = true;
            System.out.println("sua categoria é juvenil (11 a 17 anos)");
    }
          if (idade>= 18 && idade<=60) {
            categoria = true;
            System.out.println("sua categoria é adulto (18 a 60 anos)");
}
          
    }
}