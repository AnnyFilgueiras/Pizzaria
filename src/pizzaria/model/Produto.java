package pizzaria.model;

public class Produto {

    private int id;
    private String nome;
    private float preco;

    Produto(int id, String nome, float preco){ //tirar do construtor e fazer o calculo do simples e composto
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public float getPreco(){
        return this.preco;
    }

    public int getId(){
        return this.id;
    }
}