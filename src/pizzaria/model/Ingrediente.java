package pizzaria.model;

public class Ingrediente {

    private int id;
    private String nome;
    private float precoCompra;
    private  int quantEstoque;

    public Ingrediente(int id, String nome, float precoCompra){
        this.id = id;
        this.nome = nome;
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

    @Override
    public String toString(){
        String valor = "Nome: " + this.getNome() + "\nID: " + this.getID() + "\nPreço de compra: " + this.precoCompra + "\nQuantidade em estoque: " + this.quantEstoque;
        return valor;
    }
}