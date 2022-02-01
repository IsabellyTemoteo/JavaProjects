/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letraa;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Isabelly
 */
public class LetraA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner entrada = new Scanner(System.in);
  
  //Declarando variÃ¡veis
  String nome;
  int i, Soma = 0;
  //Recebendo o nome
  System.out.println("Digite o nome desejado:");
  nome = entrada.nextLine();
  
  //Transformando em Array
  char nome_vetor[] = nome.toCharArray();
  
 //Contando as letras 'a' ou 'A'
 for(i = 0; i < nome.length(); i++){
 if ( nome_vetor[i] == 'a'){
  Soma++;
 }
 if ( nome_vetor[i] == 'A'){
  Soma++;
 }}

 //Imprimindo a quantia de letras 'a' ou 'A'
 System.out.println("Quantia de letras A no nome = " + Soma);

  }
}

