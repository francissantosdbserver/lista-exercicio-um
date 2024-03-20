package swtichcase;

public class Calculadora {

    public static void main(String[] args){
        String opcao = "*";
        double numeroUm = 1;
        double numeroDois = 2;
        double resultado;

        switch (opcao) {
            case "+":
                resultado = numeroUm + numeroDois;
                System.out.println("Resultado : " + resultado);
                break;
            case "-":
                resultado = numeroUm - numeroDois;
                System.out.println("Resultado : " + resultado);
                break;
            case "*":
                resultado = numeroUm * numeroDois;
                System.out.println("Resultado : " + resultado);
                break;
            case "/":
                resultado = numeroUm / numeroDois;
                System.out.println("Resultado : " + resultado);
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
