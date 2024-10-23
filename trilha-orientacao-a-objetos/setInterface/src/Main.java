import operacoesBasicas.ConjuntoConvidados;
import operacoesBasicas.ConjuntoPalavrasUnicas;
import ordenacao.CadastroProdutos;
import ordenacao.GerenciadorAlunos;
import pesquisa.AgendaContatos;
import pesquisa.ListaTarefas;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

//        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
//        conjuntoConvidados.adicionarConvidado("Gildean", 1);
//        conjuntoConvidados.adicionarConvidado("Pedro", 2);
//        conjuntoConvidados.adicionarConvidado("Afonso", 3);
//        conjuntoConvidados.adicionarConvidado("João", 4);
//
//
//        conjuntoConvidados.exibirConvidados();
//        conjuntoConvidados.removerConvidadoPorCodigoConvite(3);
//
//        System.out.println(conjuntoConvidados.contarConvidados());


//        ConjuntoPalavrasUnicas palavrasUnicas = new ConjuntoPalavrasUnicas();
//
//        palavrasUnicas.adicionarPalavra("Termoestato");
//        palavrasUnicas.adicionarPalavra("Ornitorinco");
//        palavrasUnicas.adicionarPalavra("Zuckerberg");
//        palavrasUnicas.adicionarPalavra("Gildean");
//
//        palavrasUnicas.exibirPalavrasUnicas();
//
//        palavrasUnicas.removerPalavra("Gildean");
//
//        if (!palavrasUnicas.verificarPalavra("Gildean"))
//            System.out.println("Gildean não está presente no conjunto");


//        AgendaContatos agendaContatos = new AgendaContatos();
//
//        agendaContatos.adicionarContato("Gildean", 123123312);
//        agendaContatos.adicionarContato("Alguem", 13123123);
//        agendaContatos.adicionarContato("Ninguem", 146573213);
//        agendaContatos.adicionarContato("Afonso", 125423632);
//
//        agendaContatos.exibirContatos();
//
//        System.out.println(agendaContatos.pesquisarPorNome("Gildean"));
//
//        System.out.println(agendaContatos.atualizarNumeroContato("Gildean", 998219129));


//        ListaTarefas listaTarefas = new ListaTarefas();
//
//        listaTarefas.adicionarTarefa("comprar pão");
//        listaTarefas.adicionarTarefa("lavar os pratos");
//        listaTarefas.adicionarTarefa("resolver a atividade de matematica");
//        listaTarefas.adicionarTarefa("estudar logica de programacao");
//
//        System.out.println(listaTarefas.contarTarefas());
//
//        listaTarefas.marcarTarefaConcluida("comprar pão");
//        listaTarefas.marcarTarefaConcluida("lavar os pratos");
//        listaTarefas.marcarTarefaConcluida("estudar logica de programacao");
//
//        listaTarefas.marcarTarefaPendentes("resolver a atividade de matematica");
//
//        System.out.println(listaTarefas.obterTarefasConcluidas());
//        System.out.println(listaTarefas.obterTarefasPendentes());
//
//        listaTarefas.limparListaTarefas();
//        listaTarefas.exibirTarefas();


//        CadastroProdutos cadastroProdutos = new CadastroProdutos();
//
//        cadastroProdutos.adicionarProduto(123,"Arroz",6.99,3);
//        cadastroProdutos.adicionarProduto(241,"Feijão",5.00,3);
//        cadastroProdutos.adicionarProduto(412,"Macarrão",8.00,2);
//        cadastroProdutos.adicionarProduto(542,"Cuscuz",3.00,5);
//
//        System.out.println(cadastroProdutos.exibirProdutosPorNome());
//        System.out.println(cadastroProdutos.exibirProdutosPorPreco());


        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Gildean", 4125124, 7);
        gerenciadorAlunos.adicionarAluno("Eduardo", 4121543, 9);
        gerenciadorAlunos.adicionarAluno("João Victor", 7832124, 6);
        gerenciadorAlunos.adicionarAluno("Pedro", 2141219, 5);



        gerenciadorAlunos.exibirAlunos();
        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());

        gerenciadorAlunos.removerAluno(4121543);
        gerenciadorAlunos.exibirAlunos();



















    }
}