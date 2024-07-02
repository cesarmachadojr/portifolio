
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alunolages
 */
public class NewClass3 {
    public static void main(String[] args) {
        float p1 ;
        float p2;
        float trabalho;
        boolean reprovado;
        Scanner marcador = new Scanner (System.in);
        System.out.println("digite a nota da prova 1 ");
        p1 = marcador.nextFloat();
        System.out.println("digite o valor da prova 2 ");
        p2 = marcador.nextFloat();
        System.out.println("digite o valor do trbalho ");
        trabalho = marcador.nextFloat();
        if ( p1 < 6) {
            reprovado = true ;
           
       
        if (p2 < 6 ) 
            reprovado = true ;
            System.out.println("reprovado");
          
        }
        if (trabalho < 7 ) {
            reprovado = true ;
            System.out.println("reprovado");
        }
    }
    
}
