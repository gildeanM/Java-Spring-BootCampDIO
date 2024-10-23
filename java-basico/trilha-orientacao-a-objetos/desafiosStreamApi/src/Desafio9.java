import java.util.List;

public class Desafio9 {

    private List<Integer> numeros;

    public Desafio9(List<Integer> numeros) {
        this.numeros = numeros;
    }


    public void verificarSeTodosSaoDistintos(){


        boolean todosSaoDistintos =  !(numeros.stream().distinct().toList().size() < numeros.size());


        System.out.println(todosSaoDistintos ? "Todos os números são distintos!" : "Há números repetidos!");




    }



}
