/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz_unidimensional;
import java.util.Scanner;
/**
 *
 * @author Isabelly
 */
public class Matriz_Unidimensional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
  Scanner entrada = new Scanner(System.in);
  
  //Declarando Vetor
  int Colunas[] = new int[3];
  int Vetor[][] = new int [3][3];

  //Preenchendo Vetor
  System.out.println("Digite os números desejados:");
  for (int i = 0; i < 3; i++){
  for (int j = 0; j < 3; j++) {
    Vetor[i][j] = entrada.nextInt(); 
    Colunas[j] += Vetor[i][j];
    }
  }
   //ESPAÇO
System.out.printf("\n\n");

   //Imprimindo resultado
   for (int j = 0; j < 3; j++) {
    System.out.println("Soma:" + Colunas[j]); }
  }
}
