package negocio;

import java.util.Comparator;

public class Candidato implements Comparable<Candidato>  {
    private String nome;
    private String partido;
    private int idade;
    private int quantVotos;

    public Candidato(String nome, String partido, int idade, int quantVotos) {
        this.nome = nome;
        this.partido = partido;
        this.idade = idade;
        this.quantVotos = quantVotos;
    }

    public String getNome() {
        return nome;
    }

    public String getPartido() {
        return partido;
    }

    public int getIdade() {
        return idade;
    }

    public int getQuantVotos() {
        return quantVotos;
    }

    @Override
    public int compareTo(Candidato candidato) {
        return Integer.compare(idade, candidato.getIdade());
    }

    @Override
    public String toString() {
        return  "Nome: " + nome +
                " | Partido: " + partido +
                " | Idade: " + idade +
                " | Quantidade de votos: " + quantVotos;
    }
}
