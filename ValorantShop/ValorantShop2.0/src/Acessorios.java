//CLASSE ABSTRATA: - Adicionar no menu (opcao: novidades - imprime e adicionar ao carrinho, como se fosse uma pre-venda!!)
    //CLASSE ACESSORIOS -> Tipo (Chaveiro ou Card), Cor, Nome, PreCo.
    //  *CHAVEIROS -> Formato.
    //   *POSTER -> Tamanho

public abstract class Acessorios{

    public static int quantidade_acessorios = 0;
    private int id;
    private String nome;
    private double valor;

    Acessorios(int i, String n, double v){
        this.id = i;
        this.nome = n;
        this.valor = v;
        
        quantidade_acessorios++;
    }

    public abstract void imprimeInformacoes();

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}