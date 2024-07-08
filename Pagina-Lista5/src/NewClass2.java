
import javax.swing.JOptionPane;

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
        String nome, end, tel;  
        nome = JOptionPane.showInputDialog("Digite o Nome");  
        end = JOptionPane.showInputDialog("Digite o Endereço");  
        tel = JOptionPane.showInputDialog("Telefone:");  
  
        System.out.println("Nome:" + nome);  
        System.out.println("Endereço:" + end);  
        System.out.println("Telefone:" + tel);  
    }  

}