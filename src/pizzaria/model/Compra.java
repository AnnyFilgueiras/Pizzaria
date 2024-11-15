package pizzaria.model;

import java.util.ArrayList;
import java.util.HashMap;

public class Compra {

    private int id;
    private String data;
    private float valorTotal;
    private HashMap<Simples, Integer> listaSimples;
    private HashMap<Ingrediente, Integer> listaIngredientes;
    private Fornecedor fornecedor;
    private Gerente gerente;

    Compra(int id, String data, Fornecedor fornecedor, Gerente gerente){

        this.id = id;
        this.data = data;
        this.listaSimples = new HashMap<>();
        this.listaIngredientes = new HashMap<>();
        this.fornecedor = fornecedor;
        this.gerente = gerente;
    }

    public float calcularValorTotal(HashMap<Simples, Integer> listasimples, HashMap<Ingrediente, Integer> listaIngredientes){

        // Falta implementar

        return 0;

    }
}