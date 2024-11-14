package pizzaria.model;
import java.util.Date;

public class Ingrediente {

    private int id;
    private String nome;
    private float precoCompra;
    private String dataValidade;
    private  int quantEstoque;

    Ingrediente(int id, String nome, float precoCompra, String dataValidade, int quantEstoque){
        this.id = id;
        this.precoCompra = precoCompra;
        this.dataValidade = dataValidade;
        this.quantEstoque = quantEstoque;
    }


    public void setQuantEstoque(int quantEstoque){
        this.quantEstoque = quantEstoque;
    }


    public int getEstoque(int id){
        return this.quantEstoque;
    }


    public float getPrecoCompra(){
        return this.precoCompra;
    }
}
