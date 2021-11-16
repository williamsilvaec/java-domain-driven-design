package br.com.william.escola.aplicacao.aluno.matricular;

import br.com.william.escola.dominio.PublicadorDeEventos;
import br.com.william.escola.dominio.aluno.Aluno;
import br.com.william.escola.dominio.aluno.CPF;
import br.com.william.escola.dominio.aluno.LogAlunoMatriculado;
import br.com.william.escola.infra.aluno.RepositorioDeAlunosEmMemoria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MatricularAlunoTest {

	@Test
	void alunoDeveriaSerPersistido() {
		// MOCK -> Mockito
		RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();
		PublicadorDeEventos publicador = new PublicadorDeEventos();
		publicador.adicionar(new LogAlunoMatriculado());
		MatricularAluno useCase = new MatricularAluno(repositorio, publicador);
		
		MatricularAlunoDto dados = new MatricularAlunoDto(
				"Fulano", 
				"123.456.789-00", 
				"fulano@email.com");
		useCase.executa(dados);
		
		Aluno encontrado = repositorio.buscarPorCPF(
				new CPF("123.456.789-00"));
		
		assertEquals("Fulano", encontrado.getNome());
		assertEquals("123.456.789-00", encontrado.getCpf());
		assertEquals("fulano@email.com", encontrado.getEmail());
	}

}
