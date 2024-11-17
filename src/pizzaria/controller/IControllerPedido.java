package pizzaria.controller;

import java.util.ArrayList;
import pizzaria.model.Pedido;
import pizzaria.model.PedidoRep;

public interface IControllerPedido {
 
    public void adicionarOuAtualizarPedido (Pedido pedido);
    
    public void removerProduto (int id, Pedido pedido, int quant);
    
    public void cancelarPedido (int id);

    public ArrayList<Pedido> obterPedidos();

    public PedidoRep getPedidos();

    public Pedido obterPedido(int id);
}