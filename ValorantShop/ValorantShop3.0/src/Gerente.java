import java.util.Scanner;

public class Gerente extends Pessoa{
    
    Scanner ent = new Scanner(System.in);

    public void loginGerente(){
        
        System.out.println("\n-> DIGITE SEU NOME DE USUARIO: ");
        super.setNome(ent.next());

        super.setCargo("GERENTE");
        super.setRegistrado(true);
    }

    public void verificaSenha(int senha) throws Exception {
    
        if(super.getRegistrado()) {
            System.out.println("[CADASTRO JÁ REALIZADO]");
            
        } else {

            if(senha == 123){
                System.out.println("\n\n\n[ACESSO CONCEDIDO] - cadastrando informações: ");
                this.loginGerente();
            }else {
                throw new Exception("\n\n\n[ACESSO NEGADO] - senha incorreta");
            }
        }    
    }

    public boolean getCadastro() {
        return super.getRegistrado();
    }

    public static void alerta(){
        System.out.println("\n___________________________________________________");
        System.out.println("PARA ACESSAR ESSA FUNCIONALIDADE É NECESSARIO LOGAR COMO GERENTE");
    }

}
