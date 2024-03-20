package ifelse;

public class ProdutoDesconto {

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
