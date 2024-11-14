package pizzaria.model;

public class Produto {

    private int id;
    private String nome;
    private float preco;

    Produto(int id, String nome, float preco){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public float getPreco(){
        return this.preco;
    }

}