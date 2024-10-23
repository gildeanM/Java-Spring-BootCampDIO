import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Desafio8 {

    private List<Integer> numeros;

    public Desafio8(List<Integer> numeros) {
        this.numeros = numeros;
    }


    public void somarDigitos() {

        /*ChatGPt*/
        int digitosSomados = numeros.stream()
                .map(String::valueOf)
                .flatMapToInt(num -> num.chars())
                .map(Character::getNumericValue)
                .sum();


        System.out.println(digitosSomados);


    }


}
