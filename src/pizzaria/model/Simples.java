package pizzaria.model;

import java.util.Date;

public class Simples {
    private float precoCompra;
    private Date dataValidade;
    private int quantEstoque;

    public Simples(float precoCompra, Date dataValidade, int quantEstoque) {
        this.precoCompra = precoCompra;
        this.dataValidade = dataValidade;
        this.quantEstoque = quantEstoque;
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