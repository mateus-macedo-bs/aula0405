/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula01;

import java.util.Scanner;



/**
 *
 * @author laisl
 */
public class aula0405 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //tipo, nome,valor
      //int- numeros inteiros, String - palavras, double - numeros quebrados
      
      //crie uma variavel chamada numero, do tipo inteira com valor 10
      int numero = 10;
      //crie uma variavel chamada nome, que armazene o seu nome
      String nome = "lais";
      
      // imprimindo as variaveis criadas com uma mensagem
       System.out.println("Olá, meu nome é: "+nome+" e o valor da variavel numero é:"+numero);
       
       //-------OPERAÇÕES MATEMÁTICAS---------//
       
       // SOMA, DIVISÃO, SUBTRAÇÃO, MULTIPLICAÇÃO
       
       int resultado;
       int a = 10;
       int b = 5;
       
       //soma
       resultado = a+b;
        System.out.println("A soma de a e b é: "+resultado);
        
        //divisão - /
        resultado = a/b;
        System.out.println("A divisão de A e B é: "+resultado);
        
        //subtração -
        resultado = a-b;
        System.out.println("A subtração de A e B é: "+resultado);
        
        // multiplicação - *
        resultado = a*b;
        System.out.println("A multiplicação de A e B é: "+resultado);
        
        // TAREFA DO VÍDEO
        
        // CRIAR UMA VARIAVEL DO TIPO DOUBLE
        // DIFERENÇA DE DOUBLE PRA FLOAT
        
        //---------------usando a classe scanner-----------------//
        
        //Quero que o usuário digite o nome dele, e quero mostrar isso na tela
        
        String nomeUsuario;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Olá! informe seu nome:");
        nomeUsuario = teclado.next();
        System.out.println("Olá! seu nome é: "+nomeUsuario);
        
      //somar 2 numeros digitados pelo usuario
      
      int numero1, numero2, resultadoSoma;
        System.out.println("Digite o primeiro numero");
        numero1= teclado.nextInt();
        System.out.println("Digite o segundo numero");
        numero2=teclado.nextInt();
        
        resultadoSoma = numero1+numero2;
        
        System.out.println("A soma dos seus numeros é: "+resultadoSoma);
      
      
      
        
    }
    
}
