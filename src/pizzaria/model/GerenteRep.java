package pizzaria.model;

import java.util.ArrayList;


public class GerenteRep {
    private ArrayList<Gerente> gerentes;
    private static GerenteRep gerenteRep;

    private GerenteRep(){
        this.gerentes = new ArrayList<>();
    }

    public static GerenteRep getInstance(){
        if(gerenteRep == null)
            gerenteRep = new GerenteRep();
        return gerenteRep;
    }
    
    public void adicionarGerente (Gerente gerente){
        boolean rem = false;
        
        for (Gerente c : gerentes){
            if(c.getId() == gerente.getId()){
                gerentes.remove(c);
                rem = true;
                break;
            }
        }
        gerentes.add(gerente);
        
        if (rem == true){
            System.out.println("Funcionário Gerente atualizado");
        }
        else{
            System.out.println("Funcionário Gerente adicionado");
        }
    }
    
    public void removerGerente (int id){
        boolean rem = false;
        for (Gerente c : gerentes){
            if(c.getId() == id){
                gerentes.remove(c);
                System.out.println("Funcionário Gerente removido");
                rem = true;
                break;
            }
        }

        if (rem == false){
            System.out.println("Funcionário Gerente não encontrado");
        }
    }
    
    public Gerente buscarGerente(int id){
        for (Gerente c : gerentes){
            if (c.getId() == id){
                return c;
            } 
        }
        return null;
    }
}
