package pizzaria.controller;

import java.util.Scanner;
import pizzaria.model.Pagamento;
import pizzaria.model.Funcionario;
import pizzaria.model.Caixa;
import pizzaria.model.CaixaRep;

public class ControleCaixa implements IControllerFuncionario{

    private CaixaRep caixas = CaixaRep.getInstance();
    Scanner ler = new Scanner (System.in);

    public boolean confirmaPagamento(Pagamento pagamento){
        
        boolean conf = false;
        
        if (receberPagamento(pagamento.getValor()) == true){
            conf = true;
        }
        
        return conf;
    }

    public void emitirNF(Pagamento pagamento){
        int id;
        
        if (confirmaPagamento (pagamento) == true){
            System.out.println("Confirme seu ID: ");
            id = ler.nextInt();
            
            if(obterFuncionario(id)!=null){
                System.out.println("          Nota Fiscal        ");
                System.out.println("    CPF: " + pagamento.getPedido().getCliente().getCpf());
                System.out.println("    Produtos: " + pagamento.getPedido().getProdutos());
                System.out.println("    Valor total: " + pagamento.getValor());
            }
            else{
                System.out.println("Seu ID não permite emissão de NF");
            }
        }
    }

    public boolean receberPagamento(float valor){
        
        boolean rec = false;
        char r;
        
        System.out.println("Cliente pagou? S/N");
        r = ler.next().charAt(0);
        
        if(r=='S' || r=='s'){
            rec = true;
        }
        
        return rec;
    } 

    @Override
    public void adicionarOuAtualizarFuncionario(Funcionario funcionario){
        this.caixas.adicionarCaixa(((Caixa)funcionario));
    }

    @Override
    public void removerFuncionario(int id){
        this.caixas.removerCaixa(id);
    }

    @Override
    public Funcionario obterFuncionario(int id){
        return this.caixas.buscarCaixa(id);
    }
}