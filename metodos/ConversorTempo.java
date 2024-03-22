package metodos;

import java.util.Scanner;

public class ConversorTempo {

    public static void main(String[] args) {
        int tempoSegundos = lerSegundos();
        int horas = obterHoras(tempoSegundos);
        int minutos = obterMinutos(tempoSegundos);
        int segundos = obterSegundos(tempoSegundos);
        escreverTempo(horas, minutos, segundos);
    }

    public static int lerSegundos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tempo em segundos: ");
        return scanner.nextInt();
    }

    public static int obterHoras(int tempoSegundos) {
        return tempoSegundos / 3600;
    }

    public static int obterMinutos(int tempoSegundos) {
        return (tempoSegundos % 3600) / 60;
    }

    public static int obterSegundos(int tempoSegundos) {
        return tempoSegundos % 60;
    }

    public static void escreverTempo(int horas, int minutos, int segundos) {
        System.out.println("Tempo convertido: " + horas + "h" + minutos + "min" + segundos + "seg");
    }
}
