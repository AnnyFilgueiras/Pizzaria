package pizzaria.model;


public class Pagamento{
    private String metodo;
    private String data;
    private Pedido pedido;
    private Caixa caixa;
    private float valor;

    public Pagamento(String metodo, String data, Pedido pedido, Caixa caixa){
        this.metodo = metodo;
        this.data = data;
        this.pedido = pedido;
        this.caixa = caixa;
        this.valor = pedido.calcularValorTotal();
    }  
    public int getId(){
        return this.getId();
    }

    public float getValor() {
        return valor;
    }

    public Pedido getPedido() {
        return pedido;
    }
}