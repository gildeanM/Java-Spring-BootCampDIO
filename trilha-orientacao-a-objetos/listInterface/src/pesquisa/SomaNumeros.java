package pesquisa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomaNumeros {

    private List<Integer> numerosLista;

    public SomaNumeros() {
        this.numerosLista = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numerosLista.add(numero);
    }

    public int calcularSoma(){
        int resultadoSoma = 0;
        if(!numerosLista.isEmpty()){
            for(Integer i : numerosLista){
                resultadoSoma += i;
            }
        }else {
            System.out.println("A lista está vazia");
        }
        return resultadoSoma;
    }

    public int encontrarMaiorNumero(){

        int maiorNumero = Integer.MIN_VALUE;

        if(!numerosLista.isEmpty()){
            for(int num : numerosLista){
                if(maiorNumero < num){
                    maiorNumero = num;
                }
            }

        }else{
            System.out.println("A lista está vazia!");
        }

        return maiorNumero;

    }

    public int encontrarMenorNumero(){

        int menorNumero = Integer.MAX_VALUE;

        if(!numerosLista.isEmpty()){
            for(int num : numerosLista){
                if(menorNumero > num){
                    menorNumero = num;
                }
            }

        }else{
            System.out.println("A lista está vazia!");
        }

        return menorNumero;

    }

    public void exibirNumeros(){
        if(!numerosLista.isEmpty()){
            System.out.println(numerosLista);
        }else{
            System.out.println("A lista está vazia!");
        }
    }


}
