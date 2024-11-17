package pizzaria.controller;

import pizzaria.model.Ingrediente;
import pizzaria.model.IngredienteRep;
import java.util.ArrayList;


public class ControleIngrediente implements IControllerIngrediente{
    
    private IngredienteRep ingredientes = IngredienteRep.getInstance();

    @Override
    public void adicionarOuAtualizarIngrediente(Ingrediente ingrediente){
        System.out.print("");
        ingredientes.adicionarIngrediente(ingrediente);
    }
    
    @Override
    public void removerIngrediente (int id){
        ingredientes.removerIngrediente(id);
    }
    
    @Override
    public ArrayList<Ingrediente> obterIngredientes(){
        return this.ingredientes.listarIngredientes();
    }
}