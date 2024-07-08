
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alunolages
 */
public class NewClass8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, raiz, i = 0;
        System.out.println("Digite um número: ");
        num = input.nextInt();
        while(i<1000){
            if(i*i == num){
                raiz = i;
                System.out.println("A raiz quadrada do numero e: " + raiz);
                break;
            }else{
                i++;
                
            }
            
        }
        
    }
}


