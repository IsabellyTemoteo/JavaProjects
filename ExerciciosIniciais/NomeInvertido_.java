/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomeinvertido_;

import java.util.Scanner;

/**
 *
 * @author Isabelly
 */
public class NomeInvertido_ {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
    //RECEBENDO STRING
  String nome;
  Scanner entrada = new Scanner(System.in);

  System.out.println("Digite o nome: ");
  nome = entrada.nextLine();

  //SEPARANDO QUANTIA DE CARACTERES
  int quantia;
  quantia = nome.length();
  
  char nomevetor[] = nome.toCharArray();

  //IMPRIMINDO DE TRÁS PRA FRENTE
 for(int i = quantia-1; i >= 0; i--){
  System.out.println(nomevetor[i]);
 }

 System.out.println("\n\nA quantia de caracteres é: " + nome.length());

  }
}
