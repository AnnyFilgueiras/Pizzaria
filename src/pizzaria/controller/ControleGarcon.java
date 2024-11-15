package pizzaria.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import pizzaria.model.Funcionario;
import pizzaria.model.Pedido;
import pizzaria.model.Garcon;
import pizzaria.model.GarconRep;
import pizzaria.model.Cliente;



public class ControleGarcon implements IControllerFuncionario{ 

    private GarconRep garcons = new GarconRep();
    Scanner input = new Scanner(System.in);
    
    // Implementar darBaixaNoEstoque
    public void anotarOuAtualizarPedido(Garcon garcon, Cliente cliente){

        while(true){
            System.out.println("Digite 0 para cancelar ou 1 para continuar: ");
            int entrada = input.nextInt();
            if (entrada == 0){
                break;
            }
            
            System.out.println("Anote aqui o ID do produto: ");
            int id = input.nextInt();
            System.out.println("Quantidade do produto: ");
            int quant = input.nextInt();
         
        }
            /*
            System.out.println("Qual o nome do cliente: ");
            String nomeCliente = input.nextLine();
            System.out.println("Qual o CPF do cliente: ");
            String cpfCliente = input.nextLine();
            
            Cliente cliente = new Cliente(nomeCliente, cpfCliente);
            getClientes().adicionarCliente(cliente);
            */
        
    }

    public String darBaixaEstoque(int idIngrediente, int quantEstq){
        return "AHHAHAHHAHAHAHHAHAHA";
    }

    @Override
    public void adicionarOuAtualizarFuncionario(Funcionario funcionario){
        this.garcons.adicionarGarcon(((Garcon)funcionario));
    }

    @Override
    public void removerFuncionario(int id){
        this.garcons.removerGarcon(id);

    }

    @Override
    public Funcionario obterFuncionario(int id){
        return this.garcons.buscarGarcon(id);
        
    }
}