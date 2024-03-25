package oo.Automovel;

public class CarroAutomatico extends Carro{

    public CarroAutomatico(String marca, String modelo, double velMax, int numRodas, int ano) {
        super(marca, modelo, velMax, numRodas, ano);
    }

    public void ligar(boolean freioPressionado) {
        if (freioPressionado) {
            super.ligar();
        } else {
            System.out.println("Para ligar, o freio precisa está pressionado.");
        }
    }
}
