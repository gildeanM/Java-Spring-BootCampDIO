import java.util.List;
import java.util.function.Predicate;

public class Desafio17 {

    private List<Integer> numeros;

    public Desafio17(List<Integer> numeros) {
        this.numeros = numeros;
    }

    private Predicate<Integer> ePrimo = (Integer num) -> {

        if (num < 2) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;

    };


    public void filtrarPrimos() {


        List<Integer> numerosPrimo = numeros.stream()
                .filter(ePrimo)
                .distinct()
                .toList();


        System.out.println(numerosPrimo.isEmpty() ? "Não há números primos" : numerosPrimo);


    }


}
