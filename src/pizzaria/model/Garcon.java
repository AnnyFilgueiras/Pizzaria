package pizzaria.model;

import java.util.ArrayList;

public class Garcon extends Funcionario{

    private int quantMesas;
    public ArrayList<Pedido> listaPedidos;

    public Garcon(String nome, int id, float salario) {
        super(nome, id, salario);
        this.quantMesas = 0;
    }
    
    @Override
    public float calcularSalario() {
       this.salarioFinal += ((this.salarioFinal/160*this.quantHE)+this.quantMesas*10);
       return this.salarioFinal;
    }

    public void setQuantMesas(int quantMesas) {
        this.quantMesas = quantMesas;
    }

    public ArrayList<Pedido> getListaPedidos(){
        return this.listaPedidos;
    }

    @Override
    public String toString(){
        String valor = "Garçon: " + "\n" +"Nome: " + this.getNome() + "\n" + "ID: " + this.getId() + "\n" +"Salário: " + this.calcularSalario();

        return valor;
    }
}