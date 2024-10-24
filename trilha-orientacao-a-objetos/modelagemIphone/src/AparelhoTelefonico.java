import java.util.*;

public class AparelhoTelefonico {

    private boolean estaEmLigacao;
    private List<String> ultimasChamadas = new ArrayList<>();
    private Map<String, String> mensagemDeVoz = new HashMap<>();
    private Scanner scanner = new Scanner()


    public void ligar(String numero) {
        this.ultimasChamadas.add(numero);
        System.out.println("Ligando para ".concat(numero));
    }

    public void atender() {
        String numero = this.ultimasChamadas.get(this.ultimasChamadas.size() - 1);
        if(numero != null){
            this.estaEmLigacao = true;
            System.out.println("Você está em ligação com ".concat(numero));
        }else{
            throw new RuntimeException("Não há número nesta ligação");
        }

    }

    public void desligar() {
        String numero = this.ultimasChamadas.get(this.ultimasChamadas.size() - 1);
        if(numero != null){
            this.estaEmLigacao = false;
            System.out.println("Você finalizou sua ligação com ".concat(numero));
        }else{
            throw new RuntimeException("Não há número nesta ligação");
        }

    }

    public void iniciarCorreioVoz(){
        if(!this.estaEmLigacao){
            String numero = this.ultimasChamadas.get(this.ultimasChamadas.size() - 1);
            String mensagem = scanner.nextLine();
            this.mensagemDeVoz.put(numero,mensagem);
        }else {
            throw new RuntimeException("Você não pode enviar um correio em uma ligação!");
        }
    }



}
