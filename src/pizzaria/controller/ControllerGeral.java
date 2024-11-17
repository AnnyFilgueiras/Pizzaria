package pizzaria.controller;

import java.util.ArrayList;
import pizzaria.model.Caixa;
import pizzaria.model.Cliente;
import pizzaria.model.Compra;
import pizzaria.model.Cozinheiro;
import pizzaria.model.Fornecedor;
import pizzaria.model.Funcionario;
import pizzaria.model.Garcon;
import pizzaria.model.Gerente;
import pizzaria.model.Ingrediente;
import pizzaria.model.Pagamento;
import pizzaria.model.Pedido;
import pizzaria.model.PedidoRep;
import pizzaria.model.Produto;


public class ControllerGeral implements IControllerGeral{
    private IControllerCliente clienteCont;
    private IControllerCompra compraCont;
    private IControllerFornecedor fornecedorCont;
    private IControllerCaixa caixaCont;
    private IControllerCozinheiro cozinheiroCont; 
    private IControllerGarcon garconCont; 
    private IControllerGerente gerenteCont;
    private IControllerIngrediente ingredienteCont;
    private IControllerPedido pedidoCont;           
    private IControllerSimples simplesCont;
    private IControllerComposto compostoCont;

    public ControllerGeral(IControllerCliente clienteCont, IControllerCompra compraCont, IControllerFornecedor fornecedorCont, IControllerCaixa caixaCont, IControllerCozinheiro cozinheiroCont, IControllerGarcon garconCont, IControllerGerente gerenteCont, IControllerIngrediente ingredienteCont, IControllerPedido pedidoCont, IControllerSimples simplesCont, IControllerComposto compostoCont) {
        this.clienteCont = clienteCont;
        this.compraCont = compraCont;
        this.fornecedorCont = fornecedorCont;
        this.caixaCont = caixaCont;
        this.cozinheiroCont = cozinheiroCont;
        this.garconCont = garconCont;
        this.gerenteCont = gerenteCont;
        this.ingredienteCont = ingredienteCont;
        this.pedidoCont = pedidoCont;
        this.simplesCont = simplesCont;
        this.compostoCont = compostoCont;
    }

    @Override
    public void adicionarOuAtualizarCliente(Cliente cliente) {
        this.clienteCont.adicionarOuAtualizarCliente(cliente);
    }

    @Override
    public PedidoRep getPedidos(){
        return this.pedidoCont.getPedidos();
    }

    @Override
    public void removerCliente(String cpf) {
        this.clienteCont.removerCliente(cpf);
    }

    @Override
    public Cliente obterCliente(String cpf) {
        return this.clienteCont.obterCliente(cpf);
    }

    @Override
    public Compra fazerCompra() {
        return this.compraCont.fazerCompra();
    }

    @Override
    public void adicionarOuAtualizarFornecedor(Fornecedor fornecedor) {
        this.fornecedorCont.adicionarOuAtualizarFornecedor(fornecedor);
    }

    @Override
    public void removerFornecedor(String cnpj) {
        this.fornecedorCont.removerFornecedor(cnpj);
    }

    @Override
    public ArrayList<Fornecedor> obterFornecedores() {
        return this.fornecedorCont.obterFornecedores();   
    }
    
    @Override
    public void adicionarOuAtualizarIngrediente(Ingrediente ingrediente) {
        this.ingredienteCont.adicionarOuAtualizarIngrediente(ingrediente);
    }

    @Override
    public void removerIngrediente(int id) {
        this.ingredienteCont.removerIngrediente(id);
    }

    @Override
    public ArrayList<Ingrediente> obterIngredientes() {
        return this.ingredienteCont.obterIngredientes();
    }

    @Override
    public void adicionarOuAtualizarPedido(Pedido pedido) {
        this.pedidoCont.adicionarOuAtualizarPedido(pedido);
    }


    @Override
    public void cancelarPedido(int id) {
        this.pedidoCont.cancelarPedido(id);
    }

    @Override
    public ArrayList<Pedido> obterPedidos() {
        return this.pedidoCont.obterPedidos();
    }

    @Override
    public void adicionarOuAtualizarProduto(Produto produto, String tipo){
        if ("Simples".equals(tipo) || "simples".equals(tipo)){
            this.simplesCont.adicionarOuAtualizarProduto(produto, tipo);
        }
        else{
            this.compostoCont.adicionarOuAtualizarProduto(produto, tipo);
        }
    }
    
    @Override
    public Pedido obterPedido(int idPedido){
        return this.pedidoCont.obterPedido(idPedido);
    }

    @Override
    public void removerProduto(int id, String tipo) {
        if ("Simples".equals(tipo) || "simples".equals(tipo)){
            this.simplesCont.removerProduto(id, tipo);
        }
        else{
            this.compostoCont.removerProduto(id, tipo);
        }
    }

    @Override
    public Produto obterProduto(int id, String tipo) {
        if ("Simples".equals(tipo) || "simples".equals(tipo)){
            return this.simplesCont.obterProduto(id, tipo);
        }
        else{
            return this.compostoCont.obterProduto(id, tipo);
        }
    }

    @Override
    public boolean confirmaPagamento(Pagamento pagamento) {
        return this.caixaCont.confirmaPagamento(pagamento);
    }

    @Override
    public void emitirNF(Pagamento pagamento) {
        this.caixaCont.emitirNF(pagamento);
    }

    @Override
    public boolean receberPagamento(float valor) {
        return this.caixaCont.receberPagamento(valor);
    }
    @Override
    public void adicionarOuAtualizarFuncionario(Funcionario funcionario, String tipo) {
            if (null != tipo)switch (tipo) {
            case "Gerente", "gerente" -> this.gerenteCont.adicionarOuAtualizarFuncionario(funcionario, tipo);
            case "Caixa", "caixa" -> this.caixaCont.adicionarOuAtualizarFuncionario(funcionario, tipo);
            case "Cozinheiro", "cozinheiro" -> this.cozinheiroCont.adicionarOuAtualizarFuncionario(funcionario, tipo);
            case "Garcon", "garcon" -> this.garconCont.adicionarOuAtualizarFuncionario(funcionario, tipo);
            default -> {
                }
        }
            
    }

    @Override
    public void removerFuncionario(int id, String tipo) {
        switch (tipo) {
            case "Gerente", "gerente" -> this.gerenteCont.removerFuncionario(id, tipo);
            case "Caixa", "caixa" -> this.caixaCont.removerFuncionario(id, tipo);
            case "Cozinheiro", "cozinheiro" -> this.cozinheiroCont.removerFuncionario(id, tipo);
            case "Garcon", "garcon" -> this.garconCont.removerFuncionario(id, tipo);
            default -> {
            }
        }
    }

    @Override
    public Funcionario obterFuncionario(int id, String tipo) {
        return switch (tipo) {
            case "Gerente", "gerente" -> this.gerenteCont.obterFuncionario(id, tipo);
            case "Caixa", "caixa" -> this.caixaCont.obterFuncionario(id, tipo);
            case "Cozinheiro", "cozinheiro" -> this.cozinheiroCont.obterFuncionario(id, tipo);
            default -> this.garconCont.obterFuncionario(id, tipo);
        };
    }

    @Override
    public String darBaixaEstoqueCozinheiro(int idProduto, int quant) {
        return this.cozinheiroCont.darBaixaEstoqueCozinheiro(idProduto, quant);
    }

    @Override
    public void anotarPedido(Funcionario garcon, Cliente cliente) {
        this.garconCont.anotarPedido(garcon, cliente);
    }

    @Override
    public String darBaixaEstoqueGarcon(int idSimples, int quant) {
        return this.garconCont.darBaixaEstoqueGarcon(idSimples, quant);
    }

    @Override
    public String confirmarCompra(Compra compra) {
        return this.gerenteCont.confirmarCompra(compra);
    }

    @Override
    public void adicionarItensAoEstoque(Compra compra) {
        this.gerenteCont.adicionarItensAoEstoque(compra);
    }

    @Override
    public void removerProduto(int id, Pedido pedido, int quant) {
        this.pedidoCont.removerProduto(id, pedido, quant);
    }  

    @Override
    public ArrayList<Compra> listarCompras(){
        return this.compraCont.listarCompras();
    }

    @Override
    public ArrayList<Cliente> listarClientes(){
        return this.clienteCont.listarClientes();
    }

    @Override
    public ArrayList<Caixa> listarCaixas(){
        return this.caixaCont.listarCaixas();
    }

    @Override
    public ArrayList<Garcon> listarGarcons(){
        return this.garconCont.listarGarcons();
    }

    @Override
    public ArrayList<Gerente> listarGerentes(){
        return this.gerenteCont.listarGerentes();
    }

    @Override
    public ArrayList<Cozinheiro> listarCozinheiros(){
        return this.cozinheiroCont.listarCozinheiros();
    }

    @Override
    public ArrayList<Produto> listarSimples(){
        return this.simplesCont.listarSimples();
    }

    @Override
    public ArrayList<Produto> listarComposto(){
        return this.compostoCont.listarComposto();
    }
}