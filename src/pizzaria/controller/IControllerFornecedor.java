package pizzaria.controller;

import java.util.ArrayList;
import pizzaria.model.Fornecedor;

public interface IControllerFornecedor {
 
    public void adicionarOuAtualizarFornecedor (Fornecedor fornecedor);
    
    public void removerFornecedor (String cnpj); //arrumar no UML
    
    public ArrayList<Fornecedor> obterFornecedores ();
}