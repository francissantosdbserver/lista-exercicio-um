package desafio;

public class Pedido {

    public void devolverTroco(double pagamento){
        if(pagamento >= imprimeValorTotal()){
            troco = calculaTroco(pagamento);
            return troco;
        }
        System.out.println("Valor insuficiente");
    }

    public void calculaTroco(double pagamento) {
        pagamento - imprimeValorTotal();
    }
}
