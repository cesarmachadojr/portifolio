/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author alunolages
 */
import java.util.Scanner;

public class VerificaAprovacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura da nota do trabalho
        System.out.print("Digite a nota do trabalho: ");
        double notaTrabalho = scanner.nextDouble();

        // Leitura das notas das provas
        System.out.print("Digite a nota da primeira prova: ");
        double notaProva1 = scanner.nextDouble();

        System.out.print("Digite a nota da segunda prova: ");
        double notaProva2 = scanner.nextDouble();

        // Leitura da frequência
        System.out.print("Digite a frequência do aluno (em %): ");
        double frequencia = scanner.nextDouble();

        // Verificação dos critérios de aprovação
        boolean aprovado = false;

        // Critério 1: Nota do trabalho >= 7
        if (notaTrabalho >= 7.0) {
            // Critério 2: Nota >= 6 em pelo menos uma prova
            if (notaProva1 >= 6.0 || notaProva2 >= 6.0) {
                // Critério 3: Frequência >= 75%, exceto se notaTrabalho == 6
                if (notaTrabalho == 6.0 && frequencia >= 90.0) {
                    aprovado = true;
                } else if (frequencia >= 75.0) {
                    aprovado = true;
                }
            }
        }

        // Exibição do resultado
        if (aprovado) {
            System.out.println("O aluno está aprovado!");
        } else {
            System.out.println("O aluno não está aprovado.");
        }

    }
}
