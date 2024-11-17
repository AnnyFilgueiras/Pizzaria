package pizzaria.view;

import pizzaria.controller.*;

public class Main {

    public static void main(String[] args) {
        IControllerCliente clienteC = new ControleCliente();
        IControllerCompra compraC = new ControleCompra();
        IControllerFornecedor fornecedorC = new ControleFornecedor();
        IControllerCaixa caixaC = new ControleCaixa();
        IControllerCozinheiro cozinheiroC = new ControleCozinheiro(); 
        IControllerGarcon garconC = new ControleGarcon(); 
        IControllerGerente gerenteC = new ControleGerente();
        IControllerIngrediente ingredienteC = new ControleIngrediente();
        IControllerPedido pedidoC = new ControlePedido();          
        IControllerSimples simplesC = new ControleSimples();
        IControllerComposto compostoC = new ControleComposto();
        IControllerGeral controller = new ControllerGeral(clienteC, compraC, fornecedorC, caixaC, cozinheiroC, garconC, gerenteC, ingredienteC, pedidoC, simplesC, compostoC);
      
        Inicializar iniciar = new Inicializar(controller);
        iniciar.inicializarGeral();
        
        ExibirTelas exibir = new ExibirTelas(controller);
        exibir.menuPrincipal();
    }
}