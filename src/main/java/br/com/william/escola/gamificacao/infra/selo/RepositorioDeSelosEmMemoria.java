package br.com.william.escola.gamificacao.infra.selo;

import br.com.william.escola.academico.dominio.aluno.CPF;
import br.com.william.escola.gamificacao.dominio.selo.RepositorioDeSelos;
import br.com.william.escola.gamificacao.dominio.selo.Selo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RepositorioDeSelosEmMemoria implements RepositorioDeSelos {

    List<Selo> selos = new ArrayList<>();

    @Override
    public void adicionar(Selo selo) {
        this.selos.add(selo);
    }

    @Override
    public List<Selo> selosDoAlunoDeCPF(CPF cpf) {
        return selos.stream()
                .filter(selo -> cpf.equals(selo.getCpfDoAluno()))
                .collect(Collectors.toList());
    }
}
