import java.util.Scanner;

public class Cliente extends Pessoa{

    private int fundos = 0;
 
    Scanner ent = new Scanner(System.in);

    public void logar(){

        if(super.getRegistrado()){
            System.out.println("[CADASTRO JÁ REALIZADO]");
            
        }else{

            System.out.println("\n-> DIGITE SEU NOME DE USUARIO: ");
            super.setNome(ent.next());

            super.setCargo("CLIENTE");
            super.setRegistrado(true);
        }   
    }

    public boolean getCadastro(){
        return super.getRegistrado();
    }

    public void infoFundos(){

        System.out.println("->INFORMAÇÕES DE SALDO: " + this.fundos);
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
        return super.getNome();
    }

    public static void alerta(){

        System.out.println("\n___________________________________________________");
        System.out.println("PARA ACESSAR ESSA FUNCIONALIDADE É NECESSARIO SE CADASTRAR COMO CLIENTE");
    }
}

