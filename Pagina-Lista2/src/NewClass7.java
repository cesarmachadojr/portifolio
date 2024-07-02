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
public class NewClass2 {
    public static void main(String[] args) {
        int valor;
        int preço;
        int troco = 0;
        System.out.println("digite o valor que voce entregou e o preço do produto");
        Scanner marcador = new Scanner (System.in);
        valor = marcador.nextInt();
        preço = marcador.nextInt();
        troco = valor-preço;
        System.out.println(troco);
        
        
    }
}
