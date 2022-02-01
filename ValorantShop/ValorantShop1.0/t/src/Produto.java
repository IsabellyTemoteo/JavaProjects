
public class Produto {
    
    private String status;
    private String tipo;
    private String nome;
    private String cor; 
    private int valorVp;
    private int codigo = 0;

    public static int quantidade_produtos = 0;
    public static final int max_produtos = 7;

    public int[] codigos = new int[max_produtos];

    public Produto(String tipo, String nome, String cor, int ValorVp){
        
        this.status = "Em estoque";
        this.codigo = quantidade_produtos;
        this.tipo = tipo;
        this.nome = nome;
        this.cor = cor;
        this.valorVp = ValorVp;

        quantidade_produtos++;
    }

    public Produto(String nome, String cor, int ValorVp){

        this.status = "Em estoque";
        this.codigo = quantidade_produtos;
        this.tipo = " ";
        this.nome = nome;
        this.cor = cor;
        this.valorVp = ValorVp; 

        quantidade_produtos++;
    }   

    public String toString(){

        if(this.tipo != " "){

            return("CODIGO DO PRODUTO: " + this.codigo + "\n" + "STATUS: " + this.status + "\n" + "TIPO DE PRODUTO: " + this.tipo + "\n" + "NOME DO PRODUTO: " + this.nome + "\n" + "COR DO PRODUTO: " + this.cor + "\n" + "VALOR EM VALORANT POINTS: " + this.valorVp);
        }else{
            
            return("CODIGO DO PRODUTO: " + this.codigo + "\n"+ "STATUS: " + this.status + "\n" + "NOME DO PRODUTO: " + this.nome + "\n" + "COR DO PRODUTO: " + this.cor + "\n" + "VALOR EM VALORANT POINTS: " + this.valorVp);

        }
        
    }

    public void remover(){
        this.status = "REMOVIDO";
        this.nome = "";
        this.cor = "";
        this.tipo = "";
        this.valorVp = 0;
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

    public int getValor(){
        return this.valorVp;
    }
}
