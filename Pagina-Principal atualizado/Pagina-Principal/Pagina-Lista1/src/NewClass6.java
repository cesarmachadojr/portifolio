
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alunolages
 */
public class NewClass6 {
    public static void main(String[] args) {
        String a;
        int quilos;
        float preço;
        String b;
        int litros;
        float $;
        String c;
        int pacotes;
        float valor;
        System.out.println("digite o nome do produto,a quantidade comprada e o valor ");
        Scanner marcador = new Scanner (System.in);
        a = marcador.nextLine();
        quilos = marcador.nextInt();
        preço = marcador.nextFloat();
        b = marcador.nextLine();
        litros = marcador.nextInt();
        $ = marcador.nextFloat();
        c = marcador.nextLine();
        pacotes = marcador.nextInt();
        valor = marcador.nextFloat();
        System.out.println(a + preço*quilos);
        System.out.println(b + litros*$);
        System.out.println(c + pacotes*valor);
        System.out.println(preço*quilos + litros*$ + pacotes*valor);
    }
    
}
