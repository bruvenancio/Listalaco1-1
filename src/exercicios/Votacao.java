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
public class Votacao {
    public static void main(String[] args) {
        int cont=0,voto=0,contChapaA=0,contChapaB = 0;
        while (voto!=3){
        voto=Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para a chapaA\n"+"Digite 2 para a chapaB:"));
        
         if((voto==1)){
             contChapaA = contChapaA+1;
         }
         if((voto==2)){
             contChapaB=contChapaB+1;
         }
         
        
    }
        if (contChapaA>contChapaB){
       JOptionPane.showMessageDialog(null, "Chapa Vencedora foi a A");
        }
        if (contChapaA<contChapaB){
       JOptionPane.showMessageDialog(null, "Chapa Vencedora foi a B");
        }
    }
}