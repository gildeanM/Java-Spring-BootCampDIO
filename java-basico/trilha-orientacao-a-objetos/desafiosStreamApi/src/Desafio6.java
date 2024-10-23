import java.util.ArrayList;
import java.util.List;

public class Desafio6 {

    private List<Integer> numeros;

    public Desafio6(List<Integer> numeros) {
        this.numeros = numeros;
    }

    public void listarNumerosMaioresQueDez() {

//        List<Integer> numerosMaioresQueDez = new ArrayList<>(numeros.stream().filter(num -> num > 10).toList());

        boolean possuiNumerosMaioresQueDez = numeros.stream().anyMatch(num -> num > 10);


//        if(!numerosMaioresQueDez.isEmpty()) {
//            numerosMaioresQueDez.forEach(num -> System.out.println(num));
//        } else {
//            System.out.println("Não há números maiores que 10");
//        }

        if (possuiNumerosMaioresQueDez) {
            System.out.println("Possui números maiores que 10");
        } else {
            System.out.println("Não há números maiores que 10");
        }


    }


}
