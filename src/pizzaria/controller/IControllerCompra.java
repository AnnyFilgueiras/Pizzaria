package pizzaria.controller;

import java.util.ArrayList;
import pizzaria.model.Compra;

public interface IControllerCompra {

    public Compra fazerCompra();

    public ArrayList<Compra> listarCompras();
 
    //public void AdicionarOuAtualizarSimples (Simples simples, int quant);
    
    //public void AdicionarOuAtualizarIngrediente (Ingrediente ingrediente, int quant);
}