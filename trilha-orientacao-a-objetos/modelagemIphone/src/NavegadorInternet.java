public class NavegadorInternet {


    public void exibirPagina(String url){
        if(url != null){
            System.out.println("A pagina " + url +" está sendo exibida!");
        }else {
            throw new RuntimeException("Uma url precisa ser definida!");
        }
    }


    public void adicionarNovaAba(){
        System.out.println("Uma nova aba foi adicionada!");
    }

    public void atualizarPagina(){
        System.out.println("A pagina foi atualizada");
    }


}
