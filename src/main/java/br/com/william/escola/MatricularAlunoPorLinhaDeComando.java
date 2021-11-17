package br.com.william.escola;

import br.com.william.escola.academico.aplicacao.aluno.matricular.MatricularAluno;
import br.com.william.escola.academico.aplicacao.aluno.matricular.MatricularAlunoDto;
import br.com.william.escola.gamificacao.aplicacao.GeraSeloAlunoNovato;
import br.com.william.escola.gamificacao.infra.selo.RepositorioDeSelosEmMemoria;
import br.com.william.escola.shared.dominio.evento.PublicadorDeEventos;
import br.com.william.escola.academico.dominio.aluno.LogAlunoMatriculado;
import br.com.william.escola.academico.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoPorLinhaDeComando {
	
	public static void main(String[] args) {
		String nome = "Fulano da Silva";
		String cpf = "123.456.789-00";
		String email = "fulano@email.com";

		PublicadorDeEventos publicador = new PublicadorDeEventos();
		publicador.adicionar(new LogAlunoMatriculado());
		publicador.adicionar(new GeraSeloAlunoNovato(new RepositorioDeSelosEmMemoria()));
		
		MatricularAluno matricular = new MatricularAluno(new RepositorioDeAlunosEmMemoria(), publicador);
		matricular.executa(
				new MatricularAlunoDto(nome, 
						cpf, 
						email));
	}

}
