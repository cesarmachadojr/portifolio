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
public class NewClass12 {
    public static void main(String[] args) {
        int angulo;
        boolean agudo;
        boolean reto;
        boolean obtuso;
        Scanner marcador = new Scanner (System.in);
        System.out.println("digite o angulo");
        angulo = marcador.nextInt();
        
        if (angulo<90) {
            agudo = true;
            System.out.println("agudo");
        }      
        if (angulo== 90 ){
            reto = true;
            System.out.println("reto");
        }
        if (angulo > 90 ){
            obtuso = true;
            System.out.println("obtuso");
        }
    }
    
}
