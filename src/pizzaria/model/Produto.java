package pizzaria.model;

public class Produto {

    private int id;
    private String nome;
    protected float precoVenda;

    public Produto(int id, String nome){ 
        this.id = id;
        this.nome = nome;
    }

    public float getPrecoVenda(){
        return this.precoVenda;
    }

    public int getId(){
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }

    @Override
    public String toString(){
        String valor = "Nome: " + this.nome + "\nID: " + this.id + "\nPreço de venda: " + this.precoVenda;

        return valor;
    }

}