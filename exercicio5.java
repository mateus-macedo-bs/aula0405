/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio5;

import java.util.Scanner;

/**
 *
 * @author mateu
 */
public class exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
       int lado;
       int area;
       
        System.out.println("de o lado do quadrado: ");
        lado = entrada.nextInt();
        area = lado * lado;
        System.out.println("a area do quadrado e: "+ area);
                
        
      
       
    }
    
}
