package pizzaria.model;

public class Produto {

    private int id;
    private String nome;
    protected float precoVenda;

    Produto(int id, String nome){ //tirar do construtor e fazer o calculo do simples e composto
        this.id = id;
        this.nome = nome;
        this.precoVenda = 0;
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
}