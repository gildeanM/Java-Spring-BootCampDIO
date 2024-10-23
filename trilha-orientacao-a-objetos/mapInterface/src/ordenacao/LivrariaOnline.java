package ordenacao;

import java.util.*;

public class LivrariaOnline{

    private Map<String,Livro> livrariaOnline;

    public LivrariaOnline() {
        this.livrariaOnline = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco){

        livrariaOnline.put(link, new Livro(titulo, autor, preco));

    }

    public void removerLivro(String titulo){

        String chaveParaRemover = null;

        if(!livrariaOnline.isEmpty()){

            for (Map.Entry<String,Livro> entry : livrariaOnline.entrySet() ) {
                if(entry.getValue().getTitulo().equalsIgnoreCase(titulo)){
                    chaveParaRemover = entry.getKey();
                }
            }

            livrariaOnline.remove(chaveParaRemover);

        } else {

            throw new RuntimeException("A livraria está vazia!");

        }


    }

    public void exibirLivros(){
        if(!livrariaOnline.isEmpty()){
            System.out.println(livrariaOnline);
        }else{
            System.out.println("A livraria está vazia!");
        }
    }


    public Map<String,Livro> exibirLivrosOrdenadosPorPreco(){

        List<Map.Entry<String,Livro>> livrosParaOrdenar = new ArrayList<>(livrariaOnline.entrySet());

        Collections.sort(livrosParaOrdenar, new ComparatorPorPreco());

        Map<String,Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();

        for (Map.Entry<String,Livro> entry : livrosParaOrdenar) {
            livrosOrdenadosPorPreco.put(entry.getKey(),entry.getValue());
        }


        return livrosOrdenadosPorPreco;

    }

    public Map<String,Livro> exibirLivrosOrdenadosPorAutor(){

        List<Map.Entry<String,Livro>> livrosParaOrdenar = new ArrayList<>(livrariaOnline.entrySet());

        Collections.sort(livrosParaOrdenar, new ComparatorPorAutor());

        Map<String,Livro> livrosOrdenadosPorAutor = new LinkedHashMap<>();

        for (Map.Entry<String,Livro> entry : livrosParaOrdenar) {
            livrosOrdenadosPorAutor.put(entry.getKey(),entry.getValue());
        }


        return livrosOrdenadosPorAutor;

    }

    public Map<String,Livro> pesquisarLivrosPorAutor(String autor){

        Map<String, Livro> livrosPorAutor = new HashMap<>();

        if(!livrariaOnline.isEmpty()){

            for (Map.Entry<String,Livro> entry : livrariaOnline.entrySet()) {
                if(entry.getValue().getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.put(entry.getKey(), entry.getValue());
                }
            }

            return livrosPorAutor;

        } else {

            throw new RuntimeException("A livraria está vazia!");

        }

    }

    public Map<String,Livro> obterLivroMaisCaro(){

        Map<String,Livro> livroMaisCaroMap = new HashMap<>();
        Livro livroMaisCaro = new Livro("valor inicial","valor inicial", Double.MIN_VALUE);
        String keyDoLivroMaisCaro = null;

        if(!livrariaOnline.isEmpty()){

            for (Map.Entry<String,Livro> entry : livrariaOnline.entrySet()) {
                if(livroMaisCaro.getPreco() < entry.getValue().getPreco()){
                    livroMaisCaro = entry.getValue();
                    keyDoLivroMaisCaro = entry.getKey();
                }
            }

            livroMaisCaroMap.put(keyDoLivroMaisCaro,livroMaisCaro);

            return livroMaisCaroMap;

        } else {

            throw new RuntimeException("A livraria está vazia!");

        }

    }


    public Map<String,Livro> obterLivroMaisBarato(){

        Map<String,Livro> livroMaisBaratoMap = new HashMap<>();
        Livro livroMaisBarato = new Livro("valor inicial","valor inicial", Double.MAX_VALUE);
        String keyDoLivroMaisBarato = null;

        if(!livrariaOnline.isEmpty()){

            for (Map.Entry<String,Livro> entry : livrariaOnline.entrySet()) {
                if(livroMaisBarato.getPreco() > entry.getValue().getPreco()){
                    livroMaisBarato = entry.getValue();
                    keyDoLivroMaisBarato = entry.getKey();
                }
            }

            livroMaisBaratoMap.put(keyDoLivroMaisBarato,livroMaisBarato);
            return livroMaisBaratoMap;

        } else {

            throw new RuntimeException("A livraria está vazia!");

        }

    }



}
