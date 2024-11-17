package pizzaria.view;

import pizzaria.controller.IControllerGeral;
import pizzaria.model.*;

import java.util.Scanner;
import java.util.ArrayList;
//tem atualização de quant HE e das extras de garçon e caixa?
public class ExibirTelas{

    private IControllerGeral controller;

    private Scanner input = new Scanner(System.in);

    public ExibirTelas(IControllerGeral controller) {
        this.controller = controller;
    }
    
    public void menuPrincipal() {
        int opcao;
        do {
            System.out.println("===== Menu Principal =====");
            System.out.println("1. Cadastros");
            System.out.println("2. Estoque");
            System.out.println("3. Pedidos");
            System.out.println("4. Compras");
            System.out.println("5. Listar");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1 -> telaCadastros(); 
                case 2 -> telaEstoque();
                case 3 -> telaPedidos(); 
                case 4 -> telaCompras();
                case 5 -> telaListar();
                case 0 -> System.out.println("Saindo do sistema...");
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
    }
    public void telaCompras() {
        int opcao;
        do {
            System.out.println("===== Tela de Compras =====");
            System.out.println("1. Fazer compra");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1 -> System.out.println("Fazendo compra (em desenvolvimento)");
                case 0 -> System.out.println("Voltando ao Menu Principal...");
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
    }

    public void telaEstoque() {
        System.out.println("===== Tela de Estoque =====");
        System.out.println("Lista de Produtos no Estoque:");
        //listarProdutos(); // Simula a exibição de produtos no estoque.
        System.out.println("===========================================");
        System.out.println("Lista de Ingredientes no Estoque:");
        //listarIngredientes(); // Simula a exibição de ingredientes no estoque.
        System.out.println("Pressione qualquer tecla para voltar ao Menu Principal...");
        input.nextLine(); // Aguarda o usuário pressionar Enter para voltar.
    }
    
    public void telaListar() {
        int opcao;
        do {
            System.out.println("===== Tela de Listagem =====");
            System.out.println("1. Listar fornecedores");
            System.out.println("2. Listar pedidos feitos");
            System.out.println("3. Listar compras feitas");
            System.out.println("4. Listar funcionários");
            System.out.println("5. Listar clientes");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1 -> System.out.println("implementar");
                case 2 -> {
                    
                }
                case 3 -> System.out.println("implementar");
                case 4 -> System.out.println("implementar");
                case 5 -> System.out.println("implementar");
                case 0 -> System.out.println("Voltando ao Menu Principal...");
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
    }
    public void telaCadastros() {
        int opcao;
        do {
            System.out.println("===== Tela de Cadastros =====");
            System.out.println("1. Fornecedores");
            System.out.println("2. Menu");
            System.out.println("3. Funcionários");
            System.out.println("4. Clientes");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1 -> telaFornecedores();
                case 2 -> telaMenu();
                case 3 -> telaFuncionarios();
                case 4 -> telaClientes();
                case 0 -> System.out.println("Voltando ao Menu Principal...");
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
    }

    public void telaClientes() {
        int opcao;
        do {
            System.out.println("===== Tela de Clientes =====");
            System.out.println("1. Adicionar/Atualizar cliente");
            System.out.println("2. Remover cliente");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1 -> System.out.println("Adicionando/Atualizando cliente (em desenvolvimento)"); // aqui é onde chama os métodos
                case 2 -> System.out.println("Removendo cliente (em desenvolvimento)");
                case 0 -> System.out.println("Voltando à Tela de Cadastros...");
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
    }

    public void telaFuncionarios() {
        int opcao;
        do {
            System.out.println("===== Tela de Funcionários =====");
            System.out.println("1. Adicionar/Atualizar funcionário");
            System.out.println("2. Remover funcionário");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1 -> System.out.println("Adicionando/Atualizando funcionário (em desenvolvimento)");
                case 2 -> System.out.println("Removendo funcionário (em desenvolvimento)");
                case 0 -> System.out.println("Voltando à Tela de Cadastros...");
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
    }

    public void telaMenu() {
        int opcao;
        do {
            System.out.println("===== Tela de Menu =====");
            System.out.println("1. Adicionar/Atualizar produto");
            System.out.println("2. Remover produto");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1 -> System.out.println("Adicionando/Atualizando produto (em desenvolvimento)");
                case 2 -> System.out.println("Removendo produto (em desenvolvimento)");
                case 0 -> System.out.println("Voltando à Tela de Cadastros...");
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
    }

    public void telaFornecedores() {
        int opcao;
        do {
            System.out.println("===== Tela de Fornecedores =====");
            System.out.println("1. Atualizar/Adicionar fornecedor");
            System.out.println("2. Remover fornecedor");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println("Qual o nome do fornecedor: ");
                    String nome = input.nextLine();
                    System.out.println("Qual o CNPJ do fornecedor: ");
                    String cnpj = input.nextLine();
                    Fornecedor fornecedor = new Fornecedor(nome, cnpj);
                    controller.adicionarOuAtualizarFornecedor(fornecedor);
                }
                case 2 -> {
                    System.out.println("Digite o CNPJ do fornecedor a ser removido: ");
                    String cnpj = input.nextLine();
                    controller.removerFornecedor(cnpj);
                }
                case 0 -> System.out.println("Voltando à Tela de Cadastros...");
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
    }

    public void telaPedidos() {
        int opcao;
        do {
            System.out.println("===== Tela de Pedidos =====");
            System.out.println("1. Adicionar/Atualizar pedido");
            System.out.println("2. Cancelar pedido");
            System.out.println("3. Remover produto do pedido");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            System.out.println("===========================");
            opcao = input.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println("Digite o ID do garçon a fazer o pedido: ");
                    int id = input.nextInt();
                    Funcionario garcon = controller.obterFuncionario(id, "garcon"); // deu type mismatch; é assim mesmo isso aq?

                    System.out.println("Digite o CPF do cliente: ");
                    String cpf = input.nextLine();
                    Cliente cliente = controller.obterCliente(cpf);

                    controller.anotarPedido(garcon, cliente);
                    System.out.println("Pedido adicionado!");
                }
                case 2 -> {
                    System.out.println("Digite o ID do pedido a ser cancelado: ");
                    int id = input.nextInt();

                    controller.cancelarPedido(id);
                    System.out.println("Pedido cancelado!");
                }
                case 3 -> {
                    System.out.println("Digite o ID do pedido: ");
                    int idPedido = input.nextInt();
                    System.out.println("Digite o ID do produto: ");
                    int idProduto = input.nextInt();
                    System.out.println("Digite a quantidade a ser removida: ");
                    int quant = input.nextInt();

                    Pedido pedido = controller.getPedidos().buscarPedido(idPedido);

                    controller.removerProduto(idProduto, pedido, quant);   
                }
                case 0 -> System.out.println("Voltando ao Menu Principal...");
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
    }

/*
   public static void main(String[] args) {

        ExibirTelas view = new ExibirTelas();
        view.menuPrincipal();
    }*/
}
