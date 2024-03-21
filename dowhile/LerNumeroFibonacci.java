package dowhile;

import java.util.Scanner;

public class LerNumeroFibonacci {

    public static void main(String[] args){

        int numero;
        int contador = 0;
        Scanner lerNumero = new Scanner(System.in);

        System.out.println("Digite um número:");
        numero = lerNumero.nextInt();

        while(contador < numero ) {
                System.out.println(numero);
                if(fibonacci(contador) > numero){
                  numero = 0;
                } else {
                    System.out.print(fibonacci(contador) + ", ");
                }
                contador++;
        }
        System.out.println("Encerrado!");
    }

    public static int fibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
