package pizzaria.controller;

import java.util.ArrayList;
import pizzaria.model.Pedido;

public interface IControllerPedido {
 
    public void adicionarOuAtualizarPedido (Pedido pedido);
    
    public void removerProduto (int id, Pedido pedido, int quant);
    
    public void cancelarPedido (int id);

    public ArrayList<Pedido> obterPedidos();
}