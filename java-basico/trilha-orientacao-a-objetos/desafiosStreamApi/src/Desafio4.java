import java.util.ArrayList;
import java.util.List;

public class Desafio4 {

    private List<Integer> numeros;

    public Desafio4(List<Integer> numeros) {
        this.numeros = numeros;
    }

    public void removerTodosImpares() {

        List<Integer> somentePares = null;

        somentePares = numeros.stream()
                .filter((num) -> num % 2 == 0)
                .toList();


        somentePares.forEach(System.out::println);

    }


}
