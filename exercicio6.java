/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio6;

import java.util.Scanner;

/**
 *
 * @author mateu
 */
public class exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o peso: ");
        double peso = entrada.nextDouble();
        System.out.println("Digite a altura: ");
        double altura = entrada.nextDouble();
        
        double imc;
        imc = peso / (altura * altura);
        System.out.println("IMC e: " + imc);
    }
    
}
