package pizzaria.model;

import java.util.HashMap;

public class Compra {

    private int id;
    private String data;
    private float valorTotal;
    private HashMap<Produto, Integer> listaSimples;
    private HashMap<Ingrediente, Integer> listaIngredientes;
    private Fornecedor fornecedor;

    public Compra(int id, String data, Fornecedor fornecedor){
        this.id = id;
        this.data = data;
        this.listaSimples = new HashMap<>();
        this.listaIngredientes = new HashMap<>();
        this.fornecedor = fornecedor;
    }

    public float calcularValorTotal(){
        
        for(Produto p : this.listaSimples.keySet()){
            int quant = this.listaSimples.get(p);
            this.valorTotal += ((Simples)p).getPrecoCompra() * quant;
        }

        for(Ingrediente p : this.listaIngredientes.keySet()){
            int quant = this.listaIngredientes.get(p);
            this.valorTotal += p.getPrecoCompra() * quant;
        }

        return this.valorTotal;

    }

    public int getId(){
        return this.id;
    }

    public HashMap<Produto, Integer> getListaSimples(){
        return this.listaSimples;
    }

    public HashMap<Ingrediente, Integer> getListaIngredientes(){
        return this.listaIngredientes;
    }

    public String getData(){
        return this.data;
    }

    public Fornecedor getFornecedor(){
        return this.fornecedor;
    }

}
