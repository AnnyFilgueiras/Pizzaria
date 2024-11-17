package pizzaria.controller;



import pizzaria.model.Produto;

public interface IControllerProduto {
    
    public void adicionarOuAtualizarProduto(Produto produto, String tipo); //arrumar no UML
    
    public void removerProduto (int id, String tipo);
    
    public Produto obterProduto (int id, String tipo);
}