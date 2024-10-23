package operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> dicionario;

    public Dicionario() {
        this.dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){

        dicionario.put(palavra, definicao);

    }

    public void removerPalavra(String palavra){

        if(!dicionario.isEmpty()){

            if(dicionario.containsKey(palavra)){
                dicionario.remove(palavra);
            }else{
                System.out.println("A palavra não está no dicionario!");
            }

        }else{

            System.out.println("O dicionario está vazio!");

        }

    }


    public void exibirPalavras(){

        if(!dicionario.isEmpty()){

            System.out.println(dicionario);

        }else{

            System.out.println("O dicionario está vazio!");

        }

    }


    public String pesquisarPorPalavra(String palavra){


        if(!dicionario.isEmpty()){

            return dicionario.get(palavra);

        }else{

         throw new RuntimeException("O dicionario está vazio");

        }

    }

}
