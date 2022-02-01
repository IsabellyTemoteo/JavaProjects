import java.util.Scanner;

public class Gerente {
    
    private int senha;
    public int op;

    public static boolean isGerente = false;

    Scanner ent = new Scanner(System.in);

    public void loginGerente(){

        System.out.println("-> INFORME A SENHA PARA LOGIN COMO GERENTE: ");
        senha = ent.nextInt();
        
        if(senha == 123){
            
            System.out.println("\n___________________________________________________");
            System.out.println("ACESSO CONCEDIDO");          
            isGerente = true;
        }else{

            System.out.println("\n___________________________________________________");
            System.out.println("ACESSO NEGADO");
        }
    }

    public static void alerta(){

        System.out.println("\n___________________________________________________");
        System.out.println("PARA ACESSAR ESSA FUNCIONALIDADE É NECESSARIO LOGAR COMO GERENTE");
    }

}
