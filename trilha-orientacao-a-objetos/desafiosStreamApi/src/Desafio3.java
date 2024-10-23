import java.util.ArrayList;
import java.util.List;

public class Desafio3 {

    private List<Integer> numeros;

    public Desafio3(List<Integer> numeros) {
        this.numeros = numeros;
    }

    public void imprimirNumerosPositivos() {

        List<Integer> numerosPositivos = new ArrayList<>(numeros);

        numerosPositivos.stream()
                .filter((num) -> num > 0)
                .forEach(System.out::println);


    }



}
