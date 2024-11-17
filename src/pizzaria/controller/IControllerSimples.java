package pizzaria.controller;

import java.util.ArrayList;
import pizzaria.model.Produto;

public interface IControllerSimples extends IControllerProduto {
    public ArrayList<Produto> listarSimples();
}