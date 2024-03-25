package oo.emprestimoDeLivro;

import java.util.ArrayList;
import java.util.Date;

public class Emprestimo {

    int codigo;
    Pessoa pessoa;
    ArrayList<Livro> livros = new ArrayList<>();
    Date dataDoEmrestimo;

    public Emprestimo(Pessoa pessoa, ArrayList<Livro> livros) {
        this.pessoa = pessoa;
        this.livros = livros;
        this.dataDoEmrestimo = new Date();
    }

    @Override
    public String toString() {
        return "Emprestimo { Pessoa : " + pessoa +
                " Livros: " + livros +
                " Data do empréstimo: " + dataDoEmrestimo + " }";
    }

    public static void main(String[] args) {

        ArrayList<Livro> listaLivros = new ArrayList<>();

        Pessoa pessoa = new Pessoa(154844,"Francis",41905,"Salvador");

        Livro livro1 = new Livro("hobbit", "J. R. R. Tolkien", 11121, "Fantasia");

        listaLivros.add(livro1);

        Emprestimo emprestimo = new Emprestimo(pessoa, listaLivros);

        System.out.println(emprestimo);
    }
}
