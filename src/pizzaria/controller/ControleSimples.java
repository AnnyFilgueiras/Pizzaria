package pizzaria.controller;

import java.util.ArrayList;
import pizzaria.model.Produto;
import pizzaria.model.SimplesRep;

public class ControleSimples implements IControllerSimples {

    private SimplesRep simples = SimplesRep.getInstance();

    @Override
    public void adicionarOuAtualizarProduto(Produto produto, String tipo){
        this.simples.adicionarOuAtualizarSimples(produto);
    }

    @Override
    public void removerProduto(int id, String tipo){
        this.simples.removerSimples(id);
    }

    @Override
    public Produto obterProduto(int id, String tipo){
        return this.simples.buscarSimples(id);
    }

    @Override
    public ArrayList<Produto> listarSimples(){
        return this.simples.listarSimples();
    }
}
