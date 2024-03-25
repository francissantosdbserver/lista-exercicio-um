package oo.agendaTelefonica;

class Contato {
    private String nome;
    private String tipoDeContato;
    private int numero;

    public Contato(String nome, String tipoDeContato, int numero) {
        this.nome = nome;
        this.tipoDeContato = tipoDeContato;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipoDeContato;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " - Tipo: " + tipoDeContato+ " - Número: " + numero;
    }
}