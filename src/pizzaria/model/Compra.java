package pizzaria.model;

import java.util.HashMap;

public class Compra {

    private int id;
    private String data;
    private float valorTotal;
    private HashMap<Produto, Integer> listaSimples;
    private HashMap<Ingrediente, Integer> listaIngredientes;
    private Fornecedor fornecedor;
    private Funcionario gerente;


    Compra(int id, String data, Fornecedor fornecedor, Funcionario gerente){
        this.id = id;
        this.data = data;
        this.listaSimples = new HashMap<>();
        this.listaIngredientes = new HashMap<>();
        this.fornecedor = fornecedor;
        this.gerente = gerente;
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

    public void adicionarEmCompraIngrediente(Ingrediente ingrediente, int quant){ // isso vai tá em controller ne TA AQUI PRO TESTE
        this.listaIngredientes.put(ingrediente, quant);
    }

    public void adicionarEmCompraSimples(Produto simples, int quant){ // isso vai tá em controller ne TA AQUI PRO TESTE
        this.listaSimples.put(simples, quant);
    }

    public int getID(){
        return this.id;
    }
    }
