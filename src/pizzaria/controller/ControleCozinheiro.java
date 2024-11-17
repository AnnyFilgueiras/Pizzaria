package pizzaria.controller;

import java.util.ArrayList;
import java.util.Scanner;
import pizzaria.model.Composto;
import pizzaria.model.CompostoRep;
import pizzaria.model.Cozinheiro;
import pizzaria.model.CozinheiroRep;
import pizzaria.model.Funcionario;
import pizzaria.model.Ingrediente;
import pizzaria.model.IngredienteRep;
import pizzaria.model.Produto;

public class ControleCozinheiro implements IControllerCozinheiro{

    private CozinheiroRep cozinheiros = CozinheiroRep.getInstance();
    private IngredienteRep ingredientes = IngredienteRep.getInstance();
    private CompostoRep compostos = CompostoRep.getInstance();

    
    @Override
    public void adicionarOuAtualizarFuncionario(Funcionario funcionario, String tipo){
        this.cozinheiros.adicionarCozinheiro(((Cozinheiro)funcionario));
    }

    @Override
    public void removerFuncionario(int id, String tipo){
        this.cozinheiros.removerCozinheiro(id);
    }
    
    @Override
    public Funcionario obterFuncionario(int id, String tipo){
        return this.cozinheiros.buscarCozinheiro(id);
    }
    @Override
    public String darBaixaEstoqueCozinheiro(int idProduto, int quant){
        
        Produto produto = compostos.buscarComposto(idProduto);
        ArrayList<Ingrediente> ingredientesUsados = ((Composto)produto).getIngredientes();
        Scanner ler = new Scanner(System.in);

        while(true){
            
            System.out.println("Digite seu ID: ");
            int idCozinheiro = ler.nextInt();

            if(obterFuncionario(idCozinheiro, "")!=null){
                for (Ingrediente i : ingredientes.listarIngredientes()){
                    for (Ingrediente iUsados : ingredientesUsados){
                        if(i.getID() == iUsados.getID()){
                            if(i.getEstoque() == 0){
                                return "Um ou mais ingredientes sem estoque.";
                            }
                            else if(i.getEstoque() < quant){
                                return "Um ou mais ingredientes com estoque insuficiente";
                            }
                            else{
                                i.setQuantEstoque(i.getEstoque() - quant);           
                            }
                        }
                    }
                }

                return "Estoque atualizado!";
            }
            else{
                System.out.println("Seu ID não permite dar baixa em estoque, tente novamente");
                ler.close();

            }        
        }
        
    
    }

    @Override
    public ArrayList<Cozinheiro> listarCozinheiros() {
        return this.cozinheiros.listarCozinheiros();
    }
}