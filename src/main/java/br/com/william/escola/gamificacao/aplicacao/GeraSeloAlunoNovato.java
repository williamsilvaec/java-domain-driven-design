package br.com.william.escola.gamificacao.aplicacao;

import br.com.william.escola.gamificacao.dominio.selo.RepositorioDeSelos;
import br.com.william.escola.gamificacao.dominio.selo.Selo;
import br.com.william.escola.shared.dominio.CPF;
import br.com.william.escola.shared.dominio.evento.Evento;
import br.com.william.escola.shared.dominio.evento.Ouvinte;
import br.com.william.escola.shared.dominio.evento.TipoEvento;

public class GeraSeloAlunoNovato extends Ouvinte {

    private final RepositorioDeSelos repositorioDeSelos;

    public GeraSeloAlunoNovato(RepositorioDeSelos repositorioDeSelos) {
        this.repositorioDeSelos = repositorioDeSelos;
    }

    @Override
    protected void reageAo(Evento evento) {
        CPF cpf = (CPF) evento.informacoes().get("cpf");
        Selo novato = new Selo(cpf, "novato");
        repositorioDeSelos.adicionar(novato);
    }

    @Override
    protected boolean deveProcessar(Evento evento) {
        return evento.tipo() == TipoEvento.ALUNO_MATRICULADO;
    }
}
