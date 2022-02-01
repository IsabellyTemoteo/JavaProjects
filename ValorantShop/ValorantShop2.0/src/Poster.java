public class Poster extends Acessorios{
    
    private double largura;
    private double altura;

    Poster(String n, double v, double l, double a){
        super(Acessorios.quantidade_acessorios + Produto.quantidade_produtos, n, v );
        this.largura = l;
        this.altura = a;    
    }

    public void imprimeInformacoes(){
        System.out.println("CODIGO DO PRODUTO: " + super.getId() + "\n" + "NOME DO PRODUTO: " + super.getNome() + "\n" + "VALOR DO PRODUTO: " + super.getValor() + "\n" + "LARGURA: " + this.largura + "\n" + "ALTURA: " + this.altura + "\n" );  
    }
}

