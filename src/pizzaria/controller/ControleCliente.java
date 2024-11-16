package pizzaria.controller;

import pizzaria.model.Cliente;
import pizzaria.model.ClienteRep;

public class ControleCliente implements IControllerCliente{

    private ClienteRep clientes = ClienteRep.getInstance();

    @Override
    public void adicionarOuAtualizarCliente(Cliente cliente) {
        this.clientes.adicionarCliente(cliente);     
    }

    @Override
    public void removerCliente(String cpf) {
        this.clientes.removerCliente(cpf);
    }

    @Override
    public Cliente obterCliente(String cpf) {
        return this.clientes.buscarCliente(cpf);
    }

    public ClienteRep getClientes(){
        return this.clientes;
    }
}