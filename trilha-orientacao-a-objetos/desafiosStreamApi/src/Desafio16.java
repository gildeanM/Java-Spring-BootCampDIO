import java.util.List;

public class Desafio16 {


    private List<Integer> numeros;

    public Desafio16(List<Integer> numeros) {
        this.numeros = numeros;
    }


    public void agruparImpareEPares() {

        System.out.println("Numeros Pares: ");
        List<Integer> numerosPares = numeros.stream()
                .filter(num -> num % 2 == 0)
                .distinct()
                .toList();
        numerosPares.forEach(System.out::println);

        System.out.println("Numeros Impares: ");
        List<Integer> numerosImpares = numeros.stream()
                .filter(num -> num % 2 != 0)
                .distinct()
                .toList();
        numerosImpares.forEach(System.out::println);

    }


}
