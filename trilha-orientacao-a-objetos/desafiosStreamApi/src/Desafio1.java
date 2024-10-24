
import java.util.ArrayList;
import java.util.List;

public class Desafio1 {

    private List<Integer> numeros;

    public Desafio1(List<Integer> numeros) {
        this.numeros = numeros;
    }

    public void listarEmOrdemNumerica() {

        List<Integer> listaOrdenada = new ArrayList<>(numeros);

        listaOrdenada.stream()
                .sorted((num1, num2) -> Double.compare(num1, num2))
                .forEach(System.out::println);

    }

}
