package pizzaria.model;
import java.util.ArrayList;

public class Composto extends Produto{
    private ArrayList<Ingrediente> ingredientesUsados;

    public Composto(int id, String nome){
        super(id, nome);
        this.ingredientesUsados = new ArrayList<Ingrediente>();
    }

    public float setEcalcularPreco(){

        float precos = 0;

        for (Ingrediente p : this.ingredientesUsados){
            precos += p.getPrecoCompra();
        }

        float valorTotal = precos + (precos * (float)0.6);

        this.precoVenda = valorTotal;
        
        return valorTotal;
        
    }

    public void setPrecoVenda(float preco){
        this.precoVenda = preco;
    }

    public ArrayList<Ingrediente> getIngredientes(){
        return this.ingredientesUsados;
    }

    public void setIngredientesUsados(Ingrediente ingrediente) {
        this.ingredientesUsados.add(ingrediente);
    }
}