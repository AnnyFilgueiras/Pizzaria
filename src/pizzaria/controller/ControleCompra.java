package pizzaria.controller;

import java.util.ArrayList;
import pizzaria.model.CompraRep;
import pizzaria.model.Ingrediente;
import pizzaria.model.Simples;

public class ControleCompra implements IControllerCompra{

    private CompraRep compras = new CompraRep();
    
    @Override
    public void AdicionarOuAtualizarSimples(Simples simples, ArrayList<Simples> listaS, int quantS) {
    }

    @Override
    public void AdicionarOuAtualizarIngrediente(Ingrediente ingrediente, ArrayList<Ingrediente> listaI, int quantI) {
    }

    @Override
    public void cancelarSimples(int id) {
    }

    @Override
    public void cancelarIngrediente(int id) {
    }

    @Override
    public void cancelarCompra(int id) {
    }
}