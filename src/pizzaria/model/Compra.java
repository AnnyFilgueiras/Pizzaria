
package pizzaria.model;
import java.util.ArrayList;
import java.util.Date;

public class Compra {

    private int id;
    private Date data;
    private float valorTotal;
    private ArrayList<Simples> simples;
    private ArrayList<Ingrediente> ingredientes;

    Compra(int id, Date data){

        this.id = id;
        this.data = data;
        this.simples = new ArrayList<Simples>();
        this.ingredientes = new ArrayList<Ingrediente>();

    }

    public float calcularValorTotal(int quant){

        // Falta implementar

        return 0;

    }
}
