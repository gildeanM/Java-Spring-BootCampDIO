import java.util.List;

public class Desafio19 {

    private List<Integer> numeros;

    public Desafio19(List<Integer> numeros) {
        this.numeros = numeros;
    }


    public void somaDosNumerosDivisiveisPorTresECinco(){

        int somaDosNumerosDivisiveisPorTresECinco = numeros.stream()
                .filter(num -> num % 3 == 0 && num % 5 == 0)
                .reduce(0, Integer::sum);


        System.out.println(somaDosNumerosDivisiveisPorTresECinco != 0 ? somaDosNumerosDivisiveisPorTresECinco : "Nã há números divisíveis por 3 e 5");

    }



}
