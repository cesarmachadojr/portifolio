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
public class NewClass18 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a data de nascimento (dia mês ano):");
        int diaNascimento = scanner.nextInt();
        int mesNascimento = scanner.nextInt();
        int anoNascimento = scanner.nextInt();

        System.out.println("Informe a data atual (dia mês ano):");
        int diaAtual = scanner.nextInt();
        int mesAtual = scanner.nextInt();
        int anoAtual = scanner.nextInt();

        int diasVividos = ((anoAtual - anoNascimento) * 360) + ((mesAtual - mesNascimento) * 30) + (diaAtual - diaNascimento);

        System.out.println("A pessoa viveu " + diasVividos + " dias.");

      
    }
}
    
    

