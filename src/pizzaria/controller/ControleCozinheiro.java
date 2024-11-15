package pizzaria.controller;

import pizzaria.model.Funcionario;

public class ControleCozinheiro implements IControllerFuncionario{

    public void adicionarOuAtualizarFuncionario(Funcionario funcionario){

    };

    public void removerFuncionario(int id){

    };

    public Funcionario obterFuncionario(int id){
        Funcionario fulano = null;
        return fulano;
    };

    public String darBaixaEstoque(int idIngrediente, int quant){
        return "0";
    }
}