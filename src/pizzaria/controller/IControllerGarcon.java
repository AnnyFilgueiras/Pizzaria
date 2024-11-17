package pizzaria.controller;

import pizzaria.model.Cliente;
import pizzaria.model.Funcionario;

public interface IControllerGarcon extends IControllerFuncionario{
    
    public void anotarPedido (Funcionario Garcon, Cliente cliente);
    public String darBaixaEstoqueGarcon(int idSimples, int quant);
}
