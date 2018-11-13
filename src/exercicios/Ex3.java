/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Lab01_215
 */
public class Ex3 {
    public static void main(String[] args) {
        int opcao = 0;
        int  n1 = 0, n2 = 0,resultado = 0;
        while(opcao!=5){
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para Soma\n+2 para Subtração\n+3 para Multiplicação\n+4Divisão\n+5Sair"));
            if(opcao!=5){
                n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o n1:"));
                 n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o n2:"));
            }
            if(opcao==1){
                resultado = n1+ n2;
                JOptionPane.showMessageDialog(null, "resultado"+Integer.toString(resultado));
            }
            if(opcao==2){
                resultado = n1 - n2;
                JOptionPane.showMessageDialog(null, "resultado"+Integer.toString(resultado));
            }
            if(opcao==3){
                resultado = n1 * n2;
                JOptionPane.showMessageDialog(null, "resultado"+Integer.toString(resultado));
            }
            if(opcao==4){
                resultado = n1 / n2;
                JOptionPane.showMessageDialog(null, "resultado"+Integer.toString(resultado));
            }
        }
     
     
    }  
}
