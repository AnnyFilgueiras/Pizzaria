package pizzaria.model;

public class Caixa extends Funcionario{
    
    private int quantVendas;

    public Caixa(String nome, float salario, int id){
        super(nome, id, salario);
        this.quantHE = 0;
        this.salarioFinal = salario;
        this.quantVendas = 0;
    }
        
    @Override
    public float calcularSalario(){
        this.salarioFinal += ((this.salarioFinal/160*this.quantHE)+this.quantVendas*10);
        return this.salarioFinal;
    }
    
    public void setQuantVendas(int quantVendas){
        this.quantVendas = quantVendas;
    }
}