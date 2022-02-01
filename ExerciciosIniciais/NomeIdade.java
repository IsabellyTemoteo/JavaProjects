/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomeidade;

import java.util.Scanner;

/**
 *
 * @author Isabelly
 */
public class NomeIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
  
  //DECLARANDO VARIAVEIS
   String[] nome = new String[10];
   int[] idade = new int[10];
   int i;
   int mais_velha = 0;
   int mais_nova = 0;
   

  //RECEBENDO OS DADOS PEDIDOS
   for(i = 0; i < 10; i++){
   System.out.println("Digite o primeiro nome e a idade:");
   nome[i] = entrada.next();
   idade[i] = entrada.nextInt(); 
   
  //TERMINAR COM IDADE NEGATIVA
   if ( idade[i] < 0 ){
     break; }

  //CONFERIR ISSOO AQ
    if ( i == 0) {
    mais_nova = idade[i];
    mais_velha = idade[i]; }

  //COMPARANDO AS IDADES
  if( idade[i] > mais_velha ) { 
    mais_velha = idade[i]; }
  if( idade[i] < mais_nova){
     mais_nova = idade[i]; } }

  //PESSOA MAIS NOVA
  System.out.println("Pessoa (s) mais nova (s):");
    for( i = 0 ; i < 10; i++) {
       if ( idade[i] < 0 ){
       break; }
        if( idade[i] == mais_nova) {
        System.out.println("Nome: " + nome[i] + "\nIdade: " + idade[i] + " ano (s)"); }}

  //PESSOA MAIS VELHA
  System.out.println("\nPessoa (s) mais velha (s):");
  for( i = 0 ; i < 10; i++) {
       if ( idade[i] < 0 ){
       break; }
        if(idade[i] == mais_velha) {
        System.out.println("Nome:" + nome[i] + "\nIdade: " + idade[i] + " ano (s)"); }}

  
 } }
