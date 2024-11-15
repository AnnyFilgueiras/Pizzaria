package pizzaria.controller;

import pizzaria.model.Ingrediente;
import pizzaria.model.IngredienteRep;
import java.util.ArrayList;


public class ControleIngrediente implements IControllerIngrediente{
    
    private IngredienteRep ingredientes = new IngredienteRep();

    @Override
    public void adicionarOuAtualizarIngrediente(Ingrediente ingrediente){
        ingredientes.adicionarIngrediente(ingrediente);
    } //arrumar no UML
    
    @Override
    public void removerIngrediente (int id){
        ingredientes.removerIngrediente(id);
    }
    
    @Override
    public ArrayList<Ingrediente> obterIngredientes(){
        return this.ingredientes.listarIngredientes();
    }
}