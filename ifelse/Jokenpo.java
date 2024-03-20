package ifelse;

import java.util.Random;

public class Jokenpo {

    public static void main(String[] args){

        // Pedra : 1
        // Papel : 2
        // Tesoura : 3

        Random random = new Random();
        int jogador = 3;
        int maquina = random.nextInt(3)+1;

        if ( jogador == maquina){
            System.out.println("Empate!");
        } else if (jogador == 2 && maquina == 1){
            System.out.println("Jogador vence!");
        } else if (jogador == 1 && maquina == 3){
            System.out.println("Jogador vence!");
        } else if (jogador == 3 && maquina == 2){
            System.out.println("Jogador vence!");
        } else {
            System.out.println("Máquina Vence!");
        }

    }
}
