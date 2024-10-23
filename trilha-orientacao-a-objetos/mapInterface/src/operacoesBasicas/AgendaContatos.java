package operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String,Integer> contatoMap;

    public AgendaContatos() {
        this.contatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        contatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){

        if(!contatoMap.isEmpty()){

            contatoMap.remove(nome);

        }else{

            System.out.println("A lista está vazia!");

        }

    }

    public void exibirContatos(){

        if(!contatoMap.isEmpty()){

            System.out.println(contatoMap);

        }else{

            System.out.println("A lista está vazia!");

        }

    }

    public Integer pesquisarPorNome(String nome){

        if(!contatoMap.isEmpty()){

            if(contatoMap.containsKey(nome)){

                return contatoMap.get(nome);

            }else {
                throw new RuntimeException("Este contato não está na lista!");
            }

        }else{

            throw new RuntimeException("A lista está vazia!");

        }

    }




}
