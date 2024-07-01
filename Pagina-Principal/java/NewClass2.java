
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alunolages
 */
public class NewClass2 {
    public static void main(String[] args) {
        int base;
        int altura;
        System.out.println("digite o valor da base e da altura de um triangulo"); 
       Scanner marcador = new Scanner (System.in);
        base = marcador.nextInt();
        altura = marcador.nextInt();
        System.out.println(base*altura/2);
        System.out.println(base+base+base);
    }
}
