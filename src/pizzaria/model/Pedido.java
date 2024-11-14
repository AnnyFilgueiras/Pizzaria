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

        // Falta terminar, e compreender onde colocar o quantP

        for (Produto p : produtos)
            this.valorTotal += p.getPreco();

        return this.valorTotal; 


        }
    }
