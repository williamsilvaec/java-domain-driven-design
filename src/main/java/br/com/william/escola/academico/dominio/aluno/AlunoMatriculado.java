package br.com.william.escola.academico.dominio.aluno;

import br.com.william.escola.academico.dominio.Evento;

import java.time.LocalDateTime;

public class AlunoMatriculado implements Evento {

    private final CPF cpfDoAluno;
    private final LocalDateTime momento;

    public AlunoMatriculado(CPF cpfDoAluno) {
        this.cpfDoAluno = cpfDoAluno;
        this.momento = LocalDateTime.now();
    }

    @Override
    public LocalDateTime momento() {
        return momento;
    }

    public CPF getCpfDoAluno() {
        return cpfDoAluno;
    }
}
