package pizzaria.model;

import java.util.ArrayList;

public class IngredienteRep {
    private ArrayList<Ingrediente> ingredientes;
    private static IngredienteRep ingredienteRep;

    private IngredienteRep(){
        this.ingredientes = new ArrayList<>();
    }

    public static IngredienteRep getInstance(){
        if(ingredienteRep == null)
            ingredienteRep = new IngredienteRep();
        return ingredienteRep;
    } 

    public void adicionarIngrediente(Ingrediente ingrediente){
        boolean rem = false;
        
        for (Ingrediente i : ingredientes){
            if (i.getID() == ingrediente.getID()){
                ingredientes.remove(i);
                rem = true;
                break;
            } 
        }
        this.ingredientes.add(ingrediente);
        if (rem == true){
            System.out.println("Ingrediente atualizado");
        }
        else{
            System.out.println("Ingrediente adicionado");
        }
    }

    public void removerIngrediente(int id){
        boolean rem = false;

        for (Ingrediente i : ingredientes){
            if (i.getID() == id){
                ingredientes.remove(i);
                rem = true;
                System.out.println("Ingrediente removido!");
                return;
            } 
        }
        
        if(rem == false)
            System.out.println("Ingrediente não encontrado!");
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
