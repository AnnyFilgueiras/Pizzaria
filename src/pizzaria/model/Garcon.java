package pizzaria.model;

public class Garcon extends Funcionario{

    private int quantMesas;

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
}