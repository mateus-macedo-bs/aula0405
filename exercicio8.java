/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio8;

import java.util.Scanner;

/**
 *
 * @author mateu
 */
public class exercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int meses, dias;
                
        System.out.println("Digite a quantidade de meses: ");
        meses = teclado.nextInt();

        dias = meses * 30;
        System.out.println("Nessa quantidade de meses tem " +dias+ " dias");
    }
    
}
