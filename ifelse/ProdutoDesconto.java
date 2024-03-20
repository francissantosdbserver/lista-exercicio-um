package ifelse;

public class ProdutoDesconto {


    /* Para cada produto informado (nome, preço e quantidade), escreva o
    nome do produto comprado e o valor total a ser pago, considerando
    que são oferecidos descontos pelo número de unidades compradas,
    segundo a tabela abaixo:
    a. Até 10 unidades: valor total
    b. De 11 a 20 unidades: 10% de desconto
    c. De 21 a 50 unidades: 20% de desconto
    d. Acima de 50 unidades: 25% de desconto */


    public static void main(String[] args){

        String nome = "laranja";
        double preco = 1.00;
        int quantidade = 100;
        double total = 0;
        String mensagem = "Produto:" + nome + "\nQuantidade: " + quantidade + "\nTotal: " + total;


        if (quantidade <= 5){
           total =  preco * quantidade;
            System.out.println("Produto: " + nome + "\nQuantidade: " + quantidade + "\nTotal: " + total);
        } else if (quantidade >= 11 && quantidade <= 20){
            total = preco * quantidade * 0.9;
            System.out.println("Produto: " + nome + "\nQuantidade: " + quantidade + "\nTotal: " + total);
        } else if (quantidade >= 21 && quantidade <= 50){
            total = preco * quantidade * 0.8;
            System.out.println("Produto: " + nome + "\nQuantidade: " + quantidade + "\nTotal: " + total);
        } else {
            total = preco * quantidade * 0.75;
            System.out.println("Produto: " + nome + "\nQuantidade: " + quantidade + "\nTotal: " + total);
        }
    }
}
