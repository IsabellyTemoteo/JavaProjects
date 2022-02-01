public class Chaveiros extends Acessorios{
    public String formato;

    Chaveiros(String n, double v, String formato){
        super(Acessorios.quantidade_acessorios + Produto.quantidade_produtos, n, v);
        this.formato = formato;
    }

    public String getFormato() {
		return formato;
	}

	public void setTamanho(String formato) {
		this.formato = formato;
	}

    public void imprimeInformacoes(){
          System.out.println("CODIGO DO PRODUTO: " + super.getId() + "\n" + "NOME DO PRODUTO: " + super.getNome() + "\n" + "VALOR DO PRODUTO: " + super.getValor() + "\n" + "FORMATO: " + this.formato + "\n" +  "\n" );  
    }

}
