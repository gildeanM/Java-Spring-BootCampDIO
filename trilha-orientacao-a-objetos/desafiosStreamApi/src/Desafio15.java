import java.util.List;

public class Desafio15 {

    private List<Integer> numeros;

    public Desafio15(List<Integer> numeros) {
        this.numeros = numeros;
    }


    public void contemNumeroNegativo(){

        boolean contemNumeroNegativo = numeros.stream().anyMatch(num -> num < 0);

        System.out.println(contemNumeroNegativo ? "Contém número negativo" : "Não contém número negativo");


    }





}
