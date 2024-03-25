package oo.Automovel;

public class MotoPartidaPedal extends Moto {
    public MotoPartidaPedal(String marca, String modelo, double velMax, int numRodas, int ano) {
        super(marca, modelo, velMax, numRodas, ano);
    }

    public void ligar(boolean aceleradorPuxado) {
        if (aceleradorPuxado) {
            super.ligar();
        } else {
            System.out.println("Para ligar, o acelerador precisa está pressionado.");
        }
    }
}
