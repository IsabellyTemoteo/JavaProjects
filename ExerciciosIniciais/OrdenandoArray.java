/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenandoarray;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Isabelly
 */
public class OrdenandoArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
   
  //DECLARANDO AS VARIAVEIS
   int VetorA[] = new int [5]; 
   int VetorB[] = new int [5];

   int i;
   
  //RECEBENDO OS VALORES
    System.out.println("Digite os valores de A:");
    for(i = 0; i < VetorA.length; i++){
    VetorA[i] = entrada.nextInt(); }

    System.out.println("Digite os valores de B:");
    for(i = 0; i < VetorB.length; i++){
    VetorB[i] = entrada.nextInt(); }

  //CONCATENANDO OS VETORES
    int len = VetorA.length + VetorB.length;
    int[] Juncao = new int[len];
    int p = 0;
    for (int object : VetorA){
          Juncao[p] = object;
          p++; }
     for (int object : VetorB){
          Juncao[p] = object;
          p++; }
   
  //ORGANIZANDO AS ARRAYS
      Arrays.sort(Juncao);

  //IMPRIMINDO O RESULTADO
    System.out.println("Ordem Crescente:" + Arrays.toString(Juncao));
   }
}
  