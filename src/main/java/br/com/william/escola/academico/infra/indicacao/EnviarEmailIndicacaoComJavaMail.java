package br.com.william.escola.academico.infra.indicacao;

import br.com.william.escola.academico.aplicacao.indicacao.EnviarEmailIndicacao;
import br.com.william.escola.academico.dominio.aluno.Aluno;

public class EnviarEmailIndicacaoComJavaMail implements EnviarEmailIndicacao {

	@Override
	public void enviarPara(Aluno indicado) {
		// logica de envio de email com a lib Java Mail
	}
}
