import java.util.List;

public class Desafio13 {

    private List<Integer> numeros;

    public Desafio13(List<Integer> numeros) {
        this.numeros = numeros;
    }


    public void filtrarNumerosPorIntervalo(int primeiro, int ultimo) {

        if ( primeiro >= ultimo )
            throw new RuntimeException("O primeiro valor do intervalo não pode ser maior ou igual ao ultimo numero do intervalo!");

        List<Integer> numerosPorIntervalo = numeros.stream()
                .filter(num -> num > primeiro && num < ultimo)
                .distinct()
                .toList();


        System.out.println(numerosPorIntervalo.isEmpty() ? "Nã há números nesse intervalo!" : numerosPorIntervalo);

    }


}
