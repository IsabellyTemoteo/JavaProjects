package AV_POO_ISABELLY;
public class Pessoa {

    private String nome;
    private String cpf; //identificação única
    
    public Pessoa (String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String toString(){
        return ("Nome: " + this.nome + "\nCpf: " + this.cpf + "\n");
    }

    //MÉTODOS SET:
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    //MÉTODOS GET:
    public String getCpf(){
        return this.cpf;
    }

    public String getNome(){
        return this.nome;
    }

}
