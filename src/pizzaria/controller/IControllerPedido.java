package pizzaria.controller;

import java.util.ArrayList;
import pizzaria.model.Produto;

public interface IControllerPedido {
 
    public void adicionarOuAtualizarPedido (ArrayList<Produto> produtos, Produto produto, int quantP);
    
    public void removerProduto (int id, int quantP); //não seria o msm q atualizar?
    
    public void cancelarPedido (int id);
}