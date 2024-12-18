package pizzaria.model;

public class Fornecedor {   
    private String nome, cnpj;

    public Fornecedor(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public String getCnpj(){
        return this.cnpj;
    
    }

    public String getNome(){
        return this.nome;
    }

    @Override
    public String toString(){
        String valor = "Fornecedor(a): " + this.nome + "\n" + "CNPJ: " + this.cnpj;

        return valor;
    }
}