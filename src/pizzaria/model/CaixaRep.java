package pizzaria.model;

import java.util.ArrayList;

public class CaixaRep {
    private ArrayList<Caixa> caixas;
    private static CaixaRep caixaRep;

    private CaixaRep(){
        this.caixas = new ArrayList<>();
    }
    
    public static CaixaRep getInstance(){
        if(caixaRep == null)
            caixaRep = new CaixaRep();
        return caixaRep;
    }
    
    public void adicionarCaixa (Caixa caixa){
        boolean rem = false;
        
        for (Caixa c : caixas){
            if(c.getId() == caixa.getId()){
                caixas.remove(c);
                rem = true;
                break;
            }
        }
        caixas.add(caixa);
        
        if (rem == true){
            System.out.println("Funcionário Caixa atualizado");
        }
        else{
            System.out.println("Funcionário Caixa adicionado");
        }
    }
    
    public void removerCaixa (int id){
        boolean rem = false;
        for (Caixa c : caixas){
            if(c.getId() == id){
                caixas.remove(c);
                System.out.println("Funcionário Caixa removido");
                rem = true;
                break;
            }
        }

        if (rem == false){
            System.out.println("Funcionário Caixa não encontrado");
        }
    }
    
    public Caixa buscarCaixa(int id){
        for (Caixa c : caixas){
            if (c.getId() == id){
                return c;
            } 
        }
        return null;
    }
    
    public ArrayList<Caixa> listarCaixas(){
        return this.caixas;
    }
}