package pizzaria.controller;

import java.util.HashMap;
import java.util.Scanner;
import pizzaria.model.Compra;
import pizzaria.model.Funcionario;
import pizzaria.model.Gerente;
import pizzaria.model.GerenteRep;
import pizzaria.model.IngredienteRep;
import pizzaria.model.Produto;
import pizzaria.model.SimplesRep;
import pizzaria.model.CompraRep;
import pizzaria.model.Ingrediente;
import pizzaria.model.Simples;

public class ControleGerente implements IControllerGerente{

    private GerenteRep gerentes = GerenteRep.getInstance();
    private CompraRep compras = CompraRep.getInstance();
    private IngredienteRep ingredientes = IngredienteRep.getInstance();
    private SimplesRep simples = SimplesRep.getInstance();
    
    @Override
    public void adicionarOuAtualizarFuncionario(Funcionario gerente, String tipo){
        this.gerentes.adicionarGerente(((Gerente)gerente));
    }

    @Override
    public void removerFuncionario(int id, String tipo){
        this.gerentes.removerGerente(id);
    }

    @Override
    public Funcionario obterFuncionario(int id, String tipo){
        return gerentes.buscarGerente(id);
    }

    public String confirmarCompra(Compra compra){
        int id;
        
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu ID: ");
        id = ler.nextInt();

        if (obterFuncionario(id, "")!=null){
            compras.adicionarCompra(compra);
            ler.close();
            adicionarItensAoEstoque(compra);
            return "Compra efetuada";
        }
        else{
            ler.close();
            return "Seu ID não permite compras";
        }  
    }

    public void adicionarItensAoEstoque(Compra compra){

        HashMap<Ingrediente, Integer> hIngrediente = compra.getListaIngredientes();
        HashMap<Produto, Integer> hSimples = compra.getListaSimples();

        if(hSimples.size()!=0){
           for(Produto s : hSimples.keySet()){
            for (Produto p : simples.listarSimples()){
                if(s.getId() == p.getId()){
                    ((Simples)p).setQuantEstoque(((Simples)p).getQuantEstoque() + hSimples.get(s));
                }
            }  
            } 
        }
        

        if (hIngrediente.size()!=0){
            for(Ingrediente s : hIngrediente.keySet()){
                for (Ingrediente i : ingredientes.listarIngredientes()){
                    if(s.getID() == i.getID()){
                        i.setQuantEstoque(i.getEstoque() + hIngrediente.get(s));
                    }
                }  
            }
        }
    }
}