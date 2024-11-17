package pizzaria.controller;

import pizzaria.model.Pagamento;

public interface IControllerCaixa extends IControllerFuncionario{
    
    public boolean confirmaPagamento(Pagamento pagamento);
    public void emitirNF (Pagamento pagamento);
    public boolean receberPagamento(float valor);
}
