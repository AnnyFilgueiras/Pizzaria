package pizzaria.model;

import java.util.ArrayList;

public class CompraRep {

    private ArrayList<Compra> compras;
    private static CompraRep compraRep;

    private CompraRep(){
        this.compras = new ArrayList<>();
    }

    public static CompraRep getInstance(){
        if(compraRep == null)
            compraRep = new CompraRep();
        return compraRep;
    }

    public void adicionarCompra(Compra compra){
        boolean rem = false;

        for(Compra c : this.compras){
            if(c.getID() == compra.getID()){
                compras.remove(c);
                rem = true;
                break;
            }
        }
        compras.add(compra);
        if (rem){
            System.out.println("Compra atualizada!");
        }
        else{
            System.out.println("Compra adicionada!");
        }
    }

    public void removerCompra(int id){
        boolean rem = false;

        for (Compra c : this.compras){
            if(c.getID() == id){
                compras.remove(c);
                System.out.println("Compra removida!");
                break;
            }
        }
        if (rem == false){
            System.out.println("Compra não encontrada!");
        }
    }

    public ArrayList<Compra> listarCompras(){
        return this.compras;
    }
    
}
