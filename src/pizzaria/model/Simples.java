package pizzaria.model;

import java.util.Date;

public class Simples extends Produto{
    private float precoCompra;
    private String dataValidade;
    private int quantEstoque;

    public Simples(String nome, int id, float preco, float precoCompra, String dataValidade){
        super(id, nome, preco);
        this.precoCompra = precoCompra;
        this.dataValidade = dataValidade;
        this.quantEstoque = 0;
    }
    
    public float calcularPreco (float precoCompra){
        float precoVenda;
        
        precoVenda = (float) (precoCompra+precoCompra*0.5);
        
        return precoVenda;
    }

    public int getQuantEstoque() {
        return quantEstoque;
    }

    public void setQuantEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }
}