package br.com.william.escola.shared.dominio.evento;

import java.time.LocalDateTime;
import java.util.Map;

public interface Evento {

    LocalDateTime momento();

    TipoEvento tipo();

    Map<String, Object> informacoes();
}
