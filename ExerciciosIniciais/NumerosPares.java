/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerospares;
import java.util.Scanner;

/**
 *
 * @author Isabelly
 */
public class NumerosPares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    //Declarando váriaveis
      int i;
      int arg;
    //Número de espaços desejados
    System.out.println("Digite a quantia de números que deseja digitar:");
    arg = entrada.nextInt();
    int vetor[] = new int[arg];
    //Recebendo os números
    int vetorres = 0;
    float vetorcont;
    System.out.println("Digite os números desejados:");
    for(i = 0; i < arg; i++){
     vetor[i] = entrada.nextInt();
    //Contar os pares
    vetorcont = vetor[i]%2;
    if(vetorcont == 0){
    vetorres++;}
    }
    System.out.println("Quantia de números pares: " + vetorres);
} }