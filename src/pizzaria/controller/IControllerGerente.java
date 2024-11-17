package pizzaria.controller;

import pizzaria.model.Compra;

public interface IControllerGerente extends IControllerFuncionario{
    
    public String confirmarCompra(Compra compra);
    public void adicionarItensAoEstoque(Compra compra);
}
