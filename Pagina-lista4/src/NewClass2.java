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
public class NewClass2 {
    public static void main(String[] args) {
        String nome;
        String sexo;
        int idade;
        Scanner marcador = new Scanner (System.in);
        System.out.println("digite seu nome ");
        nome = marcador.nextLine();
        System.out.println("qual seu sexo ");
        sexo = marcador.nextLine();
        System.out.println("digite sua idade");
        idade = marcador.nextInt();
        
        
        while (idade>0){
            idade--;
            
            System.out.println("seu nome :" + nome);
            System.out.println("seu sexo :" + sexo);
            System.out.println("sua idade :" + idade);
        }
    }
    
}
