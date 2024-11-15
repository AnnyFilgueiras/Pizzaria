package pizzaria.model;

public class Ingrediente {

    private int id;
    private String nome;
    private float precoCompra;
    private String dataValidade;
    private  int quantEstoque;

    Ingrediente(int id, String nome, float precoCompra, String dataValidade){
        this.id = id;
        this.precoCompra = precoCompra;
        this.dataValidade = dataValidade;
        this.quantEstoque = 0;
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
