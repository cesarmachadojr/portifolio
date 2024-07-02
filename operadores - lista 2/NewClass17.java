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
public class NewClass17 {
    public static void main(String[] args) {
       int parcelas;
       int pagas;
       float valor;
       int restante;
        int valorPago;
       int saldoDevedor;
       Scanner marcador = new Scanner (System.in);
       System.out.println("digite a quantidade de parcelas");
       parcelas = marcador.nextInt();
       System.out.println("digite a quantidade de parcelas pagas");
       pagas = marcador.nextInt();
       System.out.println("digite o valor das parcelas");
       valor = marcador.nextFloat();
       restante = parcelas - pagas;
       valorPago= (int) (pagas*valor);
       saldoDevedor = (int) (restante*valor);
       System.out.println("valor pago : " + valorPago);
        System.out.println("valor que falta :" + saldoDevedor);
        
    }
    
}
