
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alunolages
 */
public class NewClass {
    public static void main(String[] args) {
        float a;
        int b;
        System.out.println("digite o valor do preço");
        System.out.println("digite o valor de Quilowatts");
        Scanner marcador = new Scanner (System.in);
        a = marcador.nextFloat();
        b = marcador.nextInt();
        System.out.println(a*b);
        System.out.println((a*b)*10/100 + a*b);
    }
            
    
}
