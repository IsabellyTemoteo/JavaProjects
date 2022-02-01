public class Chaveiros extends Acessorios {
    public String formato;
    public String tipo;

    Chaveiros(String n, double v, String formato){
        super(Produto.max_produtos + Acessorios.quantidade_acessorios, n, v);
        this.formato = formato;
    }

    public String getFormato() {
		return formato;
	}

	public void setTamanho(String formato) {
		this.formato = formato;
	}

    public void tipo(){
        this.tipo = "Chaveiro";
    }

    public void imprimeInformacoes(){
        tipo();
          System.out.println("TIPO DO PRODUTO: " + this.tipo + "\n" + "CODIGO DO PRODUTO: " + super.getId() + "\n" + "NOME DO PRODUTO: " + super.getNome() + "\n" + "VALOR DO PRODUTO: " + super.getValor() + "\n" + "FORMATO: " + this.formato + "\n" +  "\n" );  
    }

}
