import java.util.ArrayList;
import java.util.List;

public class Desafio5 {

    private List<Integer> numeros;

    public Desafio5(List<Integer> numeros) {
        this.numeros = numeros;
    }

    public void calcularMediaDosNumerosMaioresQueCinco() {

//        List<Integer> mediaDosNumerosMaioresQueCinco = new ArrayList<>(numeros.stream().filter(num -> num > 5).toList());
        List<Integer> mediaDosNumerosMaioresQueCinco = new ArrayList<>(numeros);

//
//        double soma = mediaDosNumerosMaioresQueCinco.stream()
//                .reduce(0, Integer::sum);
//
//        double resultado = soma/mediaDosNumerosMaioresQueCinco.size();


        double resultado = mediaDosNumerosMaioresQueCinco.stream()
                .filter(num -> num > 5)
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        System.out.println(resultado);
    }

}
