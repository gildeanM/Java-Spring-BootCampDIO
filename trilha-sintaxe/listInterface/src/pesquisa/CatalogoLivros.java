package pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livroLista;

    public CatalogoLivros() {
        this.livroLista = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){

        livroLista.add(new Livro(titulo, autor, anoPublicacao));

    }

    public List<Livro> pesquisarPorAutor(String autor){

        List<Livro> livrosPorAutor = new ArrayList<>();

        for(Livro l : livroLista){
            if(l.getAutor().equalsIgnoreCase(autor)){
                livrosPorAutor.add(l);
            }
        }

        return livrosPorAutor;

    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();

        for(Livro l : livroLista){
            if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                livrosPorIntervaloAnos.add(l);
            }
        }

        return livrosPorIntervaloAnos;
    }

    public List<Livro> pesquisarPorTitulo(String titulo){
        List<Livro> livrosPorTitulo = new ArrayList<>();

        for(Livro l : livroLista){
            if(l.getTitulo().contains(titulo)){
                livrosPorTitulo.add(l);
            }
        }

        return livrosPorTitulo;
    }


}
