/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

import java.util.Scanner;

/**
 *
 * @author mateu
 */
public class exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor da tabuada: ");
        valor = teclado.nextInt();
        for (int i = 0; i <= 10; i++) {
        System.out.println(valor + " x "+ i + " = " + (valor*i));
        }
    }
    
}
