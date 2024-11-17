package pizzaria.controller;

import pizzaria.model.Funcionario;

interface IControllerFuncionario{

    public void adicionarOuAtualizarFuncionario(Funcionario funcionario, String tipo);

    public void removerFuncionario(int id, String tipo);

    public Funcionario obterFuncionario(int id, String tipo);
    
}