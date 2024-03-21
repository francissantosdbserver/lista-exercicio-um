package matrizes;

import java.util.Arrays;
import java.util.Random;

public class OrdenaVetor {

    public static void main(String[] args) {

        Random random = new Random();
        int[] vetor = new int[100];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100);
        }

        Arrays.sort(vetor);
        System.out.println(Arrays.toString(vetor));
    }
}
