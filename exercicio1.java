/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio10405;

import java.util.Scanner;

/**
 *
 * @author mateu
 */
public class exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nomeUsuario;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("olá informe seu nome:");
        nomeUsuario = teclado.next();
        System.out.println("Olá " +nomeUsuario+ " seja bem vindo");
    }
    
}
