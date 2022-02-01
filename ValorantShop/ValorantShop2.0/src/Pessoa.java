public class Pessoa {

    private String nome;
    private String cargo;
    private boolean registrado;

    public Pessoa() {
        this.nome = "";
        this.cargo = "";
        this.registrado = false;
    }

    public void setNome(String n){
        this.nome = n;
    }
    
    public void setCargo(String c){
        this.cargo = c;
    }

    public void setRegistrado(boolean r){
        this.registrado = r;
    }

    public String getNome(){
        return this.nome;
    }

    public String getCargo(){
        return this.cargo;
    }

    public boolean getRegistrado(){
        return this.registrado;
    }

    public String toString(){
        return ("NOME: " + this.nome
        + "\n___________________________________________________\n");
    }

    public void informa() {

        if(this.getRegistrado()) {

            System.out.println("\n___________________________________________________");
            System.out.println("INFORMAÇÕES DO " + this.getCargo());
            System.out.println(this.toString());
            
        }else {
            System.out.println("SEM INFORMAÇÕES DE CADASTRO");
        }  
    }

}
