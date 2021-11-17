package br.com.william.escola.gamificacao.dominio.selo;

import br.com.william.escola.shared.dominio.CPF;

public class Selo {

    private final CPF cpfDoAluno;
    private final String nome;

    public Selo(CPF cpfDoAluno, String nome) {
        this.cpfDoAluno = cpfDoAluno;
        this.nome = nome;
    }

    public CPF getCpfDoAluno() {
        return cpfDoAluno;
    }

    public String getNome() {
        return nome;
    }
}
