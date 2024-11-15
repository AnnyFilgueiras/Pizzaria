package pizzaria.model;

public class Simples extends Produto{
    private float precoCompra;
    private String dataValidade;
    private int quantEstoque;

    public Simples(String nome, int id, float precoCompra, String dataValidade){
        super(id, nome);
        this.precoCompra = precoCompra;
        this.dataValidade = dataValidade;
        this.quantEstoque = 0;
        this.precoVenda = (float)(precoCompra*1.5);
    }
    

    public int getQuantEstoque() {
        return quantEstoque;
    }

    public void setQuantEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }

    public float getPrecoCompra(){
        return this.precoCompra;
    }

    public void setPrecoVenda(float preco){
        this.precoVenda = preco;
    }
}