
package pizzaria.model;

import java.util.HashMap;

public class Pedido{
    
    private int id;
    private static int contador = 0;
    private float valorTotal;
    protected HashMap<Produto, Integer> produtos;
    private Cliente cliente;
    private Funcionario garcon;

    public Pedido(Cliente cliente, Funcionario garcon){
        this.id = ++contador;
        this.valorTotal = 0;
        this.produtos = new HashMap<Produto, Integer>();
        this.cliente = cliente;
        this.garcon = garcon;
    }

    public float calcularValorTotal(){
        for(Produto p : this.produtos.keySet()){
            int quant = this.produtos.get(p);
            this.valorTotal += p.getPrecoVenda() * quant;
        }
        return this.valorTotal;
        }

    public HashMap<Produto, Integer> getProdutos() {
        return this.produtos;
    }
    
    public void adicionarEmProdutos (Produto p, int quant){ // isso vai tá em controller ne TA AQUI PRO TESTE
        this.produtos.put(p, quant);
    }

    public int getId(){
        return this.id;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
}
