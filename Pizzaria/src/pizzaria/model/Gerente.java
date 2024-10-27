package pizzaria.model;

public class Gerente extends Funcionario{
    
    public Gerente(String nome, float salario, int id){
        super(nome, id, salario);
        this.quantHE = 0;
        this.salarioFinal = salario;
    }

    @Override
    public float calcularSalario(){
        return 0;
    }
}