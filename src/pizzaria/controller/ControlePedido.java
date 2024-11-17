package pizzaria.controller;

import java.util.ArrayList;
import pizzaria.model.Pedido;
import pizzaria.model.Produto;
import pizzaria.model.PedidoRep;

public class ControlePedido implements IControllerPedido{
    
    private PedidoRep pedidos = PedidoRep.getInstance();
    

    @Override
    public void adicionarOuAtualizarPedido(Pedido pedido){
        this.pedidos.adicionarPedido(pedido);
        
    }
    
    @Override
    public void removerProduto (int idProduto, Pedido pedido, int quant){
        for(Produto p : pedido.getProdutos().keySet()){
            if(p.getId() == idProduto){
                int quantP = pedido.getProdutos().get(p);
                if(quantP <= quant){
                    pedido.getProdutos().remove(p);
                    System.out.println("Produto removido do pedido!");
                }
                else{
                    pedido.getProdutos().put(p, quantP-quant);
                    System.out.println("Foi removido" + (quantP-quant) + p.getNome() + "do pedido." );
                }
                break;
            }
        }
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
}