package exercicios;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lab01_215
 */
public class Ex1 {
    public static void main(String[] args) {
        int cont = 0;
        int numero,resultado=0;
        numero=Integer.parseInt(JOptionPane.showInputDialog("Digite o número"));
        while(cont<=10){
             resultado= numero * cont;
             JOptionPane.showMessageDialog(null,"resultado"+Integer.toString(resultado));
             cont = cont +1; 
        }
       
        
    }
    
}
