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
public class Ex2 {
    public static void main(String[] args) {
        int cont=0;
        int idade, resultado=0;
        
        while(cont<=10){
            idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
        if(idade<=18){
        JOptionPane.showMessageDialog(null, "Menor de Idade");
        cont = cont +1;
            resultado = idade * cont;
        }    
            JOptionPane.showMessageDialog(null,"resultado"+Integer.toString(resultado));
    }
    
    }
}