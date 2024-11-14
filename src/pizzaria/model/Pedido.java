package pizzaria.model;
import java.util.ArrayList;

public class Pedido{
    
    private int id;
    private float valorTotal;
    private ArrayList<Produto> produtos;

    Pedido(int id){
        this.id = id;
        this.valorTotal = 0;
        this.produtos = new ArrayList<Produto>();
    }

    public float calcularValorTotal(int quantP, Produto produto){
        return 0;
    }
} 