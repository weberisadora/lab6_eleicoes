package main;

import negocio.Candidato;
import negocio.Eleicao;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Candidato candidato1 = new Candidato("Isadora", "Partido das Capivaras", 22, 50);
        Candidato candidato2 = new Candidato("Eduardo", "Partido das Gatos", 24, 100);
        Candidato candidato3 = new Candidato("Vitória", "Partido das Flores", 21, 150);
        Candidato candidato4 = new Candidato("Lucas", "Partido dos Pôneis", 22, 200);
        Eleicao eleicao = new Eleicao(new ArrayList<>());
        eleicao.getCandidatos().add(candidato1);
        eleicao.getCandidatos().add(candidato2);
        eleicao.getCandidatos().add(candidato3);
        eleicao.getCandidatos().add(candidato4);
        System.out.println("Candidato mais jovem: " + eleicao.retornaCandidatoMaisJovem());
        System.out.println("Candidato mais velho: " + eleicao.retornaCandidatoMaisVelho());
        System.out.println("Candidato mais votado: " + eleicao.retornaCandidatoMaisVotado());
        System.out.println("Candidato menos votado: " + eleicao.retornaCandidatoMenosVotado());
        System.out.println("Total de votos recebidos por todos os candidatos: " + eleicao.calculaTotalDeVotos());
        System.out.println("Média de votação recebida pelos candidatos: " + eleicao.calculaMediaDeVotos());
    }
}
