/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio7;

import java.util.Scanner;

/**
 *
 * @author mateu
 */
public class exercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        float km, milhas;
        
          System.out.println("Digite a quantidade de Km: ");
        km = teclado.nextFloat();

        milhas = (float) (km / 1.60934);
        System.out.println("A quantidade de milhas: " +milhas);
        
        
        
        
        
        
        
        
    }
    
}
