package pizzaria.model;

public class Simples extends Produto{
    private float precoCompra;
    private int quantEstoque;

    public Simples(String nome, int id, float precoCompra){
        super(id, nome);
        this.precoCompra = precoCompra;
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
    @Override
    public String toString(){
        String valor = "Nome: " + this.getNome() + "\nID: " + this.getId() + "\nPreço de venda: " + this.precoVenda + "\nQuantidade em estoque: " + this.quantEstoque;
        return valor;
    }
/*
    public void getPrecoVenda(float preco){
        this.precoVenda = preco;
    }*/
}