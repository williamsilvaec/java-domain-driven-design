package br.com.william.escola.academico.aplicacao.aluno.matricular;

import br.com.william.escola.shared.dominio.evento.PublicadorDeEventos;
import br.com.william.escola.academico.dominio.aluno.Aluno;
import br.com.william.escola.academico.dominio.aluno.AlunoMatriculado;
import br.com.william.escola.academico.dominio.aluno.RepositorioDeAlunos;

public class MatricularAluno {
	
	private final RepositorioDeAlunos repositorio;
	private final PublicadorDeEventos publicador;

	public MatricularAluno(RepositorioDeAlunos repositorio, PublicadorDeEventos publicador) {
		this.repositorio = repositorio;
		this.publicador = publicador;
	}
	
	// COMMAND
	public void executa(MatricularAlunoDto dados) {
		Aluno novo = dados.criarAluno();
		repositorio.matricular(novo);

		AlunoMatriculado alunoMatriculado = new AlunoMatriculado(novo.getCpf());
		publicador.publicar(alunoMatriculado);
	}

}
