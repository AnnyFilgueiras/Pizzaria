
package pizzaria.model;

import java.util.HashMap;
import java.util.ArrayList;

public class Pedido{
    
    private boolean pagou = false;
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

    public HashMap<String, Integer> mostrarHashMap(){
        HashMap<String, Integer> novoH = new HashMap<String, Integer>();

        for(Produto p : this.getProdutos().keySet()){
            novoH.put(p.getNome(), this.getProdutos().get(p));
        }

        return novoH;
    }
    
    public int getId(){
        return this.id;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    public Funcionario getGarcon(){
        return this.garcon;
    }

    @Override
    public String toString(){

        ArrayList<String> nomes = new ArrayList<>();

        for (Produto p : this.produtos.keySet()){
            String nome = p.getNome();
            nomes.add(nome);
        }
        String valor = "Pedido: " + this.id + "\n" +  "Cliente: " + this.cliente.getNome() + "\n" + "Garcon: " + this.garcon.getNome() + "\n" + "Valor: " + this.calcularValorTotal() + "\n" + "Produtos: " + this.mostrarHashMap();
        
        return valor;
    }

    public boolean getPagou(){
        return this.pagou;
    }

    public void setPagou(){
        this.pagou = true;
    }
}
