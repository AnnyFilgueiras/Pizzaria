package pizzaria.model;

import java.util.HashMap;

public class Compra {

    private static int cont = 0;
    private int id;
    private String data;
    private float valorTotal;
    private HashMap<Produto, Integer> listaSimples;
    private HashMap<Ingrediente, Integer> listaIngredientes;
    private Fornecedor fornecedor;

    public Compra(String data, Fornecedor fornecedor){
        this.id = ++cont;
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

    /* 
    public HashMap<String, Integer> mostrarHashMap(){
        HashMap<String, Integer> novoH = new HashMap<String, Integer>();

        for(Produto p : this.getProdutos().keySet()){
            novoH.put(p.getNome(), this.getProdutos().get(p));
        }

        return novoH;
    }
    */

    public HashMap<String, Integer> mostrarHashMapSimples(){
        HashMap<String, Integer> novoH = new HashMap<String, Integer>();

        for (Produto s : this.getListaSimples().keySet()){
            novoH.put(s.getNome(), this.getListaSimples().get(s));
        }

        return novoH;
    }

    public HashMap<String, Integer> mostrarHashMapIngrediente(){
        HashMap<String, Integer> novoH = new HashMap<String, Integer>();

        for (Ingrediente s : this.getListaIngredientes().keySet()){
            novoH.put(s.getNome(), this.getListaIngredientes().get(s));
        }

        return novoH;
    }
    public String getData(){
        return this.data;
    }

    public Fornecedor getFornecedor(){
        return this.fornecedor;
    }

    @Override
    public String toString(){
        String valor = "ID: " + this.id + "\n" + "Data: " + this.data + "\n" + this.fornecedor + "\n" +"Lista de Produtos: " + this.mostrarHashMapSimples() + "\n" + "Lista de Ingredientes: " + this.mostrarHashMapIngrediente(); 
        return valor;
    }
}
