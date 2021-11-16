package br.com.william.escola.dominio.aluno;

import br.com.william.escola.dominio.Evento;
import br.com.william.escola.dominio.Ouvinte;

import java.time.format.DateTimeFormatter;

public class LogAlunoMatriculado extends Ouvinte {

    @Override
    public void reageAo(Evento evento) {
        String momentoFormatado = evento.momento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        System.out.printf("Aluno com CPF: %s matriculando em: %s%n",
                ((AlunoMatriculado) evento).getCpfDoAluno().getNumero(), momentoFormatado);
    }

    @Override
    protected boolean deveProcessar(Evento evento) {
        return evento instanceof AlunoMatriculado;
    }
}
