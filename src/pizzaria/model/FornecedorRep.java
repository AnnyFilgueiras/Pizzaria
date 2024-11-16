package pizzaria.model;

import java.util.ArrayList;

public class FornecedorRep {

    private ArrayList<Fornecedor> fornecedores;
    private static FornecedorRep fornecedorRep;

    private FornecedorRep(){
        this.fornecedores = new ArrayList<>();
    }

    public static FornecedorRep getInstance(){
        if(fornecedorRep == null)
            fornecedorRep = new FornecedorRep();
        return fornecedorRep;
    }

    public void adicionarFornecedor(Fornecedor fornecedor){
        boolean rem = false;

        for (Fornecedor f : fornecedores){
            if (f.getCnpj() == fornecedor.getCnpj()){
                fornecedores.remove(f);
                rem = true;
                break;
            } 
        }
        this.fornecedores.add(fornecedor);

        if(rem == true){
            System.out.println("Fornecedor atualizado");
        }
        if(rem == false){
            System.out.println("Fornecedor adicionado");

        }
    }

    public void removerFornecedor(String cnpj){
        boolean rem = false;

        for (Fornecedor f : fornecedores){
            if(f.getCnpj() == cnpj){
                fornecedores.remove(f);
                rem = true;
                System.out.println("Fornecedor removido");
                break;
            }
        }
        if(rem == false){
            System.out.println("Fornecedor não encontrado");
        }
    }

    public ArrayList<Fornecedor> listarFornecedores(){
        return this.fornecedores;
    }
}


