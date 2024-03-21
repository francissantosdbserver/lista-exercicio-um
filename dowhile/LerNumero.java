package dowhile;

import java.util.Scanner;

public class LerNumero {

    public static void main(String[] args){

        int numero;
        Scanner lerNumero = new Scanner(System.in);

        do {
            System.out.println("Digite um número:");
            numero = lerNumero.nextInt();
        } while (numero != 10);
        System.out.println("Encerrado!");
    }
}
