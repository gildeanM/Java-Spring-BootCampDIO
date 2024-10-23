package pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> agendaContatos;

    public AgendaContatos() {
        this.agendaContatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){

        agendaContatos.add(new Contato( nome, numero ));

    }

    public void exibirContatos(){

        if(!agendaContatos.isEmpty()){

            System.out.println(agendaContatos);

        }else{

            throw new RuntimeException("O conjunto está vazio!");

        }

    }

    public Set<Contato> pesquisarPorNome(String nome){

        Set<Contato> contatosPorNome = new HashSet<>();

        if(!agendaContatos.isEmpty()){

            for (Contato c : agendaContatos) {

                if(c.getNome().startsWith(nome)){

                    contatosPorNome.add(c);

                }

            }

            return contatosPorNome;

        }else{

            throw new RuntimeException("O conjunto está vazio!");

        }

    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){

        Contato contatoAtualizado = null;

        if(!agendaContatos.isEmpty()){

            for(Contato c : agendaContatos){
                if(c.getNome().equalsIgnoreCase(nome)){
                    c.setNumero(novoNumero);
                    contatoAtualizado = c;
                    break;
                }
            }

            return contatoAtualizado;

        }else{
            throw new RuntimeException("O conjunto está vazio!");
        }

    }






}
