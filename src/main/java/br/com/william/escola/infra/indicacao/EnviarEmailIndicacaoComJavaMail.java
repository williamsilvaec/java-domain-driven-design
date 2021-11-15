package br.com.william.escola.infra.indicacao;

import br.com.william.escola.aplicacao.indicacao.EnviarEmailIndicacao;
import br.com.william.escola.dominio.aluno.Aluno;

public class EnviarEmailIndicacaoComJavaMail implements EnviarEmailIndicacao {

	@Override
	public void enviarPara(Aluno indicado) {
		// logica de envio de email com a lib Java Mail
	}
}
