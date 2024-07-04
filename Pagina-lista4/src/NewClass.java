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
public class NewClass {
    public static void main(String[] args) {
        int n1;
        int n2;
        Scanner marcador = new Scanner (System.in);
        System.out.println("digite um numero ");
        n1 = marcador.nextInt();
        System.out.println("digite um numero ");
        n2 = marcador.nextInt();
        
        while (n2<=n1){
            n2++;
        }
        System.out.println("a soma é :" + (n1+n2));           
    }
    
}
