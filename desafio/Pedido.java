package desafio;

public class Pedido {

    public void devolverTroco(double valorPago){
        if(pagamento >= imprimeValorTotal()){
            troco = calculaTroco(valorPago);
            return troco;
        }
        System.out.println("Valor insuficiente");
    }

    public void calculaTroco(double valorPago) {
        valorPago - imprimeValorTotal();
    }


    double troco = devolverTroco(valorPago) != null ? devolverTroco(valorPago) : 0;

    public void calculaNotas(double valorPago) {
        double troco = valorPago - imprimeValorTotal();

        int[] notas = {100, 50, 20, 10, 5, 2, 1};

        System.out.println("Quantidade de notas:");
        for (int nota : notas) {
            int quantidadeNotas = (int) (troco / nota);
            if (quantidadeNotas > 0) {
                troco -= quantidadeNotas * nota;
            }
        }
    }


}
