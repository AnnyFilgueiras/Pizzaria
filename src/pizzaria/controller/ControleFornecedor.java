package pizzaria.controller;

import java.util.ArrayList;
import pizzaria.model.FornecedorRep;
import pizzaria.model.Fornecedor;

public class ControleFornecedor implements IControllerFornecedor{

    private FornecedorRep fornecedores = FornecedorRep.getInstance();

    @Override
    public void adicionarOuAtualizarFornecedor(Fornecedor fornecedor) {
        this.fornecedores.adicionarFornecedor(fornecedor);
    }

    @Override
    public void removerFornecedor(String cnpj) {
        this.fornecedores.removerFornecedor(cnpj);
    }

    @Override
    public ArrayList<Fornecedor> obterFornecedores() {
        return this.fornecedores.listarFornecedores();
    }
    
}