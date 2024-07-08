
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alunolages
 */
public class NewClass9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cel, fah;
        System.out.println("Digite a temperatura em Celsius: ");
        cel = input.nextInt();
        fah = (9 * cel + 160)/5;
        System.out.println("A temperatura em fahreheit e: " + fah);
    }
}
    
