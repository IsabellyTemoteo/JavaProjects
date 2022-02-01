import java.util.Scanner;

public class Elevador {
    Scanner ent = new Scanner(System.in);
    int andarAtual = 0;
    public int totalAndares;
    public int capacidade;
    int pessoasPresentes = 0;

    public void Parametros(){
        System.out.println("Digite a capacidade máxima do elevador: ");
        this.capacidade = ent.nextInt();
        System.out.println("Digite quantos andares o prédio contém: ");
        this.totalAndares = ent.nextInt();
    }

    public void Entrar(){
        if( pessoasPresentes < capacidade ){
            pessoasPresentes++;
            System.out.println("\nUma pessoa entrou no elevador!");
        }
        else{
            System.out.println("\nO elevador se encontra lotado.");
        }
    }

    public void Sair(){
        if( pessoasPresentes >= 1 ){
            pessoasPresentes--;
            System.out.println("\nUma pessoa saiu do elevador!");
        }
        else{
            System.out.println("\nNão há ninguém no elevador.");
        }
    }

    public void Subir(){
        if( andarAtual < totalAndares ){
            andarAtual++;
            System.out.println("\nO andar atual é:" + andarAtual );
        }
        else{
            System.out.println("\nO elevador já se encontra no topo.");
        }
    }

    public void Descer(){
        if( andarAtual > 0 ){
            andarAtual--;
            System.out.println("\nO andar atual é: " + andarAtual);
        }
        else{
            System.out.println("\nO elevador já se encontra no térreo.");
        }
    }

    public double getandarAtual() {
        return andarAtual;
    }

    public void setandarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public double gettotalAndares() {
        return totalAndares;
    }

    public void settotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public double getCapacidade() {
        return totalAndares;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public double getPessoasPresentes() {
        return pessoasPresentes;
    }

    public void setPessoasPresentes(int pessoasPresentes) {
        this.pessoasPresentes = pessoasPresentes;
    }
    
}
