package oo.emprestimoDeLivro;

public class Livro {

    String nome;
    String autor;
    int codigo;
    String categoria;

    public Livro(String nome, String autor, int codigo, String categoria) {
        this.nome = nome;
        this.autor = autor;
        this.codigo = codigo;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Livro { nome: " + nome +
                ", autor: " + autor +
                ", código: " + codigo +
                ", categoria: " + categoria + " }";
    }
}
