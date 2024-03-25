package oo.emprestimoDeLivro;

public class Pessoa {

    int id;
    String nome;
    int cep;
    String cidade;

    public Pessoa(int id, String nome, int cep, String cidade) {
        this.id = id;
        this.nome = nome;
        this.cep = cep;
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Pessoa { id: " + id +
                ", nome: " + nome +
                ", cep: " + cep +
                ", cioade: " + cidade + " }";

    }
}
