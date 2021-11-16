package br.com.william.escola.gamificacao.dominio.selo;

import br.com.william.escola.academico.dominio.aluno.CPF;

import java.util.List;

public interface RepositorioDeSelos {

    void adicionar(Selo selo);

    List<Selo> selosDoAlunoDeCPF(CPF cpf);
}
