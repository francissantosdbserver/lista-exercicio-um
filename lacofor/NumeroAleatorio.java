package lacofor;

import java.util.Random;

public class NumeroAleatorio {

    public static void main(String[] args){

        Random random = new Random();

        int menorNumero = 100;
        int maiorNumero = 0;

        for(int i = 0 ; i < 10 ; i++){
            int numero = random.nextInt(101);
            System.out.print("  " +numero);
            if(numero < menorNumero){
                menorNumero = numero;
            } else if (numero > maiorNumero){
                maiorNumero = numero;
            }
        }
        System.out.println("\nMenor número: " + menorNumero);
        System.out.println("Maior número: " + maiorNumero);

    }
}
