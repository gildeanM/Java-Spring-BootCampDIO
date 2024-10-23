import java.util.List;

public class Desafio18 {

    private List<Integer> numeros;

    public Desafio18(List<Integer> numeros) {
        this.numeros = numeros;
    }


    public void verificarSeTodosSaoIguais(){

//        boolean todoSaoIguais = numeros.stream().distinct().toList().size() == 1;

        boolean todoSaoIguais = numeros.stream().allMatch(num -> num.equals(numeros.get(0)));


        System.out.println(todoSaoIguais ? "Todos os números da lista são iguais" : "Há números diferentes");


    }



}
