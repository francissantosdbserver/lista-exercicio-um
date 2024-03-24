package metodos;

public class Calculadora {

    public static double soma(double a, double b) {
        return a + b;
    }

    public static double subtracao(double a, double b) {
        return a - b;
    }

    public static double multiplicacao(double a, double b) {
        return a * b;
    }

    public static double divisao(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
    }

    public static double potenciacao(double base, double expoente) {
        return Math.pow(base, expoente);
    }

    public static double operacao(char operador, double a, double b) {
        double resultado = 0.0;
        switch (operador) {
            case '+':
                resultado = soma(a, b);
                break;
            case '-':
                resultado = subtracao(a, b);
                break;
            case '*':
                resultado = multiplicacao(a, b);
                break;
            case '/':
                resultado = divisao(a, b);
                break;
            case '^':
                resultado = potenciacao(a, b);
                break;
            default:
                System.out.println("Operador inválido.");
        }
        return resultado;
    }
}
