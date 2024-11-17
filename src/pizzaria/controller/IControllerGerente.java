package pizzaria.controller;

import java.util.ArrayList;
import pizzaria.model.Compra;
import pizzaria.model.Gerente;

public interface IControllerGerente extends IControllerFuncionario{
    
    public String confirmarCompra(Compra compra);
    public void adicionarItensAoEstoque(Compra compra);
    public ArrayList<Gerente> listarGerentes();
}
