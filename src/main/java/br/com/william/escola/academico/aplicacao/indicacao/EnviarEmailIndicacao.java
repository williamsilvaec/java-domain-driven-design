package br.com.william.escola.academico.aplicacao.indicacao;

import br.com.william.escola.academico.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {
	
	void enviarPara(Aluno indicado);

}
