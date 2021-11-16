package br.com.william.escola.academico.dominio;

import java.util.ArrayList;
import java.util.List;

public class PublicadorDeEventos {

    private final List<Ouvinte> ouvintes = new ArrayList<>();

    public void adicionar(Ouvinte ouvinte) {
        this.ouvintes.add(ouvinte);
    }

    public void publicar(Evento evento) {
        this.ouvintes.forEach(ouvinte -> ouvinte.processa(evento));
    }
}