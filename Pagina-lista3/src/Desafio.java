/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication10;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Desafio {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leitura da data
        System.out.print("Digite o dia: ");
        int dia = scanner.nextInt();
        
        System.out.print("Digite o mês: ");
        int mes = scanner.nextInt();
        
        System.out.print("Digite o ano: ");
        int ano = scanner.nextInt();
        
        // Verificação se o ano está no intervalo correto
        boolean anoValido = (ano >= 0 && ano <= 9999);
        
        // Verificação se o mês está no intervalo correto
        boolean mesValido = (mes >= 1 && mes <= 12);
        
        // Verificação dos dias de acordo com o mês e se o ano é bissexto
        boolean diaValido = false;
        if (mesValido) {
            switch (mes) {
                case 1:  // Janeiro
                case 3:  // Março
                case 5:  // Maio
                case 7:  // Julho
                case 8:  // Agosto
                case 10: // Outubro
                case 12: // Dezembro
                    diaValido = (dia >= 1 && dia <= 31);
                    break;
                case 4:  // Abril
                case 6:  // Junho
                case 9:  // Setembro
                case 11: // Novembro
                    diaValido = (dia >= 1 && dia <= 30);
                    break;
                case 2:  // Fevereiro
                    if (ehAnoBissexto(ano)) {
                        diaValido = (dia >= 1 && dia <= 29);
                    } else {
                        diaValido = (dia >= 1 && dia <= 28);
                    }
                    break;
            }
        }
        
        // Verificação final da data
        if (anoValido && mesValido && diaValido) {
            System.out.println("A data " + dia + "/" + mes + "/" + ano + " é válida.");
        } else {
            System.out.println("A data " + dia + "/" + mes + "/" + ano + " é inválida.");
        }
        
        scanner.close();
    }
    
    // Método para verificar se o ano é bissexto
    public static boolean ehAnoBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
}

    

