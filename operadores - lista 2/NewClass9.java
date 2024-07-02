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
public class NewClass4 {
    public static void main(String[] args) {
        int km;
        int gasto;
        float preço;
        int valor;
        System.out.println("digite os km andados, o gasto de listros do carro por km e o preço do combustivel");
        Scanner marcador = new Scanner (System.in);
        km = marcador.nextInt();
        gasto = marcador.nextInt();
        preço = marcador.nextFloat();
        valor = (int) (km/gasto*preço); 
        System.out.println(valor);
    }
}
