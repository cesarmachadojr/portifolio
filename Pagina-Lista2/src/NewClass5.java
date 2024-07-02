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
public class NewClass {
     public static void main(String[] args) {
        float tempo;
        int velocidade;
        int distancia = 0;
        boolean Perigo;
        System.out.println("digite o tempo e a valociade em m/s");
        Scanner marcador = new Scanner (System.in);
        tempo = marcador.nextFloat();
        velocidade = marcador.nextInt();
        System.out.println("distancia");
        System.out.println(tempo*velocidade);
        if (distancia < 200 ) {
            Perigo = true;
            System.out.println("perigo");
            
            
            
        }
        else if (distancia > 200) {
            Perigo = false ;
            System.out.println("sem perigo");
         
     }
        
                
    }
    
}

   
