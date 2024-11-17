package pizzaria.view;

import java.util.Scanner;
import pizzaria.controller.IControllerGeral;
import pizzaria.model.*;

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
            System.out.println("2. Pedidos");
            System.out.println("3. Compras");
            System.out.println("4. Listar");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1 -> {
                    limparTela();
                    telaCadastros();
                }

                case 2 -> {
                    limparTela();
                    telaPedidos(); }
                case 3 -> {
                    limparTela();
                    telaCompras();}
                case 4 -> {
                    limparTela();
                    telaListar();}
                case 0 -> System.out.println("Saindo do sistema...");
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
        limparTela();
    }

    public void limparTela() {
    try {

        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("windows")) {
            
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } else {
            
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
     } catch (Exception e) {
       
        System.out.println("Não foi possível limpar a tela.");
        for (int i = 0; i < 50; i++) System.out.println();
    }
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
                case 1 -> {
                    limparTela();
                    this.controller.fazerCompra();}
                case 0 -> limparTela();
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
        limparTela();
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
            System.out.println("6. Listar menu");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1 ->{
                    limparTela();

                    System.out.println("==== Fornecedores ====");
                    System.out.println("");
                    for (Fornecedor f : controller.obterFornecedores()) {
                        System.out.println(f);
                        System.out.println("");
                    }
                }
                case 2 -> {
                    limparTela();
                    System.out.println("==== Pedidos ====");

                    for(Pedido p : controller.obterPedidos()){
                        System.out.println(p);
                        System.out.println("");
                    }
                }
                case 3 -> {
                    limparTela();
                    System.out.println("==== Compras ====");
                    System.out.println("");
                    for (Compra c : controller.listarCompras()){
                        System.out.println(c);
                        System.out.println("");
                    }
                }
                case 4 -> {
                    limparTela();
                    System.out.println("==== Funcionários ====");
                    System.out.println("");
                    for (Caixa c : controller.listarCaixas()){
                        System.out.println(c);
                        System.out.println("");
                    }
                
                    for(Cozinheiro c : controller.listarCozinheiros()){
                        System.out.println(c);
                        System.out.println("");
                    }
                    
                    for (Garcon g : controller.listarGarcons()){
                        System.out.println(g);
                        System.out.println("");
                    }

                    for (Gerente g : controller.listarGerentes()){
                        System.out.println(g);
                        System.out.println("");
                    }
                    
                }
                case 5 -> {
                    limparTela();
                    System.out.println("==== Clientes ====");
                    System.out.println("");
                    for(Cliente c : controller.listarClientes()){
                        System.out.println(c);
                        System.out.println("");
                    }
                }
                case 6 -> {
                    limparTela();
                    int op=1;
                    
                    do { 
                        
                        System.out.println("Digite 1 para listar simples, 2 para compostos, 3 para ingredientes e 0 para sair");
                        op = input.nextInt();
                       
                        if(op==1){
                            limparTela();
                            System.out.println("==== Simples ==== ");
                            for (Produto s : controller.listarSimples()) {
                                System.out.println(s);
                                System.out.println("");
                            }
                        }
                        else if(op == 2){
                            limparTela();
                            System.out.println("==== Composto ==== ");
                            for (Produto c : controller.listarComposto()) {
                                System.out.println(c);
                                System.out.println("");
                            }
                        }
                        else if(op == 3){
                            limparTela();
                            System.out.println("==== Ingredientes ====");
                            for (Ingrediente i : controller.obterIngredientes()) {
                                System.out.println(i);
                                System.out.println("");
                            } 
                        }
                        else if(op==0){
                            limparTela();
                            continue;
                        }
                        else{
                            System.out.println("Opção inválida. Tente novamente\n");
                        }

                    } while (op!=0);
                    
                    
                }
                case 0 -> limparTela();
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
                case 1 -> {
                    limparTela();
                    telaFornecedores();
                }
                case 2 -> {
                    limparTela();
                    telaMenu();}
                case 3 -> {
                    limparTela();
                    telaFuncionarios();}
                case 4 -> {
                    limparTela();
                    telaClientes();}
                case 0 -> limparTela();
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
                case 1 -> {
                    limparTela();
                    System.out.println("Digite o nome do cliente: ");
                    input.nextLine();
                    String nomeCliente = input.nextLine();
                    System.out.println("Digite o CPF do cliente: ");
                    String cpfCliente = input.nextLine();

                    Cliente cliente = new Cliente(nomeCliente, cpfCliente);
                    controller.adicionarOuAtualizarCliente(cliente);
                }
                case 2 -> {
                    limparTela();
                    System.out.println("Digite o CPF do cliente a ser removido: ");
                    String cpfCliente = input.nextLine();
                    controller.removerCliente(cpfCliente);
                }
                case 0 -> limparTela();
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
                case 1 -> {
                    limparTela();
                    System.out.println("Digite o nome do funcionário: ");
                    input.nextLine();
                    String nome = input.nextLine();

                    System.out.println("Digite o ID do funcionário: ");
                    int id = input.nextInt();

                    System.out.println("Digite o salário base do funcionário: ");
                    float salario = input.nextFloat();

                    System.out.println("Digite 1 para cadastrar Caixa, 2 para Cozinheiro, 3 para Garçon e 4 para Gerente");
                    opcao = input.nextInt();

                    String tipo;
                    boolean valido = true;
                    switch(opcao){
                        case 1 -> tipo = "caixa";
                        case 2 -> tipo = "cozinheiro";
                        case 3 -> tipo = "garcon";
                        case 4 -> tipo = "gerente";
                        default -> {
                            System.out.println("Opção inválida! Tente novamente.");
                            valido = false;
                            tipo = "";
                        }
                    }
                    if(valido == true){
                        switch (opcao) {
                            case 1 -> {
                                Caixa caixa = new Caixa(nome, salario, id);
                                controller.adicionarOuAtualizarFuncionario(caixa, tipo);
                            }
                            case 2 -> {
                                Cozinheiro cozinheiro = new Cozinheiro(nome, salario, id);
                                controller.adicionarOuAtualizarFuncionario(cozinheiro, tipo);
                            }
                            case 3 -> {
                                Garcon garcon = new Garcon(nome, id, salario);
                                controller.adicionarOuAtualizarFuncionario(garcon, tipo);
                            }
                            default -> {
                                Gerente gerente = new Gerente (nome, id, salario);
                                controller.adicionarOuAtualizarFuncionario(gerente, tipo);
                            }
                        }
                    }                   
                }
                  case 2 ->{
                    limparTela();
                    boolean valido = true;

                    System.out.println("Insira o ID do funcionário: ");
                    int id = input.nextInt();

                    System.out.println("Digite 1 para remover Caixa, 2 para Cozinheiro, 3 para Garçon e 4 para Gerente");
                    opcao = input.nextInt();
                    
                    String tipo;

                    switch(opcao){
                        case 1 -> tipo = "caixa";
                        case 2 -> tipo = "cozinheiro";
                        case 3 -> tipo = "garcon";
                        case 4 -> tipo = "gerente";
                        default -> {
                            System.out.println("Opção inválida! Tente novamente.");
                            valido = false;
                            tipo = "";
                        }
                    }
                    if(valido == true){
                        controller.removerFuncionario(id, tipo);
                    }

                }
                case 0 -> limparTela();
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
        limparTela();
    }

    public void telaMenu() { 
        int opcao;
        do {
            System.out.println("===== Tela de Menu =====");
            System.out.println("1. Adicionar/Atualizar produto");
            System.out.println("2. Remover produto");
            System.out.println("3. Adicionar/Atualizar ingrediente");
            System.out.println("4. Remover ingrediente.");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1 -> {
                    limparTela();
                    Produto produto;
                    boolean tipoValido = true;

                    System.out.println("Insira o tipo do produto. Digite 1 para simples e 2 para composto: ");
                    int opc = input.nextInt();
                    
                    System.out.println("Insira o nome do produto: ");
                    input.nextLine();
                    String nomeProduto = input.nextLine();

                    System.out.println("Insira o ID do produto: ");
                    int idProduto = input.nextInt();
                    

                    String tipo;
                    switch(opc){
                        case 1 -> tipo = "simples";
                        case 2 -> tipo = "composto";
                        default ->{
                            System.out.println("Opção inválida! Tente novamente.");
                            tipoValido = false;
                            tipo = "";
                        }
                    }
                    if(tipoValido == true){
                        if(tipo.equals("simples")){
                            
                            System.out.println("Defina o preço de compra do produto simples: ");
                            float precoCompra = input.nextFloat();
                            
                            Simples simples = new Simples(nomeProduto, idProduto, precoCompra);
                            controller.adicionarOuAtualizarProduto(simples, tipo);
                        }
                        else{
                            Composto composto = new Composto(idProduto, nomeProduto);
                            controller.adicionarOuAtualizarProduto(composto, tipo);
                        }
                    }
                }
                case 2 -> {
                    limparTela();
                    boolean tipoValido = true;


                      System.out.println("Insira o ID do produto.");
                    int idProduto = input.nextInt();

                    System.out.println("Insira o tipo do produto. Digite 1 para simples e 2 para composto.");
                    int opc = input.nextInt();

                    String tipo;
                    switch(opc){
                        case 1 -> tipo = "simples";
                        case 2 -> tipo = "composto";
                        default ->{
                            System.out.println("Opção inválida! Tente novamente.");
                            tipoValido = false;
                            tipo = "";
                        }
                    }
                    
                    if(tipoValido == true){
                    controller.removerProduto(idProduto, tipo);
                    }
                }
                case 3 ->{
                    limparTela();

                    System.out.println("Insira o nome do ingrediente: ");
                    input.nextLine();
                    String nomeIngrediente = input.nextLine();

                    System.out.println("Insira o ID do ingrediente: ");
                    int idIngrediente = input.nextInt();

                    System.out.println("Insira o preço de compra do ingrediente.");
                    float precoCompra = input.nextFloat();
                    
                    Ingrediente ingrediente = new Ingrediente(idIngrediente, nomeIngrediente, precoCompra);
                    controller.adicionarOuAtualizarIngrediente(ingrediente);
            
                }
                case 4 ->{
                    limparTela();


                    System.out.println("Insira o ID do ingrediente.");
                    int idIngrediente = input.nextInt();
                    
                    controller.removerIngrediente(idIngrediente);

                
                }
                case 0 -> limparTela();
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
        limparTela();
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
                    limparTela();
                    System.out.println("Qual o nome do fornecedor: ");
                    input.nextLine();
                    String nome = input.nextLine();
                    System.out.println("Qual o CNPJ do fornecedor: ");
                    String cnpj = input.nextLine();
                    Fornecedor fornecedor = new Fornecedor(nome, cnpj);
                    controller.adicionarOuAtualizarFornecedor(fornecedor);
                }
                case 2 -> {
                    limparTela();
                    System.out.println("Digite o CNPJ do fornecedor a ser removido: ");
                    input.nextLine();
                    String cnpj = input.nextLine();
                    controller.removerFornecedor(cnpj);
                }
                case 0 -> limparTela();
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
        limparTela();
    }

    public void telaPedidos() {
        int opcao;
        do {
            System.out.println("===== Tela de Pedidos =====");
            System.out.println("1. Adicionar pedido");
            System.out.println("2. Cancelar pedido");
            System.out.println("3. Remover produto do pedido");
            System.out.println("4. Realizar pagamento do pedido");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1 -> {
                    limparTela();
                    while (true){
                        System.out.println("Digite o ID do garçon a fazer o pedido: ");
                        int id = input.nextInt();
                        
                        if(controller.obterFuncionario(id, "garcon") == null){
                            System.out.println("Seu ID não permite anotar pedido, tente novamente");
                            continue;
                        }
                        
                        Funcionario garcon = controller.obterFuncionario(id, "garcon");
                        
                        System.out.println("Digite o CPF do cliente: ");
                        input.nextLine();
                        String cpf = input.nextLine();
                        if(controller.obterCliente(cpf) == null){
                            System.out.println("Esse cliente não existe, tente novamente");
                            continue;
                        }
                        Cliente cliente = controller.obterCliente(cpf);

                        controller.anotarPedido(garcon, cliente);
                        
                        System.out.println("Digite 0 para voltar ao menu ou 1 para cadastrar outro pedido: ");
                        int opc = input.nextInt();
                        if(opc == 0)
                            break;
                    }
                }   
                case 2 -> {
                    limparTela();
                    System.out.println("Digite o ID do pedido a ser cancelado: ");
                    int id = input.nextInt();

                    controller.cancelarPedido(id);
                    System.out.println("Pedido cancelado!");
                }
                case 3 -> {
                    limparTela();
                    System.out.println("Digite o ID do pedido: ");
                    int idPedido = input.nextInt();
                    System.out.println("Digite o ID do produto: ");
                    int idProduto = input.nextInt();
                    System.out.println("Digite a quantidade a ser removida: ");
                    int quant = input.nextInt();

                    Pedido pedido = controller.getPedidos().buscarPedido(idPedido);

                    controller.removerProduto(idProduto, pedido, quant);   
                }
                case 4 ->{
                    limparTela();
                    System.out.println("A qual pedido este pagamento se refere?");
                    int idPedido = input.nextInt();
                    Pedido pedido = controller.obterPedido(idPedido);

                    if (pedido == null){
                        System.out.println("Pedido não cadastrado no sistema!");
                        break;
                    }
                    
                    if (pedido.getPagou() == true){
                        System.out.println("Esse pedido já foi pago!");
                        break;
                    }
                    
                    System.out.println("Qual o método de pagamento?");
                    input.nextLine();
                    String metodo = input.nextLine();

                    System.out.println("Qual o caixa que está realizando?");
                    int idCaixa = input.nextInt();
                    Funcionario caixa = controller.obterFuncionario(idCaixa, "caixa");

                    if (caixa == null){
                        System.out.println("Caixa não cadastrado no sistema!");
                        break;
                    }
                
                    System.out.println("Qual a data do pagamento?");
                    input.nextLine();
                    String data = input.nextLine();

                    Pagamento pagamento = new Pagamento(metodo, data, pedido, (Caixa)caixa);

                    controller.emitirNF(pagamento);
                }
                case 0 -> limparTela();
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
        
    }
}
