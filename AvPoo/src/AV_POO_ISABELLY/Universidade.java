package AV_POO_ISABELLY;
import java.util.ArrayList;

public class Universidade {
    private String nome;
    private String campus;
    
    ArrayList<Departamento> departamentos = new ArrayList<Departamento>();

    public Universidade (String nome, String campus) {
        this.nome = nome;
        this.campus = campus;
    }

    public void addDepartamento(Departamento dep){
        System.out.println("Novo departamento: " + dep.getNome());
        departamentos.add(dep);
    }

    public void removerDepartamento(Departamento dep){
        System.out.println("Departamento removido: " + dep.getNome());
        departamentos.remove(dep);
    }

    public void sobre() {
        if(departamentos.size() != 0){
            System.out.println("\nDepartamentos: ");
            for (Departamento departamento : departamentos) {
                departamento.sobreDepartamento();
            }
        }
        else{
            System.out.println("Não há departamentos disponíveis.\n");
        }
    }

    //MÉTODOS SET:
    public void setNome(String n){
        this.nome = n;
    }
    public void setCampus(String campus) {
        this.campus = campus;
    }

    //MÉTODOS GET:
    public String getNome(){
        return this.nome;
    }

    public String getCampus(){
        return this.campus;
    }
}
