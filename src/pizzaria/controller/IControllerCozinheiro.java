package pizzaria.controller;

import java.util.ArrayList;
import pizzaria.model.Cozinheiro;

public interface IControllerCozinheiro extends IControllerFuncionario{
    public String darBaixaEstoqueCozinheiro(int idProduto, int quant);
    public ArrayList<Cozinheiro> listarCozinheiros();
}
