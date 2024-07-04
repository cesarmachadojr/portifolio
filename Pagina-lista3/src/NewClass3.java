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
public class NewClass3 {
    public static void main(String[] args) {
        int n1;
        int divisao;
        boolean par;
        Scanner marcador = new Scanner (System.in);
        System.out.println("digite um numero");
        n1 = marcador.nextInt();
        divisao = n1%2;
        if (divisao==0) {
            par = true;
            System.out.println("par");
            
            
        }
        else {
            par = false;
            System.out.println("impar");
            
        }
        
        
                
    }
}
