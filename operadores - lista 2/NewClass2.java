
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
        int peso ;
        float altura;
        boolean acimaPeso;
        Scanner marcador = new Scanner (System.in);
        System.out.println("Digite seu peso");
        peso = marcador.nextInt();
        System.out.println("digite sua altura");
        altura = marcador.nextFloat();
        System.out.println("imc " + peso/(altura*altura));
        if( peso/(altura*altura) > 25 ){
            acimaPeso = true;
            System.out.println("acima do peso " + acimaPeso);  
            
          
        }
        else{
            acimaPeso = false ;
            System.out.println("no peso ideal");
        }
    }
        
        
    }
    

