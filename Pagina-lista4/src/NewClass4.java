/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6;

import com.sun.tools.javac.Main;
import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class NewClass4 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double maiorAltura = 0;
        double somaAlturasMulheres = 0;
        double somaAlturasTurma = 0;
        int contadorMulheres = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite a altura da pessoa " + (i+1) + ":");
            double altura = scanner.nextDouble();
            
            System.out.println("Digite o código do sexo (1 para masculino, 2 para feminino):");
            int codigoSexo = scanner.nextInt();
            
            somaAlturasTurma += altura;
            
            if (altura > maiorAltura) {
                maiorAltura = altura;
            }
            
            if (codigoSexo == 2) {
                somaAlturasMulheres += altura;
                contadorMulheres++;
            }
        }
        
        double mediaAlturaMulheres = somaAlturasMulheres / contadorMulheres;
        double mediaAlturaTurma = somaAlturasTurma / 10;
        
        System.out.println("Maior altura da turma: " + maiorAltura);
        System.out.println("Média de altura das mulheres: " + mediaAlturaMulheres);
        System.out.println("Média de altura da turma: " + mediaAlturaTurma);
        
        scanner.close();
    }
}
