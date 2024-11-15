package pizzaria.controller;

import pizzaria.model.Produto;
import pizzaria.model.Simples;
import pizzaria.model.SimplesRep;

public class ControleSimples implements IControllerProduto {

    private SimplesRep simples = new SimplesRep();

    @Override
    public void adicionarOuAtualizarProduto(Produto produto){
        this.simples.adicionarSimples(((Simples)produto));
    }

    @Override
    public void removerProduto(int id){
        this.simples.removerSimples(id);
    }

    @Override
    public Produto obterProduto(int id){
        return this.simples.buscarSimples(id);
    }
}
