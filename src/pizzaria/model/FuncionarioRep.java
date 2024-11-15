package pizzaria.model;

import java.util.ArrayList;


public abstract class FuncionarioRep{

    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

        public void adicionarFuncionario(Funcionario funcionario){
        boolean rem = false;

        for (Funcionario f : funcionarios){
            if (f.getId() == funcionario.getId()){
                funcionarios.remove(f);
                rem = true;
                break;
            } 
        }
        this.funcionarios.add(funcionario);

        if(rem == true){
            System.out.println("Funcionário atualizado");
        }
        if(rem == false){
            System.out.println("Funcionário adicionado");

        }
    }

    public void removerFuncionario(int id){
        boolean rem = false;

        for (Funcionario f : funcionarios){
            if(f.getId() == id){
                funcionarios.remove(f);
                rem = true;
                System.out.println("Funcionário removido");
                break;
            }
        }
        if(rem == false){
            System.out.println("Funcionário não encontrado");
        }
    }

    public ArrayList<Funcionario> listarFuncionarios(){
        return this.funcionarios;
    }

    public Funcionario buscarFuncionario(int id){
        for (Funcionario f : funcionarios){
            if (f.getId() == id){
                System.out.println("Funcionário encontrado");
                return f;
            }
        }
        System.out.println("Funcionário não encontrado");
        return null;
 }
}