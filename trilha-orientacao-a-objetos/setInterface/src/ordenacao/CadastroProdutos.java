package ordenacao;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtosSet;

    public CadastroProdutos() {
        this.produtosSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtosSet.add(new Produto(nome, cod, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){

        Set<Produto> produtosPorNome = new TreeSet<>(produtosSet);

        if(!produtosSet.isEmpty()){

            return produtosPorNome;

        }else{
            throw new RuntimeException("O conjunto está vazio!");
        }

    }

    public Set<Produto> exibirProdutosPorPreco(){

        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());

        if(!produtosSet.isEmpty()){

            produtosPorPreco.addAll(produtosSet);

            return produtosPorPreco;


        }else{
            throw new RuntimeException("O conjunto está vazio!");
        }

    }

}
