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
public class NewClass15 {
    public static void main(String[] args) {
        float salario;
        int dependentes;
        int liquido;
        Scanner marcador = new Scanner (System.in);                
        System.out.println("digite o valor de seu salario bruto");
        salario = marcador.nextFloat();
        System.out.println("digite o numero de dependentes");
        dependentes = marcador.nextInt();
        liquido = (int) ((int) salario - (salario*15/100 + salario*11/100)+ dependentes*150);
        System.out.println("seu salario liquido é de : " + liquido);
    }
}
        