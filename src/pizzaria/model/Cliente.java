package pizzaria.model;

public class Cliente {
    private String nome, cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome(){
        return this.nome;
    }

    @Override
    public String toString(){
        String valor = "Nome: " + this.nome + "\n" + "CPF: " + this.cpf;

        return valor;
    }
}    