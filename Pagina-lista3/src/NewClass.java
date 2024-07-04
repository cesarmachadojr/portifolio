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
public class NewClass {
    public static void main(String[] args) {
        float preco;
        int quantidade;
        int atraso;
        int valor;
        boolean consciente;
        Scanner marcador = new Scanner (System.in);
        System.out.println("Digite o preço do quilowatt");
        preco = marcador.nextFloat();
        System.out.println("Digite a quantidade de quilowatt usada ");
        quantidade = marcador.nextInt();
        valor = (int) (preco*quantidade);
        atraso = (int) (preco*quantidade + preco*quantidade*10/100);
        System.out.println("valor normal " + valor);
        System.out.println("valor com atraso " + atraso);
        if(quantidade>70){
            consciente = false;
            System.out.println("Consumo elevado de energia");
        }
        else if (quantidade<70){
            consciente = true;
            System.out.println("Você é um consumidor consciente");
        }
        
        
        
    }
    
}
