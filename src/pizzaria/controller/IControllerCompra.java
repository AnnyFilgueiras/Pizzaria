package pizzaria.controller;

import java.util.ArrayList;
import pizzaria.model.Ingrediente;
import pizzaria.model.Simples;

public interface IControllerCompra {
 
    public void AdicionarOuAtualizarSimples (Simples simples, ArrayList<Simples> listaS, int quantS);
    
    public void AdicionarOuAtualizarIngrediente (Ingrediente ingrediente, ArrayList<Ingrediente> listaI, int quantI);
    
    public void cancelarSimples (int id);
    
    public void cancelarIngrediente (int id);
    
    public void cancelarCompra (int id);
}