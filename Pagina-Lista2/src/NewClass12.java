/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
        int altura;
        int comprimento;
        int largura;
        boolean arPequeno;
        boolean arMedio;
        boolean arGrande;
        int volume;
        System.out.println("digite a altura em mentros, o comprimento e a largura da sala");
        Scanner marcador = new Scanner (System.in);
        altura = marcador.nextInt();
        comprimento = marcador.nextInt();
        largura = marcador.nextInt();
        System.out.println("area piso");
        System.out.println(comprimento*largura);
        volume = altura*comprimento*largura;
        System.out.println(volume);
        System.out.println("area das paredes");
        System.out.println(largura*altura);
        System.out.println(comprimento*altura);
        
        if(volume < 100){
            arPequeno = true;
            System.out.println("ar pequeno");
        }
        else if (volume > 100 && volume < 500 ) {
            arMedio = true;
            System.out.println("ar medio");
            
        }
        
        else if (volume>500) {
            arGrande = true;
            System.out.println("ar grande");
        }
    }
            
    
}

   