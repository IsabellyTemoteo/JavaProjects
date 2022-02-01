/**
 *
 * @author Isabelly
 */
public class MetodosDeAcesso {

    
    public static void main(String[] args) {
         
   Empregado empregado1 = new Empregado();
   empregado1.setNome = ("Maria");
   empregado1.setSobrenome = ("Silva");
   empregado1.setSalario = (1000.00);
   
   Empregado empregado2 = new Empregado();
   empregado2.setNome = ("Patricia");
   empregado2.setSobrenome = ("Cassiana");
   empregado2.setSalario = (-200.00);
       
    System.out.println("Empregado 1: " + empregado1.getNome + " "+ empregado1.getSobrenome + "salario: " + (empregado1.getSalario * 12));
 
    System.out.println("Empregado 2: " + empregado2.getNome + " " + empregado2.getSobrenome + "salario: " + (empregado2.getSalario * 12)); 
  
    
    empregado1.setSalario(empregado1.getSalario + (empregado1.getSalario * .10));
    empregado2.setSalario(empregado2.getSalario + (empregado2.getSalario * .10));
       
    System.out.println("\nAumento de 10%, EMPREGADO 1: " + (empregado1.getSalario * 12));
    System.out.println("\nAumento de 10% EMPREGADO 2: " + (empregado2.getSalario * 12));
       
    }

