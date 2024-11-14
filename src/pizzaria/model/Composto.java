package pizzaria.model;
import java.util.ArrayList;

public class Composto extends Produto{
    private ArrayList<Ingrediente> ingredientes;

    Composto(int id, String nome, float preco, ArrayList<Ingrediente> ingredientes){
        super(id, nome, preco);
        this.ingredientes = ingredientes;
    }

    public float calcularPreco(ArrayList<Ingrediente> ingredientes){

        float precos = 0;

        for (Ingrediente p : ingredientes){
            precos += p.getPrecoCompra();
        }

        float valorTotal = precos + (precos * (float)0.6);

        return valorTotal;
        
    }
}