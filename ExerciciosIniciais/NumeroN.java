/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeron;
import java.util.Scanner;
/**
 *
 * @author Isabelly
 */
public class NumeroN {

    /**
     * @param args the command line arguments 
     */
                  
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    //DECLARAMOS AS VARIÁVEIS
    double S = 0;
    int N = 0, i, ver = 1;
        
    //RECEBEMOS O VALOR DE N
    System.out.println("Digite o valor de 'n':");
    N = entrada.nextInt();

    //FAZENDO A CONTA
    for ( i = N; i >= 1; i--) {
     S = S + (1.0 / i) * ver;
     if ( ver == 1) ver = -1;
     if ( ver == -1) ver = 1;
}
        System.out.println("S = " + S);
    }
}

