
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alunolages
 */
public class NewClass4 {
    public static void main(String[] args) {
        float a;
        float b;
        float c;
        System.out.println("digite a quantidade vendida dos 3 tipos de picole");
        Scanner marcador = new Scanner (System.in);
        a = marcador.nextInt();
        b = marcador.nextInt();
        c = marcador.nextInt();
        System.out.println(a*3/2 + b*2 + c*75/100 );


    }
    
}
