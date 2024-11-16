package pizzaria.model;

import java.util.ArrayList;

public class GarconRep {
    private ArrayList<Garcon> garcons;
    private static GarconRep garconRep;

    private GarconRep(){
        this.garcons = new ArrayList<>();
    }

    public static GarconRep getInstance(){
        if(garconRep == null)
            garconRep = new GarconRep();
        return garconRep;
    }

    public void adicionarGarcon (Garcon garcon){
        boolean rem = false;
        
        for (Garcon c : garcons){
            if(c.getId() == garcon.getId()){
                garcons.remove(c);
                rem = true;
                break;
            }
        }
        garcons.add(garcon);
        
        if (rem == true){
            System.out.println("Funcionário Garçon atualizado");
        }
        else{
            System.out.println("Funcionário Garçon adicionado");
        }
    }
    
    public void removerGarcon (int id){
        boolean rem = false;
        for (Garcon c : garcons){
            if(c.getId() == id){
                garcons.remove(c);
                System.out.println("Funcionário Garçon removido");
                rem = true;
                break;
            }
        }

        if (rem == false){
            System.out.println("Funcionário Garçon não encontrado");
        }
    }
    
    public Garcon buscarGarcon(int id){
        for (Garcon c : garcons){
            if (c.getId() == id){
                return c;
            } 
        }
        return null;
    }
}
