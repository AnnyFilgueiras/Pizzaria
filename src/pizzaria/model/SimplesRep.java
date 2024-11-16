package pizzaria.model;

import java.util.ArrayList;

public class SimplesRep {
    private ArrayList<Produto> simples;
    private static SimplesRep simplesRep;

    private SimplesRep(){
        this.simples = new ArrayList<>();
    }
    
    
    public static SimplesRep getInstance(){
        if(simplesRep == null){
            simplesRep = new SimplesRep();
        }
        return simplesRep;
    }
    public void adicionarOuAtualizarSimples(Simples pSimples){
        boolean rem = false;
        for (Produto s : simples){
            if (s.getId() == pSimples.getId()){
                simples.remove(s);
                rem = true;
                break;
            } 
        }
        this.simples.add(pSimples);

        if (rem == true){
            System.out.println("Produto Simples atualizado");
        }
        else{
            System.out.println("Produto Simples adicionado");
        }
    }

    public void removerSimples(int id){
        boolean rem = false;
        for (Produto s : simples){
            if (s.getId() == id){
                simples.remove(s);
                rem = true;
                System.out.println("Produto Simples removido");
                break;
            } 
        }
        if(rem == false){
            System.out.println("Produto Simples não encontrado.");
        }
    }

    public Produto buscarSimples(int id){
         for (Produto produto : simples) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        System.out.println("Produto Simples não encontrado");
        return null;
    }

    public ArrayList<Produto> listarSimples(){
        return this.simples;
    }
}
