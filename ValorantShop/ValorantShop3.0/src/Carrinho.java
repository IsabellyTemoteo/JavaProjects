public class Carrinho {
    
    public static double totalCarrinho = 0;

    public void adicionarProduto(double valor){
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

        if(codigo_carrinho >= Produto.quantidade_produtos && codigo_carrinho < Produto.max_produtos){
            throw new Exception("\n[ CODIGO INVÁLIDO ] - código reservado para um produto que ainda nao foi cadastrado");
        }

        else if(codigo_carrinho < 0 || codigo_carrinho >= Produto.max_produtos + Acessorios.quantidade_acessorios) {
            throw new Exception("\n[ CÓDIGO INVÁLIDO ] - código de produto indisponível");
        }

    }

    public static void verificaCarrinho(double fundosCliente) throws Exception {
        if(totalCarrinho == 0){
            throw new Exception("\n[CARRINHO VAZIO]");
        }

        if(fundosCliente < totalCarrinho){
            throw new Exception("\n[FUNDO INSUFICIENTE] - adicione fundos a sua conta antes de pagar");
        }
    }
}
