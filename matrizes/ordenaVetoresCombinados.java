package matrizes;

import java.util.Arrays;
import java.util.Random;

public class ordenaVetoresCombinados {

    public static void main(String[] args) {

        Random random = new Random();
        int[] vetorUm = new int[50];
        int[] vetorDois = new int[50];
        int[] vetorCombinado = new int[100];

        for (int i = 0; i < 50; i++) {
            vetorUm[i] = random.nextInt(100);
            vetorDois[i] = random.nextInt(100);
        }

        Arrays.sort(vetorUm);
        Arrays.sort(vetorDois);

        System.arraycopy(vetorUm, 0, vetorCombinado, 0, 50);
        System.arraycopy(vetorDois, 0, vetorCombinado, 50, 50);

        Arrays.sort(vetorCombinado);

        System.out.println(Arrays.toString(vetorCombinado));
    }
}
