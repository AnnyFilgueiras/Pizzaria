package pizzaria.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import pizzaria.model.Compra;
import pizzaria.model.CompraRep;
import pizzaria.model.FornecedorRep;
import pizzaria.model.Ingrediente;
import pizzaria.model.IngredienteRep;
import pizzaria.model.Produto;
import pizzaria.model.Simples;
import pizzaria.model.SimplesRep;


public class ControleCompra implements IControllerCompra{

    private CompraRep compras = CompraRep.getInstance();
    private FornecedorRep fornecedores = FornecedorRep.getInstance();
    private IngredienteRep ingredientes = IngredienteRep.getInstance();
    private SimplesRep simples = SimplesRep.getInstance();
    
    @Override
    public Compra fazerCompra() {
        if(fornecedores.listarFornecedores().size() == 0){
        System.out.println("Não há fornecedores para efetuar compras alguma.");
            return null;
        }
        
        Scanner ler = new Scanner(System.in);
        Compra compra;
        int opc = 1;
        
        
        System.out.println("Qual a data da compra: ");
        String data = ler.nextLine();
            
        while(true){
            System.out.println("Qual o CNPJ do fornecedor: ");
            String cnpjFornecedor = ler.nextLine();
            if(fornecedores.listarFornecedores().contains(fornecedores.buscarFornecedor(cnpjFornecedor))){
                compra = new Compra(data, fornecedores.buscarFornecedor(cnpjFornecedor));
                break;
            }
            else{
                System.out.println("Fornecedor não encontrado, tente novamente.");
            }
        } 

        HashMap<Produto, Integer> hsimples = compra.getListaSimples();
        HashMap<Ingrediente, Integer> hingredientes = compra.getListaIngredientes();
        
        do{   
            System.out.println("O que deseja comprar? (Insira o ID). ");
            int id = ler.nextInt();
            System.out.println("Qual a quantidade? ");
            int quant = ler.nextInt();

            if (id>=100 && id<200){ //simples
                Produto produtoSimples = simples.buscarSimples(id);
                ((Simples)produtoSimples).setQuantEstoque(quant);
                hsimples.put(((Simples)produtoSimples), quant);
                
            }

            else{//ingredientes
                Ingrediente ingrediente = ingredientes.buscarIngrediente(id);
                ingrediente.setQuantEstoque(quant);
                hingredientes.put(ingrediente, quant);
            }


            System.out.println("Digite 1 para continuar, 2 para cancelar ou 0 para finalizar a compra.");
            opc = ler.nextInt();
             
        } while(opc != 0 && opc!=2);

        if(opc == 2){
            compra = null;
            System.out.println("Compra cancelada.");
            ler.close();
            return compra;
        }
        
        System.out.println("O valor total da compra é " +  compra.calcularValorTotal());
        
        
        this.compras.adicionarCompra(compra);

        return compra;
    }
    public ArrayList<Compra> listarCompras(){
        return this.compras.listarCompras();
    }
    /* 
    public void adicionarEmCompraIngrediente(Ingrediente ingrediente, int quant){ // isso vai tá em controller ne TA AQUI PRO TESTE
        this.listaIngredientes.put(ingrediente, quant);
    }

    public void adicionarOuAtualizarSimples(Produto simples, int quant){ // isso vai tá em controller ne TA AQUI PRO TESTE
        this.listaSimples.put(simples, quant);
    }
    @Override
    public void AdicionarOuAtualizarSimples(Simples simples, int quant) {
        
    }

    @Override
    public void AdicionarOuAtualizarIngrediente(Ingrediente ingrediente, int quant) {
    }
*/
}