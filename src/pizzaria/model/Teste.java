package pizzaria.model;

import java.util.HashMap;
import pizzaria.model.Produto;

public class Teste {

    public static void main(String[] args) {
       
        Cliente cliente1 = new Cliente("Rute", "12345678900");
        Funcionario garcon1 = new Garcon("Álvaro", 1, 1300);
        
        Produto p1 = new Simples("Pizza", 1, 35, 32, "20/12/2004");
        Produto p2 = new Simples("Refri", 2, 12, 8, "20/12/2004");
        Produto p3 = new Simples("Batata", 3, 15, 10, "15/11/2024");

        Pedido pedido1 = new Pedido(1, cliente1, garcon1);

        pedido1.adicionarEmProdutos(p1, 2);
        pedido1.adicionarEmProdutos(p2, 1);
        pedido1.adicionarEmProdutos(p3, 4);

        System.out.println(pedido1.calcularValorTotal());
    }
    
}
