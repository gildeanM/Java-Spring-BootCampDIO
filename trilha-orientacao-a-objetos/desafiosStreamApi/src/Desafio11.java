import java.util.List;

public class Desafio11 {

    private List<Integer> numeros;

    public Desafio11(List<Integer> numeros) {
        this.numeros = numeros;
    }


    public void somarOsQuadrados() {

        int somaDosQuadrados = numeros.stream()
                .map(num -> num *= num)
                .reduce(0, (num1, num2) -> num1 + num2);

        System.out.println(somaDosQuadrados);


    }


}
