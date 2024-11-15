package pizzaria.model;

import java.util.ArrayList;

public class IngredienteRep {
    private ArrayList<Ingrediente> ingredientes = new ArrayList<>();

    public void adicionarIngrediente(Ingrediente ingrediente){
        this.ingredientes.add(ingrediente);
    }

    public void removerIngrediente(int id){
        for (Ingrediente i : ingredientes){
            if (i.getID() == id){
                ingredientes.remove(i);
                break;
            } 
        }
    }

    public ArrayList<Ingrediente> listarIngredientes(){
        return this.ingredientes;
    }

    public Ingrediente buscarIngrediente(int id){
        for (Ingrediente i : ingredientes){
            if (i.getID() == id){
                return i;
            } 
        }
        return null;
    }
}
