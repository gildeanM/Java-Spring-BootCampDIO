package operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> listaTarefa;

    public ListaTarefa() {
        this.listaTarefa = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        listaTarefa.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){

        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        if(!listaTarefa.isEmpty()){
            for(Tarefa tarefa : listaTarefa){
                if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                    tarefasParaRemover.add(tarefa);
                }
            }

            listaTarefa.removeAll(tarefasParaRemover);

        }else {
            System.out.println("A lista está vazia");
        }



    }

    public int obterNumeroTotalTarefas(){

        return listaTarefa.size();

    }

    public void obterDescricoesTarefas(){

        if(!listaTarefa.isEmpty()){
            System.out.println(listaTarefa);
        }else {
            System.out.println("A lista está vazia");
        }

    }



}
