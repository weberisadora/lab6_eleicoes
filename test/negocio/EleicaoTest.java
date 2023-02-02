package negocio;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import java.util.ArrayList;
import java.util.List;

class EleicaoTest {
    static List<Candidato> candidatos;
    static Eleicao eleicao;
    static Candidato candidato1;
    static Candidato candidato2;

    @BeforeAll
    static void beforeAll() {
        candidato1 = new Candidato("Candidato1", "Exemplo", 1, 1);
        candidato2 = new Candidato("Candidato2", "Exemplo", 2, 2);
        candidatos = new ArrayList<>();
        candidatos.add(candidato1);
        candidatos.add(candidato2);
        eleicao = new Eleicao(candidatos);
    }
    @Test
    void calculaTotalDeVotos() {
        assertEquals(3, eleicao.calculaTotalDeVotos());
    }

    @Test
    void calculaMediaDeVotos() {
        assertEquals(1.5, eleicao.calculaMediaDeVotos());
    }

    @Test
    void retornaCandidatoMaisJovem() {
        assertEquals(candidato1, eleicao.retornaCandidatoMaisJovem());
    }

    @Test
    void retornaCandidatoMaisVelho() {
        assertEquals(candidato2, eleicao.retornaCandidatoMaisVelho());
    }

    @Test
    void retornaCandidatoMaisVotado() {
        assertEquals(candidato2, eleicao.retornaCandidatoMaisVotado());
    }

    @Test
    void retornaCandidatoMenosVotado() {
        assertEquals(candidato1, eleicao.retornaCandidatoMenosVotado());
    }
}