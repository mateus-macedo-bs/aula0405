
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mateu
 */
public class exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int resultado;
        int a;
        int b;
        int c;
        int d;
        int e;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("informe a nota da primeira prova de matematica: ");
        a = teclado.nextInt();
        
        System.out.println("informe a segunda nota da segunda prova de matematica: ");
        b = teclado.nextInt();
        
        System.out.println("informe a terceira nota da terceira prova de matematica: ");
        c = teclado.nextInt();
        
        System.out.println("informe a quarta nota da quarta prova de matematica: ");
        d = teclado.nextInt();
        
        resultado = a + b + c + d;
        e = resultado / 4;
        System.out.println("Sua média final em matematica foi: "+ e);
       
     
    }
    
}
