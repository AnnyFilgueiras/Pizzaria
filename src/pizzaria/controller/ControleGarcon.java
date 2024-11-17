package pizzaria.controller;

import java.util.ArrayList;
import java.util.Scanner;
import pizzaria.model.Cliente;
import pizzaria.model.CompostoRep;
import pizzaria.model.Funcionario;
import pizzaria.model.Garcon;
import pizzaria.model.GarconRep;
import pizzaria.model.Pedido;
import pizzaria.model.PedidoRep;
import pizzaria.model.Produto;
import pizzaria.model.Simples;
import pizzaria.model.SimplesRep;

public class ControleGarcon implements IControllerGarcon{ 

    private GarconRep garcons = GarconRep.getInstance();
    private PedidoRep pedidos = PedidoRep.getInstance();
    private SimplesRep simples = SimplesRep.getInstance();
    private CompostoRep composto = CompostoRep.getInstance();
    Scanner input = new Scanner(System.in);
    
    @Override
    public void anotarPedido(Funcionario garcon, Cliente cliente) {
    Pedido pedido = new Pedido(cliente, garcon);
    int entrada;
    boolean temProdutos = false; 

    while (true) {
        System.out.println("Anote aqui o ID do produto: ");
        int id = input.nextInt();

        System.out.println("Quantidade do produto: ");
        int quant = input.nextInt();

        Produto produto = null;

        
        if (id >= 100 && id < 200) {
            produto = simples.buscarSimples(id);
            if (produto == null) {
                continue;
            }

            Simples simplesProduto = (Simples) produto;

            
            if (simplesProduto.getQuantEstoque() < quant) {
                System.out.println("Quantidade insuficiente em estoque! Estamos falindo!");
                System.out.println("Digite 0 para cancelar, 1 para continuar ou 2 para finalizar o pedido: ");
                entrada = input.nextInt();
                if (entrada == 0 || entrada == 2) {
                    break;
                }
                continue;
            }

            
            this.darBaixaEstoqueGarcon(id, quant);
        }

        
        else if (id < 100) {
            produto = composto.buscarComposto(id);
            if (produto == null) {
                System.out.println("Produto composto não encontrado.");
                continue;
            }
        }

        
        else {
            System.out.println("O ID digitado não é um ID de produto válido.");
            continue;
        }

        
        pedido.getProdutos().put(produto, quant);
        temProdutos = true; 
        System.out.println("Produto " + produto.getNome() + " foi adicionado.");

        System.out.println("Digite 0 para cancelar, 1 para continuar ou 2 para finalizar o pedido: ");
        entrada = input.nextInt();

        if (entrada == 0 || entrada == 2) {
            break;
        }
    }

    
    if (!temProdutos) {
        System.out.println("Nenhum produto foi adicionado. Pedido cancelado!");
    } else if (entrada == 0) {
        System.out.println("Pedido cancelado!");
    } else {
        System.out.println("Pedido anotado com sucesso!");
        pedidos.adicionarPedido(pedido);
    }

    
    }

    @Override
    public String darBaixaEstoqueGarcon(int idSimples, int quant){

        while(true){
            
            Produto produto = simples.buscarSimples(idSimples);

            ((Simples)produto).setQuantEstoque(((Simples)produto).getQuantEstoque() - quant);

            return "Estoque atualizado";

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

    @Override
    public ArrayList<Garcon> listarGarcons(){
        return this.garcons.listarGarcons();
    }
}