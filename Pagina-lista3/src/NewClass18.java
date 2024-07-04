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
public class NewClass18 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o saldo médio do último ano:");
        double saldoMedio = scanner.nextDouble();

        double valorCredito;
        if (saldoMedio <= 200) {
            valorCredito = saldoMedio * 0.1;
        } else if (saldoMedio <= 300) {
            valorCredito = saldoMedio * 0.2;
        } else if (saldoMedio <= 400) {
            valorCredito = saldoMedio * 0.25;
        } else {
            valorCredito = saldoMedio * 0.3;
        }

        System.out.println("Saldo médio do último ano: R$" + saldoMedio);
        System.out.println("Valor do crédito especial: R$" + valorCredito);
    }
}

    

