package negocio;

import java.util.*;

public class Eleicao {
    private List<Candidato> candidatos;

    public Eleicao(List<Candidato> candidatos) {
        this.candidatos = candidatos;
    }

    public List<Candidato> getCandidatos() {
        return candidatos;
    }

    public int calculaTotalDeVotos() {
        int totalDeVotos = 0;

        for (Candidato candidato : candidatos)
            totalDeVotos += candidato.getQuantVotos();

        return totalDeVotos;
    }

    public double calculaMediaDeVotos() {
        double totalDeVotos = calculaTotalDeVotos();
        double quantCandidatos = candidatos.size();

        return totalDeVotos / quantCandidatos;
    }

    public Candidato retornaCandidatoMaisJovem() {
        Comparator<Candidato> comparator = Comparator.comparing(Candidato::getIdade);
        return candidatos.stream().min(comparator).get();
    }

    public Candidato retornaCandidatoMaisVelho() {
        Comparator<Candidato> comparator = Comparator.comparing(Candidato::getIdade);
        return candidatos.stream().max(comparator).get();
    }

    public Candidato retornaCandidatoMaisVotado() {
        Comparator<Candidato> comparator = Comparator.comparing(Candidato::getQuantVotos);
        return candidatos.stream().max(comparator).get();
    }

    public Candidato retornaCandidatoMenosVotado() {
        Comparator<Candidato> comparator = Comparator.comparing(Candidato::getQuantVotos);
        return candidatos.stream().min(comparator).get();
    }



}
