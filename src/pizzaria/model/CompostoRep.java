package pizzaria.model;

import java.util.ArrayList;

public class CompostoRep {
    private ArrayList<Produto> compostos;
    private static CompostoRep compostoRep;

    private CompostoRep(){
        this.compostos = new ArrayList<>();
    }

    public static CompostoRep getInstance(){
        if(compostoRep == null)
            compostoRep = new CompostoRep();
        return compostoRep;
    }

    public void adicionarComposto(Composto composto){
        boolean rem = false;
        
        for (Produto c : compostos){
            if (c.getId() == composto.getId()){
                compostos.remove(c);
                rem = true;
                break;
            } 
        }
        this.compostos.add(composto);

        if (rem == true){
            System.out.println("Produto Composto atualizado");
        }
        else{
            System.out.println("Produto Composto adicionado");
        }
    }

    public void removerComposto(int id){
        boolean rem = false;
        
        for (Produto c : compostos){
            if (c.getId() == id){
                compostos.remove(c);
                System.out.println("Produto Composto removido");
                rem = true;
                break;
            } 
        }

        if (rem == false){
            System.out.println("Produto Composto não encontrado");
        }
    }

    public ArrayList<Produto> listarComposto(){
        return this.compostos;
    }

    public Produto buscarComposto(int id){
        for (Produto c : compostos){
            if (c.getId() == id){
                System.out.println("Produto Composto encontrado");
                return c;
            }
        }
        System.out.println("Produto Composto não encontrado");
        return null;
    }
}

