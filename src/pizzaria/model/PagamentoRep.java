package pizzaria.model;

import java.util.ArrayList;

public class PagamentoRep {
     private ArrayList<Pagamento> pagamentos = new ArrayList<>();
    
    public void adicionarPagamento(Pagamento pagamento){
        boolean rem = false;
        
        for (Pagamento p : pagamentos){
            if(p.getId() == pagamento.getId()){
                pagamentos.remove(p);
                rem = true;
                break;
            }
        }
        pagamentos.add(pagamento);
        
        if (rem == true){
            System.out.println("Pagamento atualizado");
        }
        else{
            System.out.println("Pagamento adicionado");
        }
    }
    
    public void removerPagamento (int id){
        boolean rem = false;
        for (Pagamento p : pagamentos){
            if(p.getId() == id){
                pagamentos.remove(p);
                System.out.println("Pagamento removido");
                rem = true;
                break;
            }
        }

        if (rem == false){
            System.out.println("Pagamento não encontrado");
        }
    }
    
    public  ArrayList<Pagamento> listarPagamentos(){
        return this.pagamentos;
    }
}
