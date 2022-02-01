public class Carrinho {
    
    public static int totalCarrinho = 0;

    public void adicionarProduto(int valor){
        totalCarrinho += valor;
    }

    public static void pagarCarrinho(){
        totalCarrinho = 0;
    }

    public static void info() {
        System.out.println("\n-> VALOR ATUAL DO CARRINHO "+totalCarrinho);
    }

    public static void alerta() {
        System.out.println("\n___________________________________________________");
        System.out.println("PARA ACESSAR ESSA FUNCIONALIDADE É NECESSARIO SE CADASTRAR COMO CLIENTE");
    }

    public static void verificaCodigo(int codigo_carrinho) throws Exception {

        if(codigo_carrinho < 0 || codigo_carrinho >= Produto.quantidade_produtos) {
            throw new Exception("\n[ CÓDIGO INVÁLIDO ] - código de produto indisponível");
        }
    }

    public static void verificaCarrinho(int fundosCliente) throws Exception {
        if(totalCarrinho == 0){
            throw new Exception("\n[CARRINHO VAZIO]");
        }

        if(fundosCliente < totalCarrinho){
            throw new Exception("\n[FUNDO INSUFICIENTE] - adicione fundos a sua conta antes de pagar");
        }
    }
}
