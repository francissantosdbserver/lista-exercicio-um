package oo.Arvore;

public class Pessoa {
    private String nome;
    private int idade;
    private Pessoa pai;
    private Pessoa mae;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String nome, int idade, Pessoa pai, Pessoa mae) {
        this.nome = nome;
        this.idade = idade;
        this.pai = pai;
        this.mae = mae;
    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", pai=" + (pai != null ? pai : "Desconhecido") +
                ", mãe=" + (mae != null ? mae : "Desconhecida") +
                '}';
    }

    public static void main(String[] args) {
        Pessoa pai = new Pessoa("Paulo", 20);
        Pessoa mae = new Pessoa("Ana", 10);
        Pessoa filho = new Pessoa("Lucas", 12, pai, mae);

        System.out.println("Pai: " + pai);
        System.out.println("Mãe: " + mae);
        System.out.println("Filho: " + filho);
    }
}
