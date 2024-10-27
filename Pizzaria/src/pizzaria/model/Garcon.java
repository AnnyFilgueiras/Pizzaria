package pizzaria.model;

public class Garcon extends Funcionario{

    private int quantMesas;

    public Garcon(int quantMesas, String nome, int id, float salario) {
        super(nome, id, salario);
        this.quantMesas = quantMesas;
    }
    
    @Override
    public float calcularSalario() {
       return 0; 
    }

    public void setQuantMesas(int quantMesas) {
        this.quantMesas = quantMesas;
    }
}