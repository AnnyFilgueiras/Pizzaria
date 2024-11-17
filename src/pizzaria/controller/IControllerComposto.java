package pizzaria.controller;

import java.util.ArrayList;
import pizzaria.model.Produto;

public interface IControllerComposto extends IControllerProduto {
    public ArrayList<Produto> listarComposto();
}
