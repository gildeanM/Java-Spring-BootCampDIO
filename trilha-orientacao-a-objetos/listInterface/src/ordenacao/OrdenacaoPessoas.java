package ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> pessoasLista;

    public OrdenacaoPessoas() {
        this.pessoasLista = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, Double altura){
        pessoasLista.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoasLista);

        if(!pessoasLista.isEmpty()){
            Collections.sort(pessoasPorIdade);
            return pessoasPorIdade;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }

    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoasLista);

        if(!pessoasLista.isEmpty()){
            Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
            return pessoasPorAltura;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }

    }


}
