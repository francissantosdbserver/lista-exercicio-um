package desafio;

public class Item {

    private Produto produto;
    private int quantidade;
    private double valorDoItem;

    public Item(Produto produto, int quantidade) {

        this.produto = produto;
        this.quantidade = quantidade;
        this.defineValorTotal();
    }

    private void defineValorTotal() {
        this.valorDoItem = this.produto.getPreco() * this.quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValorDoItem() {
        return valorDoItem;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setValorDoItem(double valorDoItem) {
        this.valorDoItem = valorDoItem;
    }
}
