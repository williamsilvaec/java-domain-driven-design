package br.com.william.escola.academico.dominio.aluno;

import br.com.william.escola.shared.dominio.CPF;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AlunoTest {

    private Aluno aluno;

    @BeforeEach
    void beforeEach() {
        this.aluno = new Aluno(
                new CPF("023.123.448-89"),
                "Fulano de tal",
                new Email("fulano@mail.com"));
    }

    @Test
    void deveriaPermitirAdicionarUmTelefone() {
        this.aluno.adicionarTelefone("11", "123987476");
        Assertions.assertEquals(1, this.aluno.getTelefones().size());
    }

    @Test
    void deveriaPermitirAdicionarDoisTelefones() {
        this.aluno.adicionarTelefone("11", "123908651");
        this.aluno.adicionarTelefone("11", "123908641");
        Assertions.assertEquals(2, this.aluno.getTelefones().size());
    }

    @Test
    void naoDeveriaAdicionarTresOuMaisTelefones() {
        Assertions.assertThrows(NumeroMaximoDeTelefonesAtingido.class, () -> {
            this.aluno.adicionarTelefone("11", "123908651");
            this.aluno.adicionarTelefone("11", "123908641");
            this.aluno.adicionarTelefone("11", "1235408641");
        });
    }
}
