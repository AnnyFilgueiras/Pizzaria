package pizzaria.controller;

import pizzaria.model.Produto;
import pizzaria.model.Simples;
import pizzaria.model.SimplesRep;

public class ControleSimples implements IControllerSimples {

    private SimplesRep simples = SimplesRep.getInstance();

    @Override
    public void adicionarOuAtualizarProduto(Produto produto, String tipo){
        this.simples.adicionarOuAtualizarSimples(((Simples)produto));
    }

    @Override
    public void removerProduto(int id, String tipo){
        this.simples.removerSimples(id);
    }

    @Override
    public Produto obterProduto(int id, String tipo){
        return this.simples.buscarSimples(id);
    }
}
