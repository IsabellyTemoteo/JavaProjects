public class Poster extends Acessorios implements Especificacao{
    
    private double largura;
    private double altura;
    private String tipo;

    Poster(String n, double v, double l, double a){
        super(Produto.max_produtos + Acessorios.quantidade_acessorios, n, v );
        this.largura = l;
        this.altura = a;    
    }

    public void tipo(){
        this.tipo = "Poster";
    }

    public void imprimeInformacoes(){
        tipo();
        System.out.println("TIPO DO PRODUTO: " + this.tipo + "\n" + "CODIGO DO PRODUTO: " + super.getId() + "\n" + "NOME DO PRODUTO: " + super.getNome() + "\n" + "VALOR DO PRODUTO: " + super.getValor() + "\n" + "LARGURA: " + this.largura + "\n" + "ALTURA: " + this.altura + "\n" );  
    }
}

