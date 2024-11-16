package pizzaria.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import pizzaria.model.Funcionario;
import pizzaria.model.Pedido;
import pizzaria.model.PedidoRep;
import pizzaria.model.Garcon;
import pizzaria.model.GarconRep;
import pizzaria.model.Cliente;
import pizzaria.model.IngredienteRep;
import pizzaria.model.SimplesRep;
import pizzaria.model.Produto;
import pizzaria.model.Simples;


public class ControleGarcon implements IControllerFuncionario{ 

    private GarconRep garcons = GarconRep.getInstance();
    private IngredienteRep ingredientes = IngredienteRep.getInstance();
    private PedidoRep pedidos = PedidoRep.getInstance();
    private SimplesRep simples = SimplesRep.getInstance();
    Scanner input = new Scanner(System.in);
    
    // Implementar darBaixaNoEstoque
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
                    if(((Simples)produto).getQuantEstoque() <= 0){
                        System.out.println("Produto em falta! Estamos falindo!");
                        continue;
                    }
                    if(((Simples)produto).getQuantEstoque() <= quant){
                        
                            pedido.getProdutos().put(produto, ((Simples)produto).getQuantEstoque());
                            ((Simples)produto).setQuantEstoque(0);
                        }
                        pedido.getProdutos().put(produto, quant);

                }
                else{ // O Produto anotado é Composto

                }
                pedido.getProdutos().put(id, quant);
             
            }
        }
        else{
            System.out.println("ID já cadastrado no sistema!");
        }
        


            /*
            System.out.println("Qual o nome do cliente: ");
            String nomeCliente = input.nextLine();
            System.out.println("Qual o CPF do cliente: ");
            String cpfCliente = input.nextLine();
            
            Cliente cliente = new Cliente(nomeCliente, cpfCliente);
            getClientes().adicionarCliente(cliente);
            */
        
    }

    public String darBaixaEstoque(int idIngrediente, int quantEstq){
        return "AHHAHAHHAHAHAHHAHAHA";
    }

    @Override
    public void adicionarOuAtualizarFuncionario(Funcionario funcionario){
        this.garcons.adicionarGarcon(((Garcon)funcionario));
    }

    @Override
    public void removerFuncionario(int id){
        this.garcons.removerGarcon(id);

    }

    @Override
    public Funcionario obterFuncionario(int id){
        return this.garcons.buscarGarcon(id);
        
    }
}