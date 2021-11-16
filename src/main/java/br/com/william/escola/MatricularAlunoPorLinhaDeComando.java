package br.com.william.escola;

import br.com.william.escola.academico.aplicacao.aluno.matricular.MatricularAluno;
import br.com.william.escola.academico.aplicacao.aluno.matricular.MatricularAlunoDto;
import br.com.william.escola.academico.dominio.PublicadorDeEventos;
import br.com.william.escola.academico.dominio.aluno.LogAlunoMatriculado;
import br.com.william.escola.academico.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoPorLinhaDeComando {
	
	public static void main(String[] args) {
		String nome = "Fulano da Silva";
		String cpf = "123.456.789-00";
		String email = "fulano@email.com";

		PublicadorDeEventos publicador = new PublicadorDeEventos();
		publicador.adicionar(new LogAlunoMatriculado());
		
		MatricularAluno matricular = new MatricularAluno(new RepositorioDeAlunosEmMemoria(), publicador);
		matricular.executa(
				new MatricularAlunoDto(nome, 
						cpf, 
						email));
	}

}
