package pizzaria.controller;

import java.util.Scanner;
import pizzaria.model.Funcionario;
import pizzaria.model.Pedido;
import pizzaria.model.PedidoRep;
import pizzaria.model.Garcon;
import pizzaria.model.GarconRep;
import pizzaria.model.Cliente;
import pizzaria.model.SimplesRep;
import pizzaria.model.Produto;
import pizzaria.model.Simples;
import pizzaria.model.CompostoRep;

public class ControleGarcon implements IControllerGarcon{ 

    private GarconRep garcons = GarconRep.getInstance();
    private PedidoRep pedidos = PedidoRep.getInstance();
    private SimplesRep simples = SimplesRep.getInstance();
    private CompostoRep composto = CompostoRep.getInstance();
    Scanner input = new Scanner(System.in);
    
    public void anotarOuAtualizarPedido(Funcionario garcon, Cliente cliente){
        System.out.println("Qual o ID do pedido: ");
        int idPedido = input.nextInt();
        if(pedidos.buscarPedido(idPedido) == null){
            Pedido pedido = new Pedido(cliente, garcon);
            

            while(true){
                System.out.println("Digite 0 para cancelar ou 1 para continuar: ");
                int entrada = input.nextInt();
                if (entrada == 0){
                    break;
                }
                
                System.out.println("Anote aqui o ID do produto: ");
                int id = input.nextInt();
                System.out.println("Quantidade do produto: ");
                int quant = input.nextInt();


                if(id >= 100){ // O Produto anotado é Simples
                    Produto produto = simples.buscarSimples(id);
                    if(((Simples)produto).getQuantEstoque() == 0){
                        System.out.println("Produto em falta! Estamos falindo!");
                        continue;
                    }
                    else if(((Simples)produto).getQuantEstoque() < quant){
                        System.out.println("Quantidade insuficiente em estoque!");
                        continue;
                    }
                    else{
                        this.darBaixaEstoqueGarcon(id, quant);
                    }
                    pedido.getProdutos().put(produto, quant);

                }
                
                else{ // O Produto anotado é Composto
                
                    Produto produto = composto.buscarComposto(id);

                    pedido.getProdutos().put(produto, quant);
                }
            }
        }
        else{
            System.out.println("ID já cadastrado no sistema!");
        }
    }

    public String darBaixaEstoqueGarcon(int idSimples, int quant){

        Scanner ler = new Scanner(System.in);

        while(true){
            System.out.println("Digite seu ID: ");
            int idGarcon = ler.nextInt();

            if(obterFuncionario(idGarcon, "")!=null){
                Produto produto = simples.buscarSimples(idSimples);

                ((Simples)produto).setQuantEstoque(((Simples)produto).getQuantEstoque() - quant);

                return "Estoque atualizado";
            }
            else{
                System.out.println("Seu ID não permite dar baixa no estoque, tente novamente");
                ler.close();

            }
        }
            
    }

    @Override
    public void adicionarOuAtualizarFuncionario(Funcionario funcionario, String tipo){
        this.garcons.adicionarGarcon(((Garcon)funcionario));
    }

    @Override
    public void removerFuncionario(int id, String tipo){
        this.garcons.removerGarcon(id);

    }

    @Override
    public Funcionario obterFuncionario(int id, String tipo){
        return this.garcons.buscarGarcon(id);
        
    }
}