package pizzaria.controller;

import pizzaria.model.Funcionario;

public class ControleCozinheiro implements IControllerFuncionario{

    @Override
    public void adicionarOuAtualizarFuncionario(Funcionario funcionario){

    }

    @Override
    public void removerFuncionario(int id){

    }
    
    @Override
    public Funcionario obterFuncionario(int id){
        Funcionario fulano = null;
        return fulano;
    }

    public String darBaixaEstoque(int idIngrediente, int quant){
        return "0";
    }
}