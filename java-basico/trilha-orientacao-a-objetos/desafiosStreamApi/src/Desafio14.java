import java.util.List;
import java.util.function.Predicate;


public class Desafio14 {

    private List<Integer> numeros;

    public Desafio14(List<Integer> numeros) {
        this.numeros = numeros;
    }

    Predicate<Integer> ePrimo  = (Integer num) -> {

        if (num < 2) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0){
                return false;
            }
        }

        return true;

    };

    public void encontrarMaiorNumeroPrimo(){


        int maiorNumeroPrimo = numeros.stream()
                .filter(ePrimo)
                .mapToInt(Integer::intValue)
                .max()
                .orElse(0);

        System.out.println(maiorNumeroPrimo != 0 ? maiorNumeroPrimo : "Não há número primo!");


    }


}
