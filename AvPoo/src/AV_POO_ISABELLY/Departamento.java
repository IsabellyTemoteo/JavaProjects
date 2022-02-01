package AV_POO_ISABELLY;
import java.util.ArrayList;

public class Departamento {
    private String nome;
    private String endereco;
    private int id;

    ArrayList<Pessoa> funcionarios = new ArrayList<Pessoa>();
   
    public Departamento (String nome, String endereco, int id) {
        this.nome = nome;
        this.endereco = endereco;
        this.id = id;
    }

    public void addFuncionario(Pessoa p) {
        System.out.println("Adicionando funcionário: " + p.getNome());
        this.funcionarios.add(p);
    }

    public void removerFuncionario(Pessoa p) {
        System.out.println("Removendo funcionário: " + p.getNome());
        this.funcionarios.remove(p);
    }

    public void sobrePessoas(){
        if(this.funcionarios.size() != 0) {
            System.out.println("Funcionários atuais: ");
            for (Pessoa pessoa : funcionarios) {
                System.out.println(pessoa.toString());   
            }

        }else {
            System.out.println("Não há funcionários nesse departamento.\n");
        }
        
    }

    public void sobreDepartamento(){
        System.out.println("Departamento: " + this.nome + "\nEndereço: " + this.endereco + "\nId: " + this.id);
        this.sobrePessoas();
    }

    //MÉTODOS GET:
    public String getNome(){
        return this.nome;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public int getId(){
        return this.id;
    }


    //MÉTODOS SET:
    public void setNome(String n){
        this.nome = n;
    }

    public void setCurso(String endereco) {
        this.endereco = endereco;
    }

    public void setId(int id) {
        this.id= id;
    }
    
}
