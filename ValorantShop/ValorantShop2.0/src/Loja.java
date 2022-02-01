import java.util.Scanner;
import java.util.ArrayList;

public class Loja {

    // -> VALORANTSHOP DESENVOLVIDO PELA DUPLA: 
    // * JOÃO PEDRO MARTINS CRUZ
    // * ISABELLY ARAÚJO TEMOTEO

    public static void main(String[] args) throws Exception {
        
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        ArrayList<Acessorios> acessorios = new ArrayList<Acessorios>();

        produtos.add(new Produto("Vandal","Sublime","Amarela", 1775));
        produtos.add(new Produto("Vandal" ,"Saqueadora","Preta", 1775));
        produtos.add(new Produto("Faca","Leque Celestial","Dourado", 3550));
        produtos.add(new Produto("Operator", "Sentinels of Light","Amarela", 2175));
        produtos.add(new Produto("Odin", "Glitchpop","Amarela", 2175));

        acessorios.add(new Poster("TESTE", 1, 1, 1));
        acessorios.add(new Chaveiros("TESTE1", 10, "RETANGULAR"));

        Cliente c1 = new Cliente();
        Gerente g1 = new Gerente();

        int op;
        Scanner ent = new Scanner(System.in);

        

        do{
            barras_menu();
            System.out.println("MENU PRINCIPAL:");
            System.out.println("\nINFORME SUA OPÇÃO");

            if(!c1.getCadastro()) System.out.println("[1] - LOGAR COMO CLIENTE");
            if(!g1.getCadastro()) System.out.println("[2] - LOGAR COMO GERENTE");
            
            if(c1.getCadastro()){
                System.out.println("\nBEM VINDO " + c1.getNome());
                System.out.println("\nOPÇÕES PARA CLIENTE: \n\n[3] - ACESSAR CATALOGO\n[4] - ADICIONAR PRODUTO AO CARRINHO\n[5] - PAGAR O VALOR CARRINHO\n[6] - ADICIONAR FUNDOS NA CONTA\n[7] - VER INFORMAÇÕES DE PAGAMENTO\n[8] - VER NOVIDADES DE 2022!");
            } 
            if(g1.getCadastro()){
                System.out.println("\nOPÇÕES PARA GERENTE: \n\n[9] - ADICIONAR UM NOVO PRODUTO\n[10] - REMOVER PRODUTO EXISTENTE\n[11] - ALTERAR INFORMAÇÕES DE PRODUTO EXISTENTE\n[12] - VER INFORMAÇÕES CADASTRADAS\n[0] - SAIR DA OPERACAO");
            }

            op = ent.nextInt(); 

            switch(op){

                case 1:
                    //LOGIN CLIENTE
                    c1.logar();
                
                break;

                
                case 2:
                    //LOGIN GERENTE 
                    clear_menu();
                    System.out.println("INFORME UMA SENHA");
                    int senha = ent.nextInt();

                    try {
                        g1.verificaSenha(senha);
                       
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                
                break;


                case 3:
                    //CATALOGO
                    clear_menu();
                    if(c1.getCadastro()){

                        for(Produto p : produtos){
                            barras_menu();
                            System.out.println(p.toString());
                        }

                    }else Cliente.alerta();
            
                break;
                

                case 4:
                //ADICIONAR AO CARRINHO
                    Carrinho ca1 = new Carrinho();

                    if(c1.getCadastro()){
                        
                        clear_menu();
                        System.out.println("-> INFORME O CODIGO DO PRODUTO PARA ADICIONAR NO CARRINHO: \n");
                        int codigo_carrinho = ent.nextInt();

                        try{

                            Carrinho.verificaCodigo(codigo_carrinho);
                            
                            clear_menu();
                            System.out.println("\n\n\n-> INFORMAÇÕES DO PRODUTO: \n" + produtos.get(codigo_carrinho).toString());
                                ca1.adicionarProduto(produtos.get(codigo_carrinho).getValor());
                                Carrinho.info();

                        } catch(Exception e) {
                            clear_menu();
                            barras_menu();
                            System.out.println(e.getMessage());
                        }
                        
                    }else Carrinho.alerta(); 
                    
                break;
                

                case 5:
                //PAGAR O CARRINHO
                    if(c1.getCadastro()){

                        try {
                            Carrinho.verificaCarrinho(c1.getFundos() );
                            clear_menu();
                            System.out.println("\n-> OPERAÇÃO REALIZADA");

                                c1.descontarFundos(Carrinho.totalCarrinho);
                                Carrinho.pagarCarrinho();

                                    Carrinho.info();
                                    c1.infoFundos();

                        } catch (Exception e) {
                            clear_menu();
                            barras_menu();
                            System.out.println(e.getMessage());
                        }

                    }else Cliente.alerta();
                
                break;


                case 6:
                //ADICIONAR FUNDOS NA CONTA
                    int fundos;

                    if(c1.getCadastro()){

                        clearBuffer(ent);
                        clear_menu();
                        barras_menu();
                        System.out.println("ADICIONANDO FUNDOS NA CONTA \n");

                        System.out.println("-> INFORME O VALOR A SER ADICIONADO: ");
                        fundos = ent.nextInt();

                        if(fundos > 0){

                                clear_menu();
                                System.out.println("\n-> OPERAÇÃO REALIZADA");
                                c1.addFundos(fundos);

                                c1.infoFundos();

                        }else{
                            clear_menu();
                            System.out.println("\nVALOR INFORMADO INVÁLIDO");
                        }

                    }else Cliente.alerta();

                break;


                case 7:
                //VER INFORMAÇÕES DE PAGAMENTO
                    if(c1.getCadastro()){
            
                        clear_menu();
                        barras_menu();
                        System.out.println("-> INFORMAÇÕES DE PAGAMENTO: \n");

                        Carrinho.info();
                        c1.infoFundos();

                    }else Cliente.alerta();
                    
                    break;


                case 8:
                    //VER NOVIDADES DE 2022
                    if(c1.getCadastro()){

                        clear_menu();
                        barras_menu();
                        System.out.println("-> NOVIDADES DE 2022! : \n");

                        for(Acessorios a : acessorios){
                            a.imprimeInformacoes();
                        }


                    }else Cliente.alerta();

                break;


                case 9:
                    //ADICIONAR NOVO PRODUTO
                    clearBuffer(ent);
                    if(g1.getCadastro()){

                            if(produtos.size() < Produto.max_produtos) {
                                
                                clear_menu();
                                barras_menu();
                                System.out.println("ADICINANDO UM NOVO PRODUTO \n");

                                clearBuffer(ent);

                                System.out.println("-> CADASTRANDO PRODUTO DE CODIGO: "+Produto.quantidade_produtos+"\n");
                    
                                try {
                                    
                                    System.out.println("INFORME O TIPO DO PRODUTO: ");
                                    String tipo = ent.next();
                                    clearBuffer(ent);

                                    System.out.println("INFORME O NOME DO PRODUTO: ");
                                    String nome = ent.next();
                                    clearBuffer(ent);
                                    
                                    System.out.println("INFORME A COR DO PRODUTO: ");
                                    String cor = ent.next();
                                    clearBuffer(ent);
                        
                                    System.out.println("INFORME O VALOR DO PRODUTO: ");
                                    int valorVp = ent.nextInt();
                                    clearBuffer(ent);

                                    produtos.add(new Produto(tipo, nome, cor, valorVp));
                                    barras_menu();

                                } catch (Exception e) {
                                    clear_menu();
                                    System.out.println("[ERRO AO CADASTRAR] - tente novamente!");
                                }
                                
                            }else {
                                clear_menu();
                                System.out.println("-> ESTOQUE DE LOJA CHEIO !\n");
                            }
                                            
                    }else Gerente.alerta();

                    clearBuffer(ent);
                
                break;


                case 10:
                    //REMOVER PRODUTO EXISTENTE
                    if(g1.getCadastro()){

                        clear_menu();
                        barras_menu();
                        System.out.println("REMOVENDO PRODUTO EXISTENTE \n");

                        clearBuffer(ent);
                        
                        boolean cond = false;
                        int codigo_remover;

                        do{

                            System.out.println("-> INFORME O CODIGO DO PRODUTO QUE QUER REMOVER DO ESTOQUE\n");
                            codigo_remover = ent.nextInt();
                            
                            if(codigo_remover > produtos.size() || codigo_remover < 0 ){

                                cond = true;
                                System.out.println("---> CODIGO INVALIDO \n");

                            }else cond = false;


                        }while(cond);

                            clear_menu();
                            barras_menu();
                            System.out.println("-> REMOVENDO PRODUTO DE CODIGO " + codigo_remover);
                            System.out.println("\n-> INFORMAÇÕES DO PRODUTO \n" + produtos.get(codigo_remover).toString());

                            System.out.println("\n1 - PARA CONFIRMAR \n0 - PARA CANCELAR");
                            int op1 = ent.nextInt();

                            if(op1 == 1){

                                System.out.println("-> OPERAÇÃO CONCLUÍDA \n");
                                produtos.remove(produtos.get(codigo_remover));

                                int i = 0;
                                for (Produto produto : produtos) {
                                    produto.setCodigo(i);
                                    i++;
                                }

                                Produto.quantidade_produtos = i;

                            }else if(op1 == 0){
                                System.out.println("-> OPERAÇÃO CANCELADA \n");
                            }

                            clearBuffer(ent);

                    }else Gerente.alerta();

                break;


                case 11:
                    //ALTERAR INFORMAÇÕES DE PRODUTO EXISTENTE
                    boolean cond;
                    
                    if(g1.getCadastro()){

                        clear_menu();
                        barras_menu();
                        System.out.println("ALTERANDO INFORMAÇÕES DE UM PRODUTO \n");

                        clearBuffer(ent);

                        int codigo_alterar;

                        do{

                            System.out.println("-> INFORME O CODIGO DO PRODUTO QUE QUER ALTERAR AS INFORMAÇÕES\n");
                            codigo_alterar = ent.nextInt();

                            if(codigo_alterar > produtos.size() || codigo_alterar < 0 ){

                                cond = true;
                                clear_menu();
                                System.out.println("---> CODIGO INVALIDO \n");

                            }else cond = false;

                        }while(cond);

                        clear_menu();
                        barras_menu();
                        System.out.println("-> INFORMAÇÕES DO PRODUTO \n");
                        System.out.println(produtos.get(codigo_alterar).toString());
                        System.out.println("\n-> REALIZANDO ALTERAÇÕES: INFORME O VALOR PARA ALTERAR A RESPECTIVA INFORMAÇÃO");

                            int op_alt = 0;

                            do{

                                try {
                                    
                                    System.out.println("\n1 - TIPO DO PRODUTO \n2 - NOME \n3 - COR \n4 - VALOR EM VALORANT POINTS \n0 - CONCLUIR");
                                    op_alt = ent.nextInt();

                                    switch(op_alt){

                                        case 1: 
                                            System.out.println("\nINFORME UM NOVO TIPO:");
                                            produtos.get(codigo_alterar).setTipo(ent.next());
        
                                        break;
        
                                        case 2:
                                            System.out.println("\nINFORME UM NOVO NOME:");
                                            produtos.get(codigo_alterar).setNome(ent.next());
                                            
                                        break;
        
                                        case 3:
                                            System.out.println("\nINFORME UMA NOVA COR:");
                                            produtos.get(codigo_alterar).setCor(ent.next());
        
                                        break;
        
                                        case 4:
                                            System.out.println("\nINFORME UM NOVO VALOR:");
                                            produtos.get(codigo_alterar).setValor(ent.nextInt());
        
                                        break;
        
                                        case 0:
                                            System.out.println("-> OPERAÇÃO CANCELADA \n");
                                        break;
        
                                    }

                                } catch (Exception e) {
                                    System.out.println("[ERRO AO ALTERAR - tente novamente]");
                                }

                        }while(op_alt != 0);
                                        
                    }else Gerente.alerta();

                break;

                case 12:
                    //APRESENTAR INFORMAÇÕES
                    clear_menu();
                    barras_menu();
                    c1.informa();
                    g1.informa();
                break;

                case 0:
                    //SAIR DA APLICAÇÃO
                break;
            }

        }while(op != 0);

    }

    private static void clearBuffer(Scanner ent) {
    }

    public static void barras_menu(){
        System.out.println("\n___________________________________________________");
    }

    public static void clear_menu(){

        for(int i = 0; i < 30; i++){
            System.out.println();
        }
    }
}


