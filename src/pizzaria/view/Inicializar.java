package pizzaria.view;

import pizzaria.controller.IControllerGeral;
import pizzaria.model.*;

public class Inicializar {
    private IControllerGeral controllerGeral;

    public Inicializar(IControllerGeral controllerGeral) {
        this.controllerGeral = controllerGeral;
    }
    
    public void inicializarGeral(){
        this.inicializarProdutos();
        this.inicializarFuncionarios();
        this.inicializarClientes();
        this.inicializarFornecedores();
        limparTela();
    }
    
    private void inicializarProdutos(){
        this.inicializarSimples();
        this.inicializarCompostos();
    }
    
    private void inicializarSimples(){
        
        Simples simples;
        
        simples = new Simples("Coca-cola 1L",100, (float) 4.5);
        simples.setQuantEstoque(50);
        controllerGeral.adicionarOuAtualizarProduto(simples, "simples");
        
        simples = new Simples("Guaraná 1L",101, (float) 4.5);
        simples.setQuantEstoque(50);
        controllerGeral.adicionarOuAtualizarProduto(simples, "simples");
        
        simples = new Simples("Coca-cola Lata",102, (float) 1.5);
        simples.setQuantEstoque(50);
        controllerGeral.adicionarOuAtualizarProduto(simples, "simples");
        
        simples = new Simples("Guaraná Lata",103, (float) 1.5);
        simples.setQuantEstoque(50);
        controllerGeral.adicionarOuAtualizarProduto(simples, "simples");

    }
    
    private void inicializarCompostos(){
        //System.out.println("Entrou em inicializarCompostos");
        Ingrediente ingrediente;
        
        ingrediente = new Ingrediente(200, "Água", 1);
        ingrediente.setQuantEstoque(50);
        controllerGeral.adicionarOuAtualizarIngrediente(ingrediente);
        
        ingrediente = new Ingrediente(201, "Laranja", (float) 2.5);
        ingrediente.setQuantEstoque(50);
        controllerGeral.adicionarOuAtualizarIngrediente(ingrediente);
        
        ingrediente = new Ingrediente(202, "Massa da pizza", 8);
        ingrediente.setQuantEstoque(50);
        controllerGeral.adicionarOuAtualizarIngrediente(ingrediente);
        
        ingrediente = new Ingrediente(203, "Molho de tomate", 4);
        ingrediente.setQuantEstoque(50);
        controllerGeral.adicionarOuAtualizarIngrediente(ingrediente);

        ingrediente = new Ingrediente(204, "Mussarela", 5);
        ingrediente.setQuantEstoque(50);
        controllerGeral.adicionarOuAtualizarIngrediente(ingrediente);
        
        ingrediente = new Ingrediente(205, "Orégano", (float) 0.5);
        ingrediente.setQuantEstoque(50);
        controllerGeral.adicionarOuAtualizarIngrediente(ingrediente); 
        
        Composto composto;
        
        composto = new Composto(1, "Suco de Laranja");

        controllerGeral.adicionarOuAtualizarProduto(composto, "composto"); // tem q ver isso dps, da pra fazer composto sem ingrediente

        composto = new Composto(2, "Pizza de Mussarela");
        controllerGeral.adicionarOuAtualizarProduto(composto, "composto");
    }
    
    private void inicializarFuncionarios(){
        this.inicializarCaixas();
        this.inicializarCozinheiros();
        this.inicizalizarGarçons();
        this.inicializarGerentes();
    }
    
    private void inicializarCaixas(){
        Caixa caixa;
        
        caixa = new Caixa("Luana Cavalcanti", 1200, 11);
        controllerGeral.adicionarOuAtualizarFuncionario(caixa, "caixa");
        
        caixa = new Caixa("Luiz Ferreira", 1200, 12);
        controllerGeral.adicionarOuAtualizarFuncionario(caixa, "caixa");
        
    }
    
    private void inicializarCozinheiros(){
        Cozinheiro cozinheiro;
        
        cozinheiro = new Cozinheiro("Letícia Azevedo", 1350, 5);
        controllerGeral.adicionarOuAtualizarFuncionario(cozinheiro, "cozinheiro");
        
        cozinheiro = new Cozinheiro("Gustavo Martins", 1300, 6);
        controllerGeral.adicionarOuAtualizarFuncionario(cozinheiro, "cozinheiro");
    }
    
    private void inicizalizarGarçons(){
        Garcon garcon;
        
        garcon = new Garcon("Carolina Santos", 15, 1250);
        controllerGeral.adicionarOuAtualizarFuncionario(garcon, "garcon");
        
        garcon = new Garcon("Marcos Rocha", 16, 1250);
        controllerGeral.adicionarOuAtualizarFuncionario(garcon, "garcon");
    }
    
    private void inicializarGerentes(){
        Gerente gerente;
        
        gerente = new Gerente("Matilde Souza", 1, 1500);
        controllerGeral.adicionarOuAtualizarFuncionario(gerente, "gerente");
        
        gerente = new Gerente("Douglas Dias", 2, 1500);
        controllerGeral.adicionarOuAtualizarFuncionario(gerente, "gerente");
    }
    
    private void inicializarClientes(){
        Cliente cliente;
        
        cliente = new Cliente("João Araujo", "12345678900");
        controllerGeral.adicionarOuAtualizarCliente(cliente);
        
        cliente = new Cliente("Igor Cunha", "12345678901");
        controllerGeral.adicionarOuAtualizarCliente(cliente);
    }
    
    private void inicializarFornecedores(){
        Fornecedor fornecedor;
        
        fornecedor = new Fornecedor("Massa Pronta Distribuidora","8764527123");
        controllerGeral.adicionarOuAtualizarFornecedor(fornecedor);
        
        fornecedor = new Fornecedor("Distribuidora Viva Sabor","8764527124");
        controllerGeral.adicionarOuAtualizarFornecedor(fornecedor);
    }
    public void limparTela() {
    try {
        // Identifica o sistema operacional
        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("windows")) {
            // Comando para limpar o terminal no Windows
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } else {
            // Comando para limpar o terminal em sistemas baseados em Unix (Linux, MacOS)
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
     } catch (Exception e) {
        // Em caso de falha, imprime algumas linhas em branco como alternativa
        System.out.println("Não foi possível limpar a tela.");
        for (int i = 0; i < 50; i++) System.out.println();
    }
    }
}
