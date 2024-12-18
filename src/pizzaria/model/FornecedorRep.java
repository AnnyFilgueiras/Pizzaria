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
            if (f.getCnpj().equals(fornecedor.getCnpj())){
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
            if(f.getCnpj().equals(cnpj)){
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

    public Fornecedor buscarFornecedor(String cnpj){
         for (Fornecedor f : fornecedores) {
            if (f.getCnpj().equals(cnpj)) {
                return f;
            }
        }
        //System.out.println("Fornecedor não encontrad0");
        return null;
    }

    public ArrayList<Fornecedor> listarFornecedores(){
        return this.fornecedores;
    }
}


