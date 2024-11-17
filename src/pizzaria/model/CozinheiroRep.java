package pizzaria.model;

import java.util.ArrayList;

public class CozinheiroRep {
    private ArrayList<Cozinheiro> cozinheiros;
    private static CozinheiroRep cozinheiroRep;

    private CozinheiroRep(){
        this.cozinheiros = new ArrayList<>();
    }
    public static CozinheiroRep getInstance(){
        if(cozinheiroRep == null)
            cozinheiroRep = new CozinheiroRep();
        return cozinheiroRep;
    }
    
    public void adicionarCozinheiro (Cozinheiro cozinheiro){
        boolean rem = false;
        
        for (Cozinheiro c : cozinheiros){
            if(c.getId() == cozinheiro.getId()){
                cozinheiros.remove(c);
                rem = true;
                break;
            }
        }
        cozinheiros.add(cozinheiro);
        
        if (rem == true){
            System.out.println("Funcionário Cozinheiro atualizado");
        }
        else{
            System.out.println("Funcionário Cozinheiro adicionado");
        }
    }
    
    public void removerCozinheiro (int id){
        boolean rem = false;
        for (Cozinheiro c : cozinheiros){
            if(c.getId() == id){
                cozinheiros.remove(c);
                System.out.println("Funcionário Cozinheiro removido");
                rem = true;
                break;
            }
        }

        if (rem == false){
            System.out.println("Funcionário Cozinheiro não encontrado");
        }
    }
    
   public Cozinheiro buscarCozinheiro(int id){
        for (Cozinheiro c : cozinheiros){
            if (c.getId() == id){
                return c;
            } 
        }
        return null;
    }

    public ArrayList<Cozinheiro> listarCozinheiros(){
        return this.cozinheiros;
    }
}