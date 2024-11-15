package pizzaria.controller;


import java.util.HashMap;
import pizzaria.model.Produto;

public interface IControllerProduto {
    
    public void adicionarOuAtualizarProduto(Produto produto); //arrumar no UML
    
    public void removerProduto (int id);
    
    public Produto obterProduto (int id);
}