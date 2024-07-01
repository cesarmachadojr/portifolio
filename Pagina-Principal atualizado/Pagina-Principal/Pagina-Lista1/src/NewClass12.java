
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alunolages
 */
public class NewClass12 {
    public static void main(String[] args) {
        int salario;
        int conta ;
        int contas; 
        System.out.println("digite o valor do salario e das contas");
        Scanner marcador = new Scanner (System.in);
        salario = marcador.nextInt();
        conta = marcador.nextInt();
        contas = marcador.nextInt();
        System.out.println(salario - (2%conta+conta) + (2%contas+contas) );
    }
}
