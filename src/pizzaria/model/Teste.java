package pizzaria.model;

public class Teste {

    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente("Rute", "12345678900");
        Funcionario garcon1 = new Garcon("Álvaro", 1, 1300);

        Ingrediente ingrediente1 = new Ingrediente(1, "ovo", 20);
        Ingrediente ingrediente2 = new Ingrediente(2, "farinha", 22);
        
        Produto produto1 = new Composto(1, "Pizza");
        ((Composto)produto1).adicionarIngredientes(ingrediente1);
        ((Composto)produto1).adicionarIngredientes(ingrediente2);
        ((Composto)produto1).setEcalcularPreco();

        Produto produto2 = new Composto(2, "Coxinha");
        ((Composto)produto2).adicionarIngredientes(ingrediente1);
        ((Composto)produto2).adicionarIngredientes(ingrediente2);
        ((Composto)produto2).setEcalcularPreco();
    
        Produto produto3 = new Composto(3, "Petit gâteau");
        ((Composto)produto3).adicionarIngredientes(ingrediente1);
        ((Composto)produto3).adicionarIngredientes(ingrediente2);
        ((Composto)produto3).setEcalcularPreco();
        Pedido pedido1 = new Pedido(1, cliente1, garcon1);

        pedido1.adicionarEmProdutos(produto1, 2); // 134,4
        pedido1.adicionarEmProdutos(produto2, 1); // 67.2
        pedido1.adicionarEmProdutos(produto3, 4); // 268,8
        
        System.out.println(pedido1.calcularValorTotal());
        System.out.println(((Composto)produto1).setEcalcularPreco());

       /*
        Funcionario gerente1 = new Gerente("Arnaldo", 5000,1);
        Fornecedor fornecedor1 = new Fornecedor("Italac", "29292929292");
        
        Produto produto1 = new Simples("Pizza", 1, 32, "20/12/2004");
        Produto produto2 = new Simples("Refri", 2, 8, "20/12/2004");
        Produto produto3 = new Simples("Batata", 3, 10, "15/11/2024");
        
        Ingrediente ingrediente1 = new Ingrediente(1, "ovo", 20, "20/12/2004");
        Ingrediente ingrediente2 = new Ingrediente(2, "farinha", 22, "20/12/2004");

        Compra compra1 = new Compra(1, "22/09/1974", fornecedor1, gerente1);

        compra1.adicionarEmCompraIngrediente(ingrediente1, 2);
        compra1.adicionarEmCompraIngrediente(ingrediente2, 3);

        compra1.adicionarEmCompraSimples(produto1, 2);
        compra1.adicionarEmCompraSimples(produto2, 1);
        compra1.adicionarEmCompraSimples(produto3, 3);

        System.out.println(compra1.calcularValorTotal());
        */
    }
    
}
