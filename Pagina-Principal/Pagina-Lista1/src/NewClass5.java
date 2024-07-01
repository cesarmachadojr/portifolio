
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alunolages
 */
public class NewClass5 {
    public static void main(String[] args) {
        float a ;
        float b ;
        System.out.println("digite o numero de carros vendidos e o valor dele");
        Scanner marcador = new Scanner (System.in);
        a = marcador.nextInt();
        b = marcador.nextInt();
        System.out.println(2000 + (a*150) + (b*5/100));
    }
    
}
