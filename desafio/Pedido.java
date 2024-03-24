package desafio;

public class Pedido {

    public void checarTroco(double pagamento){
        if(pagamento >= imprimeValorTotal()){
            troco = devolverTroco(pagamento);
            return troco;
        }
        System.out.println("Valor insuficiente");
    }

    public void devolverTroco(double pagamento) {
        pagamento - imprimeValorTotal();
    }
}
