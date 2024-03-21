package matrizes;

import java.util.Random;
import java.util.Scanner;

public class SomaDiagonal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Tamanho da matriz quadrada: ");
        int tamanho = scanner.nextInt();

        int[][] matriz = new int[tamanho][tamanho];

        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                matriz[i][j] = random.nextInt(100) + 1 ;
                System.out.println(matriz[i][j]);
            }
        }

        int somaDiagonal = 0;
        for (int i = 0; i < tamanho; i++) {
            somaDiagonal += matriz[i][i];
        }

        System.out.println("A soma dos elementos da diagonal é: " + somaDiagonal);
    }
}
