package ordenacao;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class AgendaEventos {

    private Map<LocalDate,Evento> agenda;

    public AgendaEventos() {
        this.agenda = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){

        agenda.put(data, new Evento(nome, atracao));

    }

    public void exibirAgenda(){

        if(!agenda.isEmpty()){

            System.out.println(agenda);

        }else{

            System.out.println("A agenda está vazia!");

        }

    }

    public void obterProximoEvento(){

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;

        for (Map.Entry<LocalDate,Evento> entry : agenda.entrySet()) {

            LocalDate dataEvento = entry.getKey();

            if(dataEvento.equals(dataAtual) || dataEvento.isAfter(dataAtual)){
                proximaData = dataEvento;
                proximoEvento = entry.getValue();
                break;
            }

        }

        if(proximoEvento != null){
            System.out.println("O próximo evento: " + proximoEvento.getNome() + " acontecerá na data " + proximaData);
        } else {
            System.out.println("Não há eventos futuros na agenda.");
        }

    }




}
