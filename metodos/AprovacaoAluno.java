package metodos;

public class AprovacaoAluno {

    public static void main(String[] args) {
        double notaUm = 8;
        double notaDois = 3;
        double notaTres= 4;

        double media = calculaMedia(notaUm, notaDois, notaTres);

        String status = verificaStatus(media);
        System.out.println("Nota Final: " + media + "\nStatus do aluno: " + status);
    }

    public static double calculaMedia(double notaUm, double notaDois, double notaTres) {
        return (notaUm + notaDois + notaTres) / 3;
    }

    public static String verificaStatus(double media) {
        if (media > 6) {
            return "Aprovado";
        } else if (media >= 4 && media <= 6) {
            return "Verificação Suplementar";
        } else {
            return "Reprovado em Java";
        }
    }
}
