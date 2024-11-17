package pizzaria.model;

public abstract class Funcionario{
    private String nome;
    private int id;
    protected int quantHE;
    private float salario;
    protected float salarioFinal;

    public Funcionario(String nome, int id, float salario) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
        this.quantHE = 0;
        this.salarioFinal = this.salario;
    }
    
    public abstract float calcularSalario();

    public void setQuantHE(int quantHE) {
        this.quantHE = quantHE;
    }

    public int getId() {
        return id;
    }

    public String getNome(){
        return this.nome;
    }

    @Override
    public String toString(){
        String valor = "Nome: " + "\n" + "ID: " + this.id + "\n" +"Salário: " + this.salario;

        return valor;
    }

    public float getSalario(){
        return this.salario;
    }
}