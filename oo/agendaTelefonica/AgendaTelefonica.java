package oo.agendaTelefonica;

import java.util.HashMap;
import java.util.Map;

public class AgendaTelefonica {

    private Map<String, Contato> contato;

    public AgendaTelefonica() {
        this.contato = new HashMap<>();
    }

    public Map<String, Contato> getContato() {
        return contato;
    }

    public void setContato(Map<String, Contato> contato) {
        this.contato = contato;
    }

    public void adicionarContato(String nome, String tipoContato, int numero) {
        contato.put(nome, new Contato(nome, tipoContato, numero));
    }

    public void deletarContato(String nome) {
        if (contato.containsKey(nome)) {
            contato.remove(nome);
        }
    }

    public void listarAgenda() {
        for (Contato contato : contato.values()) {
            System.out.println(contato);
        }
    }
}
