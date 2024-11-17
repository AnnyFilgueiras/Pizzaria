package pizzaria.controller;

import java.util.ArrayList;
import pizzaria.model.Caixa;
import pizzaria.model.Pagamento;

public interface IControllerCaixa extends IControllerFuncionario{
    
    public boolean confirmaPagamento(Pagamento pagamento);
    public void emitirNF (Pagamento pagamento);
    public boolean receberPagamento(float valor);
    public ArrayList<Caixa> listarCaixas();
}
