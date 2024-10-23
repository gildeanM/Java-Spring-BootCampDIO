import operacoesBasicas.AgendaContatos;
import operacoesBasicas.Dicionario;
import ordenacao.AgendaEventos;
import ordenacao.LivrariaOnline;
import ordenacao.Livro;
import pesquisa.ContagemPalavras;
import pesquisa.EstoqueProdutos;
import pesquisa.Produto;

import java.time.LocalDate;
import java.time.Month;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


//        AgendaContatos agendaContatos = new AgendaContatos();
//
//        agendaContatos.adicionarContato("Jean", 91912332);
//        agendaContatos.adicionarContato("Gildean", 94112151);
//        agendaContatos.adicionarContato("Geovane", 12487124);
//        agendaContatos.adicionarContato("Alguem", 12321942);
//
//
//        agendaContatos.exibirContatos();
//
//        agendaContatos.removerContato("Alguem");
//
//        System.out.println(agendaContatos.pesquisarPorNome("Alguem"));


//        Dicionario dicionario = new Dicionario();
//
//        dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
//        dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
//        dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");
//
//        dicionario.exibirPalavras();
//
//        String definicaoJava = dicionario.pesquisarPorPalavra("java");
//        System.out.println("Definição da linguagem 'java': " + definicaoJava);
//
//        String definicaoCSharp = dicionario.pesquisarPorPalavra("csharp");
//        System.out.println(definicaoCSharp);
//
//        dicionario.removerPalavra("typescript");
//        dicionario.exibirPalavras();


//        EstoqueProdutos estoque = new EstoqueProdutos();
//
//        estoque.exibirProdutos();
//
//        estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
//        estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
//        estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
//        estoque.adicionarProduto(4L, "Teclado", 2, 40.0);
//
//        estoque.exibirProdutos();
//
//        System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());
//
//        Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
//        System.out.println("Produto mais caro: " + produtoMaisCaro);
//
//        Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
//        System.out.println("Produto mais barato: " + produtoMaisBarato);
//
//        Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
//        System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);


//        ContagemPalavras contagemLinguagens = new ContagemPalavras();
//
//        // Adiciona linguagens e suas contagens
//        contagemLinguagens.adicionarPalavras("Java", 2);
//        contagemLinguagens.adicionarPalavras("Python", 8);
//        contagemLinguagens.adicionarPalavras("JavaScript", 1);
//        contagemLinguagens.adicionarPalavras("C#", 6);
//
//        // Exibe a contagem total de linguagens
//        System.out.println("Existem " + contagemLinguagens.exibirContagemPalavras() + " palavras.");
//
//        // Encontra e exibe a linguagem mais frequente
//        String linguagemMaisFrequente = contagemLinguagens.encontrarPalavrasMaisFrequente();
//        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);


//        AgendaEventos agendaEventos = new AgendaEventos();
//
//        // Adiciona eventos à agenda
//        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Conferência de Tecnologia", "Palestrante renomado");
//        agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Workshop de Programação", "Aula prática de desenvolvimento");
//        agendaEventos.adicionarEvento(LocalDate.of(2000, 1, 10), "Lançamento de Software", "Demonstração da nova versão");
//        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 28), "Hackathon de Inovação", "Competição de soluções criativas");
//        agendaEventos.adicionarEvento(LocalDate.of(2024, 10, 20), "Seminário de Inteligência Artificial", "Discussão sobre IA avançada");
//
//        // Exibe a agenda completa de eventos
//        agendaEventos.exibirAgenda();
//
//        // Obtém e exibe o próximo evento na agenda
//        agendaEventos.obterProximoEvento();


        LivrariaOnline livrariaOnline = new LivrariaOnline();

        livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z", "1984", "George Orwell", 50d);
        livrariaOnline.adicionarLivro("https://amzn.to/47Umiun", "A Revolução dos Bichos", "George Orwell", 7.05d);
        livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6", "Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d);
        livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk", "Malorie", "Josh Malerman", 5d);
        livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L", "E Não Sobrou Nenhum", "Agatha Christie", 50d);
        livrariaOnline.adicionarLivro("https://amzn.to/45u86q4", "Assassinato no Expresso do Oriente", "Agatha Christie", 5d);

        System.out.println("Livros ordenados por preço: \n" + livrariaOnline.exibirLivrosOrdenadosPorPreco());

        System.out.println("Livros ordenados por autor: \n" + livrariaOnline.exibirLivrosOrdenadosPorAutor());

        String autorPesquisa = "Josh Malerman";
        livrariaOnline.pesquisarLivrosPorAutor(autorPesquisa);

        System.out.println("Livro mais caro: " + livrariaOnline.obterLivroMaisCaro());

        System.out.println("Livro mais barato: " + livrariaOnline.obterLivroMaisBarato());

        livrariaOnline.removerLivro("1984");
        livrariaOnline.exibirLivros();



    }
}