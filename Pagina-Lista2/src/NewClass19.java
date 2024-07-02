/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class NewClass19 {
    public static void main(String[] args) {
        int numero;
        int a;
        int b;
        int c;
        int soma;
        Scanner marcador = new Scanner (System.in);
        System.out.println("digite um numero de 0 a 999");
        numero = marcador.nextInt();
        System.out.println("digite cada numero separadado do numero escolhido a cima");
        a = marcador.nextInt();
        b = marcador.nextInt();
        c = marcador.nextInt();
        soma = a+b+c;
        System.out.println("a soma é : " + soma);
    }
    
}
