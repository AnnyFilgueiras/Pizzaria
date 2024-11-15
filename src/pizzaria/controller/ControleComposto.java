package pizzaria.controller;

import pizzaria.model.Composto;
import pizzaria.model.CompostoRep;
import pizzaria.model.Produto;

public class ControleComposto implements IControllerProduto{

    private CompostoRep compostos = new CompostoRep();

    @Override
    public void adicionarOuAtualizarProduto(Produto produto){
        this.compostos.adicionarComposto(((Composto)produto));
    }

    @Override
    public void removerProduto(int id) {
        this.compostos.removerComposto(id);
    }

    @Override
    public Produto obterProduto(int id) {
        return this.compostos.buscarComposto(id);
    }
    
}
