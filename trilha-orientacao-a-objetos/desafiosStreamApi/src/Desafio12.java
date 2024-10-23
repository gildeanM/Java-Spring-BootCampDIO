import java.util.List;

public class Desafio12 {


    private List<Integer> numeros;

    public Desafio12(List<Integer> numeros) {
        this.numeros = numeros;
    }


    public void multiplicarTodosOsNumeros() {


        int produtoDeTodosOsNumeros = numeros.stream()
                .reduce(1, (num1, num2) -> num1 * num2);


        System.out.println(produtoDeTodosOsNumeros);

    }


}
