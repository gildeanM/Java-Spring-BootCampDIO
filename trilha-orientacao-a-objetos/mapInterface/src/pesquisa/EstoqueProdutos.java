package pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutos;

    public EstoqueProdutos() {
        this.estoqueProdutos = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){

        estoqueProdutos.put(cod,new Produto(nome, quantidade, preco));

    }

    public void exibirProdutos(){

        if(!estoqueProdutos.isEmpty()){

            System.out.println(estoqueProdutos);

        }else{
            System.out.println("O estoque está vazio!");
        }

    }


    public double calcularValorTotalEstoque(){

        double valorTotalEstoque = 0.0;

        if(!estoqueProdutos.isEmpty()){

            for (Produto p : estoqueProdutos.values()) {
                valorTotalEstoque += p.getPreco() * p.getQuantidade();
            }

            return valorTotalEstoque;

        }else{
            throw new RuntimeException("O estoque está vazio!");
        }

    }


    public Produto obterProdutoMaisCaro(){

        Produto produtoMaisCaro = new Produto("produto inicial",1,Double.MIN_VALUE);

        if(!estoqueProdutos.isEmpty()){

            for (Produto p : estoqueProdutos.values()) {
                if(produtoMaisCaro.getPreco() < p.getPreco()){
                    produtoMaisCaro = p;
                }
            }

            return produtoMaisCaro;

        }else{
            throw new RuntimeException("O estoque está vazio!");
        }

    }

    public Produto obterProdutoMaisBarato(){

        Produto produtoMaisBarato = new Produto("produto inicial",1,Double.MAX_VALUE);

        if(!estoqueProdutos.isEmpty()){

            for (Produto p : estoqueProdutos.values()) {
                if(produtoMaisBarato.getPreco() > p.getPreco()){
                    produtoMaisBarato = p;
                }
            }

            return produtoMaisBarato;

        }else{
            throw new RuntimeException("O estoque está vazio!");
        }

    }


    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){

        Produto produtoMaiorQuantidadeValorTotalNoEstoque = new Produto("produto inicial",0,0);

        if(!estoqueProdutos.isEmpty()){

            for (Produto p : estoqueProdutos.values()) {

                double valorTotalProdutoMaiorQuantidade = produtoMaiorQuantidadeValorTotalNoEstoque.getPreco() * produtoMaiorQuantidadeValorTotalNoEstoque.getQuantidade();
                double valorTotal = p.getPreco() * p.getQuantidade();

                if(valorTotalProdutoMaiorQuantidade < valorTotal){
                    produtoMaiorQuantidadeValorTotalNoEstoque = p;
                }
            }

            return produtoMaiorQuantidadeValorTotalNoEstoque;

        }else{
            throw new RuntimeException("O estoque está vazio!");
        }

    }

}
