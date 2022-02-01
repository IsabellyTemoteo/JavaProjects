import java.util.Scanner;

public class Cliente {

    private String nome;
    private String riot_id;
    private String senha;
    private int fundos = 0;

    Scanner ent = new Scanner(System.in);
    
    public static boolean cadastro = false;

    public void logar(){

        if(cadastro){
            System.out.println("\n___________________________________________________");
            System.out.println("CADASTRO JA RELIZADO!\n");

        }else{

            System.out.println("\n-> DIGITE SEU NOME DE USUARIO: ");
            this.nome = ent.next();

            System.out.println("\n-> DIGITE SEU RIOT ID (formato: nome#id ): ");
            this.riot_id = ent.next();

            System.out.println("\n-> DIGITE A SENHA DESEJADA: ");
            this.senha = ent.next();
     
            cadastro = true;

        }   
    }

    public static void alerta(){

        System.out.println("\n___________________________________________________");
        System.out.println("PARA ACESSAR ESSA FUNCIONALIDADE É NECESSARIO SE CADASTRAR COMO CLIENTE");
    }

    public void infoFundos(){

        System.out.println("INFORMAÇÕES DE SALDO: " + this.fundos);
        System.out.println("___________________________________________________\n");
    }

    public void addFundos(int valor){

        this.fundos += valor;
    }

    public void descontarFundos(int valor){

        this.fundos = this.fundos - valor;
    }

    public int getFundos(){
        
        return this.fundos;
    }

    public String getNome(){
        return this.nome;
    }
}

