package pizzaria.controller;

import java.util.ArrayList;
import pizzaria.model.Cliente;
import pizzaria.model.Funcionario;
import pizzaria.model.Garcon;

public interface IControllerGarcon extends IControllerFuncionario{
    
    public void anotarPedido (Funcionario Garcon, Cliente cliente);
    public String darBaixaEstoqueGarcon(int idSimples, int quant);
    public ArrayList<Garcon> listarGarcons();
}
