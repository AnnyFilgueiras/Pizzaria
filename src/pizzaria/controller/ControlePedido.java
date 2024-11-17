package pizzaria.controller;

import java.util.ArrayList;
import pizzaria.model.Pedido;
import pizzaria.model.PedidoRep;
import pizzaria.model.Produto;

public class ControlePedido implements IControllerPedido{
    
    private PedidoRep pedidos = PedidoRep.getInstance();
    

    @Override
    public void adicionarOuAtualizarPedido(Pedido pedido){
        this.pedidos.adicionarPedido(pedido);
        
    }
    
    @Override
    public void removerProduto (int idProduto, Pedido pedido, int quant){

        boolean valor = false;
        if(pedido == null){
            System.out.println("Pedido com esse ID não existe.");
        }
        else{
        for(Produto p : pedido.getProdutos().keySet()){
            if(p.getId() == idProduto){
                int quantP = pedido.getProdutos().get(p);
                if(quantP <= quant){
                    pedido.getProdutos().remove(p);
                    System.out.println("Produto removido do pedido!");
                    valor = true;
                }
                else{
                    pedido.getProdutos().put(p, quantP-quant);
                    valor = true;
                    System.out.println("Foi removido" + (quantP-quant) + p.getNome() + "do pedido." );
                }
                break;
            }
        }
        if (valor == false){ 
            System.out.println("Produto não encontrado no pedido!");
        }
        }
    }
    
    @Override
    public PedidoRep getPedidos(){
        return this.pedidos;
    }
    
    @Override
    public void cancelarPedido (int id){
        this.pedidos.removerPedido(id);
    }

    public void adicionarEmProdutos (Pedido pedido, Produto produto, int quant){ 
        pedido.getProdutos().put(produto, quant);
    }

    public ArrayList<Pedido> obterPedidos(){
        return this.pedidos.listarPedidos();
    }

    @Override
    public Pedido obterPedido(int id){
        return this.pedidos.buscarPedido(id);
    }
}