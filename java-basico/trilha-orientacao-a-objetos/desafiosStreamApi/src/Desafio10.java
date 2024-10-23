import java.util.List;

public class Desafio10 {

    private List<Integer> numeros;

    public Desafio10(List<Integer> numeros) {
        this.numeros = numeros;
    }


    public void agruparImparesMultiplosDeTresECinco() {

        List<Integer> numerosImparesMultiplosDeTresECinco = numeros.stream()
                .filter(num -> num % 2 != 0 && (num % 3 == 0 || num % 5 == 0))
                .distinct()
                .toList();


        System.out.println(numerosImparesMultiplosDeTresECinco.isEmpty() ? "Não há números impares múltiplos de 3 e 5" : numerosImparesMultiplosDeTresECinco);


    }


}
