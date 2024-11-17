package pizzaria.controller;

import java.util.Scanner;

import pizzaria.model.Composto;
import pizzaria.model.CompostoRep;
import pizzaria.model.IngredienteRep;
import pizzaria.model.Produto;

public class ControleComposto implements IControllerComposto{

    private CompostoRep compostos = CompostoRep.getInstance();
    private IngredienteRep ingredientes = IngredienteRep.getInstance();

    @Override
    public void adicionarOuAtualizarProduto(Produto produto, String tipo){
        Scanner ler = new Scanner(System.in);
        Composto composto = (Composto)produto;
        
        while(true){
            System.out.print("\nDigite o ID do ingrediente: ");
            int idIngrediente = ler.nextInt();

            if(ingredientes.listarIngredientes().contains(ingredientes.buscarIngrediente(idIngrediente))){
                composto.setIngredientesUsados(ingredientes.buscarIngrediente(idIngrediente));
            }
            else{
                System.out.println("O ingrediente não existe.\n");
                
            }
            System.out.print("Deseja adicionar mais ingredientes? S/N: ");
            char op = ler.next().charAt(0);

            if(op == 'n' || op == 'N'){
                break;
            }
            
        }
        this.compostos.adicionarComposto(composto);
    }

    @Override
    public void removerProduto(int id, String tipo) {
        this.compostos.removerComposto(id);
    }

    @Override
    public Produto obterProduto(int id, String tipo) {
        return this.compostos.buscarComposto(id);
    }
    
}
