/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class NewClass16 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o preço das três mercadorias no dia 01/01/2022:");
        double precoMercadoria1Dia1 = scanner.nextDouble();
        double precoMercadoria2Dia1 = scanner.nextDouble();
        double precoMercadoria3Dia1 = scanner.nextDouble();

        System.out.println("Informe o preço das três mercadorias no dia 01/02/2022:");
        double precoMercadoria1Dia2 = scanner.nextDouble();
        double precoMercadoria2Dia2 = scanner.nextDouble();
        double precoMercadoria3Dia2 = scanner.nextDouble();

        double inflacaoMercadoria1 = ((precoMercadoria1Dia2 - precoMercadoria1Dia1) / precoMercadoria1Dia1) * 100;
        double inflacaoMercadoria2 = ((precoMercadoria2Dia2 - precoMercadoria2Dia1) / precoMercadoria2Dia1) * 100;
        double inflacaoMercadoria3 = ((precoMercadoria3Dia2 - precoMercadoria3Dia1) / precoMercadoria3Dia1) * 100;

        double inflacaoMedia = (inflacaoMercadoria1 + inflacaoMercadoria2 + inflacaoMercadoria3) / 3;

        if (inflacaoMedia > 0.55) {
            System.out.println("A inflação do período está acima da meta.");
        } else {
            System.out.println("A inflação do período está dentro da meta.");
        }

       
    }
}