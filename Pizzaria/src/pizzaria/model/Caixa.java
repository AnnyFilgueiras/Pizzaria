package pizzaria.model;

public class Caixa extends Funcionario{
    
    private int quantVendas;

    public Caixa(String nome, float salario, int id, float salarioFinal, int quantHE){
        super(nome, id, salario);
        this.quantHE = 0;
        this.salarioFinal = salario;
        this.quantVendas = 0;
    }
        
    @Override
    public float calcularSalario(){
        return 0;
    }
    
    public void setQuantVendas(int quantVendas){
        this.quantVendas = quantVendas;
    }
}