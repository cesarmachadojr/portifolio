/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class NewClass14 {
    public static void main(String[] args) {
       float portugues ;
       float matematica;
       float conhecimentos;
       float media;
       boolean aprovado;
        String nome ;
       Scanner marcador = new Scanner (System.in);
        System.out.println("digite seu nome");
        nome = marcador.nextLine();
        System.out.println("digite sua nota de portugues");
        portugues = marcador.nextFloat();
        System.out.println("digite a nota de matematica");
        matematica = marcador.nextFloat();
        System.out.println("digite sua nota de conhecimentos gerais");
        conhecimentos = marcador.nextFloat();
        media = (portugues + matematica + conhecimentos) / 3 ;
        System.out.println(media);
        
        if (media>7){
            aprovado = true ;
            System.out.println("aprovado");
        }
        else if (media<7){
            aprovado = false ;
            System.out.println("reprovado");
        }
        else if (portugues<5){
            aprovado = false ;
            System.out.println("reprovado");
        }
       else if (matematica<5){
            aprovado = false ;
            System.out.println("reprovado");
        }
        else if (conhecimentos<5){
            aprovado = false ;
            System.out.println("reprovado");
        }
    }
    
}
