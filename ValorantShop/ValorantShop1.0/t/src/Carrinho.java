public class Carrinho {

    //private int ValorVp;

    public static int totalCarrinho = 0;
    public static boolean temNoCarrinho = false;

    public void adicionarProduto(int valor){
        
        totalCarrinho += valor;
        temNoCarrinho = true;

    }

    public String toString(){
        
        return("\n-> VALOR TOTAL DO CARRINHO "+totalCarrinho+"\n");
    }

    public static void alerta(){

        System.out.println("\n___________________________________________________");
        System.out.println("PARA ACESSAR ESSA FUNCIONALIDADE É NECESSARIO SE CADASTRAR COMO CLIENTE");
    }

    public static void vazio(){

        System.out.println("\n___________________________________________________");
        System.out.println("-> CARRINHO VAZIO");
    }

    public static void semFundos(){

        System.out.println("\n___________________________________________________");
        System.out.println("-> SEM FUNDO SUFICIENTE PARA PAGAR O CARRINHO");
    }

    public static void info(){

        System.out.println("\n___________________________________________________");
        System.out.println("VALOR ATUAL DO CARRINHO: "+ totalCarrinho);

    }

    public static void pagarCarrinho(){
        totalCarrinho = 0;
    }
}
