/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xey;
import java.util.Scanner;
/**
 *
 * @author Isabelly
 */
public class XeY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
     Scanner entrada = new Scanner(System.in);
     
     //Declarando variaveis
     int x, y, i, cont = 0;
     
     //Recebendo valores
     System.out.println("Digite os valores de X e Y:");
     x = entrada.nextInt();
     y = entrada.nextInt();
     
     //Separando multiplos de x e y
     System.out.println("Os numeros multiplos de 2 e 3 entre x e y são:");
     
      for(i = x; i <= y; i++){
        if( i % 3 == 0 && i % 2 == 0){
        cont++;
        System.out.println(i);
        }
            
      }
    }
    
}
