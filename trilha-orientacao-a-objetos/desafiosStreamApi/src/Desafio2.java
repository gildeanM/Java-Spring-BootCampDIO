import java.util.ArrayList;
import java.util.List;

public class Desafio2 {

    private List<Integer> numeros;

    public Desafio2(List<Integer> numeros) {
        this.numeros = numeros;
    }

    public void imprimirSomaDosPares() {

        List<Integer> paresSomados = new ArrayList<>(numeros);

        int resultado = paresSomados.stream()
                .filter((num) -> num % 2 == 0)
                .reduce(0, Integer::sum);

        System.out.println(resultado);

    }


}
