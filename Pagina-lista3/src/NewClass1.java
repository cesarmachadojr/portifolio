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
public class NewClass1 {
    public static void main(String[] args) {
        float prova1;
        float prova2;
        float trabalho;
        float media;
        boolean aprovado;
        Scanner marcador = new Scanner (System.in);
        System.out.println("digite a sua nota da prova 1");
        prova1 = marcador.nextFloat();
        System.out.println("digite a sua nota da prova 2");
        prova2 = marcador.nextFloat();
        System.out.println("digite a nota do trabalho");
        trabalho = marcador.nextFloat();
        media = ((prova1+prova2+trabalho)/3);
        System.out.println("sua média é : " +media);
        
        if (media>=7) {
            aprovado = true;
            System.out.println("aprovado");
        }
        else if (media<7){
            aprovado = false;
            System.out.println("reprovado");
        }
        if (prova1<7){
            aprovado = false ;
            System.out.println("reprovado");
        }
        else if (prova2<7) {
            aprovado = false;
            System.out.println("reprovado");
        }
        else if (trabalho<7){
            aprovado =false;
            System.out.println("reprovado");
        }
            
    }
}
