/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class NewClass2 {
    public static void main(String[] args) {
        int peso;
        float altura;
        float imc;
        boolean normal;
        boolean obeso;
        boolean sobrepeso;
        boolean magro;
        Scanner marcador = new Scanner (System.in);
        System.out.println("digite seu peso em kg");
        peso = marcador.nextInt();
        System.out.println("digite sua altura");
        altura = marcador.nextFloat();
        imc =  (peso/(altura*altura));
        System.out.println("seu IMC é :" +imc);
        
        if (imc<20){
            magro = true;
            System.out.println("magro");
            
        }
        else if (imc>20 && imc<25) {
            normal = true;
            System.out.println("normal");
        }
        else if (imc>25 && imc<30){
            sobrepeso = true;
            System.out.println("sobrepeso");
        }
        else if (imc>30){
            obeso = true;
            System.out.println("obeso");
        }
        
    }
}
