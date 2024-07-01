
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alunolages
 */
public class NewClass10 {
    public static void main(String[] args) {
        int hora;
        int minutos;
        int segundos;
        System.out.println("digite a hora, os minutos e os segundos do dia");
        Scanner marcador = new Scanner (System.in);
        hora = marcador.nextInt();
        minutos = marcador.nextInt();
        segundos = marcador.nextInt();
        System.out.println(86400 - (hora*3600 + minutos*60 + segundos));
    }
    
}
