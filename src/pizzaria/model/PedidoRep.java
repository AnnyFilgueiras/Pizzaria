package pizzaria.model;

import java.util.ArrayList;

public class PedidoRep {
  
 private ArrayList<Pedido> pedidos = new ArrayList<>();
    
    public void adicionarPedido (Pedido pedido){
        boolean rem = false;
        
        for (Pedido p : pedidos){
            if(p.getId() == pedido.getId()){
                pedidos.remove(p);
                rem = true;
                break;
            }
        }
        pedidos.add(pedido);
        
        if (rem == true){
            System.out.println("Pedido atualizado");
        }
        else{
            System.out.println("Pedido adicionado");
        }
    }
    
    public void removerPedido (int id){
        boolean rem = false;
        for (Pedido p : pedidos){
            if(p.getId() == id){
                pedidos.remove(p);
                System.out.println("Pedido removido");
                rem = true;
                break;
            }
        }

        if (rem == false){
            System.out.println("Pedido não encontrado");
        }
    }
    
    public  ArrayList<Pedido> listarPedidos(){
        return this.pedidos;
    }
}
