public class ReprodutorMusical {

    private String musica;
    private boolean estaTocando = false;


    public void tocar(){

        if(musica != null){
            this.estaTocando = true;
            System.out.println("A musica " + musica + "está tocando!");
        }else{
            System.out.println("Uma musica precisa ser selecionada");
        }
    }

    public void pausar(){

        if(musica != null){
            this.estaTocando = false;
            System.out.println("A musica " + musica + "está pausada!");

        }else{
            System.out.println("Uma musica precisa ser selecionada");
        }
    }

    public void selecionarMusica(String musica){
        this.musica = musica;
    }


}
