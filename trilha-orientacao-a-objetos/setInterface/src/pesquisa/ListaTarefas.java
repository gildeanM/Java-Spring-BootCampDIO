package pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> listaTarefas;

    public ListaTarefas() {
        this.listaTarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){

        listaTarefas.add(new Tarefa(descricao));

    }

    public void removerTarefa(String descricao){

        Tarefa tarefaParaRemover = null;

        if(!listaTarefas.isEmpty()){

            for ( Tarefa t : listaTarefas) {
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaParaRemover = t;
                    break;
                }
            }

            listaTarefas.remove(tarefaParaRemover);

        }else{

            throw new RuntimeException("O conjunto está vazio!");

        }

    }

    public void exibirTarefas(){

        if(!listaTarefas.isEmpty()){

            System.out.println(listaTarefas);

        }else{

            System.out.println("Não há tarefas no conjunto");

        }

    }


    public int contarTarefas(){

        return listaTarefas.size();

    }

    public Set<Tarefa> obterTarefasConcluidas(){

        Set<Tarefa> tarefasConcluidas = new HashSet<>();

        if(!listaTarefas.isEmpty()){

            for (Tarefa t : listaTarefas) {
                if(t.isConcluida()){
                    tarefasConcluidas.add(t);
                }
            }

            return tarefasConcluidas;

        }else{

            throw new RuntimeException("O conjunto está vazio!");

        }

    }

    public Set<Tarefa> obterTarefasPendentes(){

        Set<Tarefa> tarefasPendentes = new HashSet<>();

        if(!listaTarefas.isEmpty()){

            for (Tarefa t : listaTarefas) {
                if(!t.isConcluida()){
                    tarefasPendentes.add(t);
                }
            }

            return tarefasPendentes;

        }else{

            throw new RuntimeException("O conjunto está vazio!");

        }

    }


    public void marcarTarefaConcluida(String descricao){

        if(!listaTarefas.isEmpty()){

            for (Tarefa t : listaTarefas) {
                if(t.getDescricao().equalsIgnoreCase(descricao) && !t.isConcluida()){
                    t.setConcluida(true);
                }
            }

        }else{

            throw new RuntimeException("O conjunto está vazio!");

        }


    }

    public void marcarTarefaPendentes(String descricao){

        if(!listaTarefas.isEmpty()){

            for (Tarefa t : listaTarefas) {
                if(t.getDescricao().equalsIgnoreCase(descricao) && t.isConcluida()){
                    t.setConcluida(false);
                }
            }

        }else{

            throw new RuntimeException("O conjunto está vazio!");

        }


    }


    public void limparListaTarefas(){

        Set<Tarefa>  tarefasParaRemover = new HashSet<>(listaTarefas);

        if(!listaTarefas.isEmpty()){

            listaTarefas.removeAll(tarefasParaRemover);

        }else{

            System.out.println("O conjunto já está vazio!");

        }

    }


}

