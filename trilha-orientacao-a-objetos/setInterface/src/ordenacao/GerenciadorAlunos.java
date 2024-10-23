package ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double media) {

        alunoSet.add(new Aluno(nome, matricula, media));

    }

    public void removerAluno(long matricula) {

        Aluno alunoParaRemover = null;

        if (!alunoSet.isEmpty()) {

            for (Aluno al : alunoSet) {
                if (al.getMatricula() == matricula) {
                    alunoParaRemover = al;
                    break;
                }
            }

            alunoSet.remove(alunoParaRemover);

        } else {

            System.out.println("O aluno não está no conjunto");

        }

    }


    public Set<Aluno> exibirAlunosPorNome() {

        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);

        if (!alunoSet.isEmpty()) {

            return alunosPorNome;

        } else {

            throw new RuntimeException("O conjunto está vazio");

        }

    }

    public Set<Aluno> exibirAlunosPorNota() {

        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());

        if (!alunoSet.isEmpty()) {

            alunosPorNota.addAll(alunoSet);
            return alunosPorNota;

        } else {

            throw new RuntimeException("O conjunto está vazio");

        }

    }


    public void exibirAlunos() {

        if (!alunoSet.isEmpty()) {

            System.out.println(alunoSet);

        } else {

            throw new RuntimeException("O conjunto está vazio");

        }

    }


}
