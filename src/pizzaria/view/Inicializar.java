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
        
        simples = new Simples("Coca-cola 1L",100, 3);
        controllerGeral.adicionarOuAtualizarProduto(simples, "simples");
        
        simples = new Simples("Guaraná 1L",101, 3);
        controllerGeral.adicionarOuAtualizarProduto(simples, "simples");
        
        simples = new Simples("Coca-cola Lata",102, (float) 1.5);
        controllerGeral.adicionarOuAtualizarProduto(simples, "simples");
        
        simples = new Simples("Guaraná Lata",103, (float) 1.5);
        controllerGeral.adicionarOuAtualizarProduto(simples, "simples");

    }
    
    private void inicializarCompostos(){
        Ingrediente ingrediente;
        
        ingrediente = new Ingrediente(200, "Água", 0);
        controllerGeral.adicionarOuAtualizarIngrediente(ingrediente);
        
        ingrediente = new Ingrediente(201, "Laranja", (float) 2.5);
        controllerGeral.adicionarOuAtualizarIngrediente(ingrediente);
        
        ingrediente = new Ingrediente(202, "Massa da pizza", 8);
        controllerGeral.adicionarOuAtualizarIngrediente(ingrediente);
        
        ingrediente = new Ingrediente(203, "Molho de tomate", 4);
        controllerGeral.adicionarOuAtualizarIngrediente(ingrediente);
        
        ingrediente = new Ingrediente(204, "Mussarela", 5);
        controllerGeral.adicionarOuAtualizarIngrediente(ingrediente);
        
        ingrediente = new Ingrediente(205, "Orégano", (float) 0.5);
        controllerGeral.adicionarOuAtualizarIngrediente(ingrediente);
        
        Composto composto;
        
        composto = new Composto(1, "Suco de Laranja");
        controllerGeral.adicionarOuAtualizarProduto(composto, "composto");

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
        
        caixa = new Caixa("Luiz Ferreira", 1200, 11);
        controllerGeral.adicionarOuAtualizarFuncionario(caixa, "caixa");
    }
    
    private void inicializarCozinheiros(){
        Cozinheiro cozinheiro;
        
        cozinheiro = new Cozinheiro("Letícia Azevedo", 1350, 5);
        controllerGeral.adicionarOuAtualizarFuncionario(cozinheiro, "cozinheiro");
        
        cozinheiro = new Cozinheiro("Gustavo Martins", 1300, 5);
        controllerGeral.adicionarOuAtualizarFuncionario(cozinheiro, "cozinheiro");
    }
    
    private void inicizalizarGarçons(){
        Garcon garcon;
        
        garcon = new Garcon("Carolina Santos", 15, 1250);
        controllerGeral.adicionarOuAtualizarFuncionario(garcon, "garcon");
        
        garcon = new Garcon("Marcos Rocha", 15, 1250);
        controllerGeral.adicionarOuAtualizarFuncionario(garcon, "garcon");
    }
    
    private void inicializarGerentes(){
        Gerente gerente;
        
        gerente = new Gerente("Matilde Souza", 1, 1500);
        controllerGeral.adicionarOuAtualizarFuncionario(gerente, "gerente");
        
        gerente = new Gerente("Douglas Dias", 1, 1500);
        controllerGeral.adicionarOuAtualizarFuncionario(gerente, "gerente");
    }
    
    private void inicializarClientes(){
        Cliente cliente;
        
        cliente = new Cliente("João Araujo", "12345678900");
        controllerGeral.adicionarOuAtualizarCliente(cliente);
        
        cliente = new Cliente("Igor Cunha", "12345678900");
        controllerGeral.adicionarOuAtualizarCliente(cliente);
    }
    
    private void inicializarFornecedores(){
        Fornecedor fornecedor;
        
        fornecedor = new Fornecedor("Massa Pronta Distribuidora","8764527123");
        controllerGeral.adicionarOuAtualizarFornecedor(fornecedor);
        
        fornecedor = new Fornecedor("Distribuidora Viva Sabor","8764527123");
        controllerGeral.adicionarOuAtualizarFornecedor(fornecedor);
    }
    
    public static void limparTela() {
        String sistema = System.getProperty("os.name").toLowerCase();
        try {
            // Verifica se o sistema é Windows
            if (sistema.contains("win")) {
                // Para Windows
                ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
                pb.inheritIO().start().waitFor();
            } 
            // Verifica se o sistema é Unix-like (Linux, Mac)
            else if (sistema.contains("nix") || sistema.contains("nux") || sistema.contains("mac")) {
                // Para Linux/Mac
                ProcessBuilder pb = new ProcessBuilder("clear");
                pb.inheritIO().start().waitFor();
            } else {
                System.out.println("Sistema não suportado para limpar a tela.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
