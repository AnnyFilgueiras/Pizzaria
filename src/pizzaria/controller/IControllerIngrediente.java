package pizzaria.controller;

import java.util.ArrayList;
import pizzaria.model.Ingrediente;

public interface IControllerIngrediente {
    
    public void adicionarOuAtualizarIngrediente(Ingrediente ingrediente);
    
    public void removerIngrediente (int id);
    
    public ArrayList<Ingrediente> obterIngredientes ();
}