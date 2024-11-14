package pizzaria.controller;

import pizzaria.model.Funcionario;

interface IControllerFuncionario{

    public void adicionarOuAtualizarFuncionario(Funcionario funcionario);

    public void removerFuncionario(int id);

    public Funcionario obterFuncionario(int id);
    
}