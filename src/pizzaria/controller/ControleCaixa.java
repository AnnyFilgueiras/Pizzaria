package pizzaria.controller;

import java.util.ArrayList;
import java.util.Scanner;
import pizzaria.model.Caixa;
import pizzaria.model.CaixaRep;
import pizzaria.model.Funcionario;
import pizzaria.model.Pagamento;
import pizzaria.model.PagamentoRep;
import pizzaria.model.Pedido;

public class ControleCaixa implements IControllerCaixa{

    private CaixaRep caixas = CaixaRep.getInstance();
    private PagamentoRep pagamentos = PagamentoRep.getInstance();
    Scanner ler = new Scanner (System.in);

    @Override
    public boolean confirmaPagamento(Pagamento pagamento){
        
        Pedido pedido = pagamento.getPedido();
        
        boolean conf = false;
        
        if (receberPagamento(pagamento.getValor()) == true){
            conf = true;
            pedido.setPagou();
        }
        
        return conf;
    }

    @Override
    public void emitirNF(Pagamento pagamento){
        int id;
        
        if (confirmaPagamento (pagamento) == true){
            System.out.println("Confirme seu ID: ");
            id = ler.nextInt();
            
            if(obterFuncionario(id, "")!=null){
                pagamentos.adicionarPagamento(pagamento);
                System.out.println("          Nota Fiscal        ");
                System.out.println("    CPF: " + pagamento.getPedido().getCliente().getCpf());
                 System.out.println("    Data: " + pagamento.getData());
                System.out.println("    Produtos: " + pagamento.getPedido().mostrarHashMap());
                System.out.println("    Valor total: " + pagamento.getValor());
            }
            else{
                System.out.println("Seu ID não permite emissão de NF");
            }
        }
    }

    @Override
    public boolean receberPagamento(float valor){
        
        boolean rec = false;
        char r;
        
        System.out.println("Cliente pagou? S/N");
        r = ler.next().charAt(0);
        
        if(r=='S' || r=='s'){
            rec = true;
        }
        else if(r =='N' || r == 'n')
            System.out.println("Cliente não pagou! Pagamento cancelado.");
        return rec;
    } 

    @Override
    public void adicionarOuAtualizarFuncionario(Funcionario funcionario, String tipo){
        this.caixas.adicionarCaixa(((Caixa)funcionario));
    }

    @Override
    public void removerFuncionario(int id, String tipo){
        this.caixas.removerCaixa(id);
    }

    @Override
    public Funcionario obterFuncionario(int id, String tipo){
        return this.caixas.buscarCaixa(id);
    }

    @Override
    public ArrayList<Caixa> listarCaixas(){
        return this.caixas.listarCaixas();
    }
}