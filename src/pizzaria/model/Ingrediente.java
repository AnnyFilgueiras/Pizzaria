package pizzaria.model;

public class Ingrediente {

    private int id;
    private String nome;
    private float precoCompra;
    private  int quantEstoque;

    public Ingrediente(int id, String nome, float precoCompra){
        this.id = id;
        this.precoCompra = precoCompra;
        this.quantEstoque = 0;
    }


    public void setQuantEstoque(int quantEstoque){
        this.quantEstoque = quantEstoque;
    }


    public int getEstoque(){
        return this.quantEstoque;
    }


    public float getPrecoCompra(){
        return this.precoCompra;
    }

    public int getID(){
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }
}