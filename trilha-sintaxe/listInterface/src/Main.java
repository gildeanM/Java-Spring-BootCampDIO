import operacoesBasicas.CarrinhoDeCompras;
import operacoesBasicas.ListaTarefa;
import ordenacao.OrdenacaoNumeros;
import ordenacao.OrdenacaoPessoas;
import pesquisa.CatalogoLivros;
import pesquisa.SomaNumeros;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

//        ListaTarefa listaTarefa =  new ListaTarefa();
//
//        listaTarefa.adicionarTarefa("Resolver a atividade de física");
//        listaTarefa.adicionarTarefa("Resolver a atividade de redação");
//        listaTarefa.adicionarTarefa("Estudar estrutura de dados com java");
//
//        listaTarefa.removerTarefa("Resolver a atividade de física");
//        System.out.println(listaTarefa.obterNumeroTotalTarefas());
//        listaTarefa.obterDescricoesTarefas();

//        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
//
//        carrinho.adicionarItem("Arroz", 7.99, 3);
//        carrinho.adicionarItem("Feijão", 5.00, 3);
//        carrinho.adicionarItem("Cuscuz", 3.00, 6);
//
//        carrinho.removerItem("Arroz");
//
//        carrinho.exibirItens();
//        System.out.println(carrinho.calcularValorTotal());


//        CatalogoLivros catalogo = new CatalogoLivros();
//
//        catalogo.adicionarLivro("Harry Potter 1", "JK", 2002);
//        catalogo.adicionarLivro("Harry Potter 2", "JK", 2005);
//        catalogo.adicionarLivro("Harry Potter 3", "JK", 2008);
//        catalogo.adicionarLivro("Harry Potter 4", "Pedro", 2012);
//
//        System.out.println(catalogo.pesquisarPorAutor("JK"));
//        System.out.println(catalogo.pesquisarPorTitulo("Harry Potter 1"));
//        System.out.println(catalogo.pesquisarPorIntervaloAnos(2000, 2010));


//        SomaNumeros somaNumeros = new SomaNumeros();
//
//        somaNumeros.adicionarNumero(3);
//        somaNumeros.adicionarNumero(1);
//        somaNumeros.adicionarNumero(10);
//        somaNumeros.adicionarNumero(5);
//        somaNumeros.adicionarNumero(3);
//
//        somaNumeros.exibirNumeros();
//        System.out.println(somaNumeros.calcularSoma());
//        System.out.println(somaNumeros.encontrarMenorNumero());
//        System.out.println(somaNumeros.encontrarMaiorNumero());


//        OrdenacaoPessoas ordenacaoPessoas =  new OrdenacaoPessoas();
//
//        ordenacaoPessoas.adicionarPessoa("Gildean", 18, 1.76);
//        ordenacaoPessoas.adicionarPessoa("Jean", 19, 1.72);
//        ordenacaoPessoas.adicionarPessoa("Geovane", 25, 1.70);
//
//        System.out.println(ordenacaoPessoas.ordenarPorAltura());
//        System.out.println(ordenacaoPessoas.ordenarPorIdade());


        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        ordenacaoNumeros.adicionarNumeros(3);
        ordenacaoNumeros.adicionarNumeros(1);
        ordenacaoNumeros.adicionarNumeros(10);
        ordenacaoNumeros.adicionarNumeros(5);
        ordenacaoNumeros.adicionarNumeros(3);

        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println(ordenacaoNumeros.ordenarDescendente());



    }
}