
public class Produto {
    
    private String tipo;
    private String nome;
    private String cor; 
    private int valorVp;
    private int codigo = 0;

    public static int quantidade_produtos = 0;
    public static final int max_produtos = 7;

    public int[] codigos = new int[max_produtos];

    public Produto(String tipo, String nome, String cor, int ValorVp){
        
        this.codigo = quantidade_produtos;
        this.tipo = tipo;
        this.nome = nome;
        this.cor = cor;
        this.valorVp = ValorVp;

        quantidade_produtos++;
    }

    public Produto(String nome, String cor, int ValorVp){

        this.codigo = quantidade_produtos;
        this.tipo = " ";
        this.nome = nome;
        this.cor = cor;
        this.valorVp = ValorVp; 

        quantidade_produtos++;
    }   

    public String toString(){
        if(this.tipo != " "){

            return("CODIGO DO PRODUTO: " + this.codigo + "\n" + "\n" + "TIPO DE PRODUTO: " + this.tipo + "\n" + "NOME DO PRODUTO: " + this.nome + "\n" + "COR DO PRODUTO: " + this.cor + "\n" + "VALOR EM VALORANT POINTS: " + this.valorVp);
        }else{
            
            return("CODIGO DO PRODUTO: " + this.codigo + "\n" + "\n" + "NOME DO PRODUTO: " + this.nome + "\n" + "COR DO PRODUTO: " + this.cor + "\n" + "VALOR EM VALORANT POINTS: " + this.valorVp);

        }
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public void setValor(int valor){
        this.valorVp = valor;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void setCodigo(int n){
        this.codigo = n;
    }

    public int getValor(){
        return this.valorVp;
    }
}
