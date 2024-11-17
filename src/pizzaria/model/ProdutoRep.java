package pizzaria.model;

import java.util.ArrayList;

public class ProdutoRep {
    private ArrayList<Produto> produtos;
    private static ProdutoRep produtoRep;

    private ProdutoRep(){
        this.produtos = new ArrayList<>();
    }

    public static ProdutoRep getInstance(){
        if(produtoRep == null)
            produtoRep = new ProdutoRep();
        return produtoRep;
    }

    public ArrayList<Produto> listarComposto(){
        return this.produtos;
    }
    
}
