package pizzaria.model;

public class Cozinheiro extends Funcionario{
    
    public Cozinheiro(String nome, float salario, int id){
        super(nome, id, salario);
        this.quantHE = 0;
        this.salarioFinal = salario;
    }


    @Override
    public float calcularSalario(){
        
        this.salarioFinal += (this.salarioFinal/160*this.quantHE);
        return this.salarioFinal;
    }
}