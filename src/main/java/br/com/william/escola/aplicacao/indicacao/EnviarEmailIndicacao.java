package br.com.william.escola.aplicacao.indicacao;

import br.com.william.escola.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {
	
	void enviarPara(Aluno indicado);

}
