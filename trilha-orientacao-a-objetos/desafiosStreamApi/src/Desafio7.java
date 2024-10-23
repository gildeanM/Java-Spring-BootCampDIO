import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Desafio7 {

    private List<Integer> numeros;

    public Desafio7(List<Integer> numeros) {
        this.numeros = numeros;
    }


    public void encontrarSegundoNumeroMaior() {

//        List<Integer> numerosMaiores = new ArrayList<>(numeros.stream().sorted().toList());
//
//
//        int segundoNumeroMaior = numerosMaiores.get(numerosMaiores.size() - 2);

        Optional<Integer> segundoNumeroMaior = numeros.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        System.out.println(segundoNumeroMaior.get());


    }


}
