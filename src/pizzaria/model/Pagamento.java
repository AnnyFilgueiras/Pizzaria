package pizzaria.model;

import java.util.Date;

public class Pagamento{
    private String metodo;
    private Date data;
    private Pedido pedido;

    public Pagamento(String metodo, Date data, Pedido pedido){
        this.metodo = metodo;
        this.data = data;
        this.pedido = pedido;
    }    
}