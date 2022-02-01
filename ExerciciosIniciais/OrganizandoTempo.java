/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organizandotempo;
import java.util.Scanner;

/**
 *
 * @author Isabelly
 */
public class OrganizandoTempo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float hora, min, seg;
        float hora_seg, min_seg, total;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o tempo do cronômetro:");
        System.out.println("hora(s): ");
        hora = entrada.nextInt();
         
        System.out.println("minutos: ");
        min = entrada.nextInt();
         
        System.out.println("segundos: ");
        seg = entrada.nextInt();
        
        
        hora_seg = hora * 3600;
        min_seg = min * 60;
        total = seg + hora_seg + min_seg;
        
        System.out.println("\n\nO tempo do cronômetro em segundos é:");
        System.out.printf("De %.2f  horas para %.2f segundos\n", hora, hora_seg  );
        System.out.printf("De %.2f  minutos para %.2f segundos\n", hora, min_seg  );
        System.out.printf("De %.2f  segundos para %.2f segundos\n", seg, seg  );
        System.out.printf("O total de segundos no cronômetro é de: %.2f\n", total);
        
        
        
        
        
        // TODO code application logic here
    } }

