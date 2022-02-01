
import java.util.Scanner;

public class Loja {
    public static void main(String[] args) throws Exception {
        
        Produto[] produtos = new Produto[Produto.max_produtos];

        produtos[0] = new Produto("Vandal","Sublime","Amarela", 1775);
        produtos[1] = new Produto("Vandal" ,"Saqueadora","Preta", 1775);
        produtos[2] = new Produto("Leque Celestial","Dourado", 3550);
        produtos[3] = new Produto("Operator", "Sentinels of Light","Amarela", 2175);
        produtos[4] = new Produto("Odin", "Glitchpop","Amarela", 2175);

        Cliente c1 = new Cliente();
        Gerente g1 = new Gerente();

        int op;
        Scanner ent = new Scanner(System.in);

        System.out.println("MENU PRINCIPAL:");

        do{
            System.out.println("\n___________________________________________________");
            System.out.println("INFORME SUA OPÇÃO: \n[1] - LOGAR COMO CLIENTE\n[2] - LOGAR COMO GERENTE\n");

            if(Cliente.cadastro){
                System.out.println("BEM VINDO " + c1.getNome() + "\n" );
                System.out.println("OPÇÕES PARA CLIENTE: \n[3] - ACESSAR CATALOGO\n[4] - ADICIONAR PRODUTO AO CARRINHO\n[5] - PAGAR O VALOR CARRINHO\n[6] - ADICIONAR FUNDOS NA CONTA\n[7] - VER INFORMAÇÕES DE PAGAMENTO\n");
            } 
            if(Gerente.isGerente){
                System.out.println("OPÇÕES PARA GERENTE: \n[8] - ADICIONAR UM NOVO PRODUTO\n[9] - REMOVER PRODUTO EXISTENTE\n[10] - ALTERAR INFORMAÇÕES DE PRODUTO EXISTENTE\n[0] - SAIR DA OPERACAO");
            }
            op = ent.nextInt();

            switch(op){

                case 1:

                    c1.logar();

                break;

                
                case 2:

                    g1.loginGerente();
                    
                break;


                case 3:
                    //CATALOGO

                    if(Cliente.cadastro){

                        for(int i = 0; i < Produto.quantidade_produtos; i++){

                            System.out.println("\n___________________________________________________");
                            System.out.println(produtos[i].toString());

                        }

                    }else Cliente.alerta();
            
                break;
                

                case 4:
                //ADICIONAR AO CARRINHO
                    Carrinho ca1 = new Carrinho();

                    if(Cliente.cadastro){

                        System.out.println("-> INFORME O CODIGO DO PRODUTO PARA ADICIONAR NO CARRINHO: \n");
                        int codigo_carrinho = ent.nextInt();

                        if(codigo_carrinho >= Produto.quantidade_produtos || codigo_carrinho < 0 ){

                            System.out.println("\n---> CODIGO INVÁLIDO!");

                        }else{

                            System.out.println("\n-> INFORMAÇÕES DO PRODUTO: \n" + produtos[codigo_carrinho].toString());
                            ca1.adicionarProduto(produtos[codigo_carrinho].getValor());

                            System.out.println(ca1.toString());
                        }

                    }else Carrinho.alerta();

                break;
                

                case 5:
                //PAGAR O CARRINHO

                    if(Cliente.cadastro){

                        if(Carrinho.temNoCarrinho || Carrinho.totalCarrinho != 0){

                            if(c1.getFundos() > Carrinho.totalCarrinho){

                                System.out.println("\n-> OPERAÇÃO REALIZADA");

                                    c1.descontarFundos(Carrinho.totalCarrinho);
                                    Carrinho.pagarCarrinho();

                                    Carrinho.info();
                                    c1.infoFundos();

                            }else Carrinho.semFundos();

                        }else Carrinho.vazio();

                    }else Cliente.alerta();
                
                break;


                case 6:
                //ADICIONAR FUNDOS NA CONTA
                
                int fundos;

                if(Cliente.cadastro){

                    clearBuffer(ent);

                    System.out.println("\n___________________________________________________");
                    System.out.println("ADICIONANDO FUNDOS NA CONTA \n");

                    System.out.println("-> INFORME O VALOR A SER ADICIONADO: ");
                    fundos = ent.nextInt();

                    if(fundos > 0){

                            System.out.println("\n-> OPERAÇÃO REALIZADA");
                            c1.addFundos(fundos);

                            c1.infoFundos();

                    }else{
                        System.out.println("\nVALOR INFORMADO INVÁLIDO");
                    }

                }else Cliente.alerta();

                break;


                case 7:
                //VER INFORMAÇÕES DE PAGAMENTO

                if(Cliente.cadastro){
                    
                    System.out.println("\n___________________________________________________");
                    System.out.println("-> INFORMAÇÕES DE PAGAMENTO: \n");

                    Carrinho.info();
                    c1.infoFundos();

                }else Cliente.alerta();
                
                break;


                case 8:
                //ADICIONAR NOVO PRODUTO
                
                    clearBuffer(ent);
                    if(Gerente.isGerente){

                        System.out.println("\n___________________________________________________");
                        System.out.println("ADICINANDO UM NOVO PRODUTO \n");

                            for(int i = Produto.quantidade_produtos; i < Produto.max_produtos; i++){

                                clearBuffer(ent);

                                System.out.println("-> CADASTRANDO PRODUTO DE CODIGO: "+Produto.quantidade_produtos+"\n");
                    
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

                                produtos[i] = new Produto(tipo, nome, cor, valorVp);
                                System.out.println("\n___________________________________________________");
                    
                            }
                                            
                    }else Gerente.alerta();

                    clearBuffer(ent);
                
                break;


                case 9:
                //REMOVER PRODUTO EXISTENTE
                    
                    if(Gerente.isGerente){

                        System.out.println("\n___________________________________________________");
                        System.out.println("REMOVENDO PRODUTO EXISTENTE \n");

                        clearBuffer(ent);
                        System.out.println("\n-> PARA CANCELAR OPERAÇÃO DIGITE 0");
                        System.out.println("\n-> PARA PROSSEGUIR DIGITE QUALQUER OUTRO NUMERO");

                        int op1 = ent.nextInt();

                        if(op1 == 0 ) break;

                        boolean cond = false;
                        int codigo_remover;

                        do{

                            System.out.println("-> INFORME O CODIGO DO PRODUTO QUE QUER REMOVER DO ESTOQUE\n");
                            codigo_remover = ent.nextInt();
                            
                            if(codigo_remover > Produto.quantidade_produtos || codigo_remover < 0 ){

                                cond = true;
                                System.out.println("---> CODIGO INVALIDO \n");

                            }else cond = false;


                        }while(cond);

                            System.out.println("\n___________________________________________________");
                            System.out.println("-> REMOVENDO PRODUTO DE CODIGO "+codigo_remover);

                            System.out.println("\n-> INFORMAÇÕES DO PRODUTO \n"+produtos[codigo_remover].toString());

                            System.out.println("\n1 - PARA CONFIRMAR \n0 - PARA CANCELAR");
                            op1 = ent.nextInt();

                            if(op1 == 1){

                                System.out.println("-> OPERAÇÃO CONCLUÍDA \n");
                                produtos[codigo_remover].remover();

                            }else if(op1 == 0){
                                System.out.println("-> OPERAÇÃO CANCELADA \n");
                            }

                            clearBuffer(ent);

                    }else Gerente.alerta();

                break;


                case 10:
                //ALTERAR INFORMAÇÕES DE PRODUTO EXISTENTE
                    
                boolean cond;
                
                if(Gerente.isGerente){

                    System.out.println("\n___________________________________________________");
                    System.out.println("ALTERANDO INFORMAÇÕES DE UM PRODUTO \n");

                    clearBuffer(ent);

                    System.out.println("\n-> PARA CANCELAR OPERAÇÃO DIGITE 0");
                    System.out.println("\n-> PARA PROSSEGUIR DIGITE QUALQUER OUTRO NUMERO");

                    int op_alt = ent.nextInt();

                    if(op_alt == 0) break;

                    System.out.println("-> INFORME O CODIGO DO PRODUTO QUE QUER ALTERAR AS INFORMAÇÕES\n");
                    int codigo_alterar = ent.nextInt();

                    do{

                        if(codigo_alterar > Produto.quantidade_produtos || codigo_alterar < 0 ){

                            cond = true;
                            System.out.println("---> CODIGO INVALIDO \n");

                        }else cond = false;

                    }while(cond);

                    System.out.println("-> INFORMAÇÕES DO PRODUTO \n");
                    System.out.println(produtos[codigo_alterar].toString());

                    System.out.println("\n-> REALIZANDO ALTERAÇÕES: INFORME O VALOR PARA ALTERAR A RESPECTIVA INFORMAÇÃO");

                    do{

                        System.out.println("1 - TIPO DO PRODUTO \n2 - NOME \n3 - COR \n4 - VALOR EM VALORANT POINTS \n0 - CANCELAR OPERAÇÃO");
                        op_alt = ent.nextInt();

                        switch(op_alt){

                            case 1: 
                                System.out.println("INFORME UM NOVO TIPO:");
                                produtos[codigo_alterar].setTipo(ent.next());

                            break;

                            case 2:
                                System.out.println("INFORME UM NOVO NOME:");
                                produtos[codigo_alterar].setNome(ent.next());
                                
                            break;

                            case 3:
                                System.out.println("INFORME UMA NOVA COR:");
                                produtos[codigo_alterar].setCor(ent.next());

                            break;

                            case 4:
                                System.out.println("INFORME UM NOVO VALOR:");
                                produtos[codigo_alterar].setValor(ent.nextInt());

                            break;

                            case 0:
                                System.out.println("-> OPERAÇÃO CANCELADA \n");
                            break;

                        }
                        
                    }while(op_alt != 0);
                                     
                }else Gerente.alerta();

                break;


                case 0:
                    //SAIR DA APLICAÇÃO
                break;
            }

        }while(op != 0);

    }

    private static void clearBuffer(Scanner ent) {
    }
}


