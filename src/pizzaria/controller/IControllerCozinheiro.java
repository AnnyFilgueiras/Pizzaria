
package pizzaria.controller;

public interface IControllerCozinheiro extends IControllerFuncionario{
    public String darBaixaEstoqueCozinheiro(int idProduto, int quant);
}
