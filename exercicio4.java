/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

import java.util.Scanner;

/**
 *
 * @author mateu
 */
public class exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int base;
        int altura;
        int area;
        
        System.out.println("de a base do triangulo: ");
        base = entrada.nextInt();
        System.out.println("de a altura do triangulo: ");
        altura = entrada.nextInt();
        
        area = (base * altura)/2;
        
        System.out.println("A area do triangulo e: "+" "+area);
    }
    
}
