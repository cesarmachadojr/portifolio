
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
        Scanner input = new Scanner(System.in);
        int y, x;
        System.out.println("Digite o valor de x: ");
        x = input.nextInt();
        y = (3*x)+2;
        System.out.println("O valor de y é: " + y);
    }
}
