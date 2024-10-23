package pesquisa;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private Map<String,Integer> contagemPalavras;

    public ContagemPalavras() {
        this.contagemPalavras = new HashMap<>();
    }

    public void adicionarPalavras(String palavra, Integer contagem){

        contagemPalavras.put(palavra, contagem);

    }

    public void removerPalavra(String palavra){

        if(!contagemPalavras.isEmpty()){

            if(contagemPalavras.containsKey(palavra)){
                contagemPalavras.remove(palavra);
            }else{
                System.out.println("A palavra não está na contagem!");
            }

        }else{

            System.out.println("A contagem está vazia!");

        }

    }


    public int exibirContagemPalavras(){

        if(!contagemPalavras.isEmpty()){

            int contagemTotal = 0;

            for (int contagem : contagemPalavras.values()) {
                contagemTotal += contagem;
            }
            return contagemTotal;

        }else{

            throw new RuntimeException("A contagem está vazia!");

        }

    }


    public String encontrarPalavrasMaisFrequente(){

        String palavraMaisFrequente = null;
        int contagemMaisFrenquente = Integer.MIN_VALUE;

        if(!contagemPalavras.isEmpty()){

            for (Map.Entry<String,Integer> contagem : contagemPalavras.entrySet() ) {
                if(contagemMaisFrenquente < contagem.getValue()){
                    contagemMaisFrenquente = contagem.getValue();
                    palavraMaisFrequente = contagem.getKey();
                }
            }

            return palavraMaisFrequente;

        }else{

            throw new RuntimeException("A contagem está vazia!");

        }

    }

}
