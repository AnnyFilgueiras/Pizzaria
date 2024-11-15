package pizzaria.controller;

import pizzaria.model.Cliente;

public interface IControllerCliente {
 
    public void adicionarOuAtualizarCliente (Cliente cliente);
    
    public void removerCliente (String cpf); //arrumar no UML
    
    public Cliente obterCliente (String cpf);
}