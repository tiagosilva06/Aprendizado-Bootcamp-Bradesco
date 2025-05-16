package list.DesafioCarrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Compras> comprasList = new ArrayList<>();

    public CarrinhoCompras(){
        this.comprasList = new ArrayList<>();
    }

    public void adicionarCompra(String nome, double preco, int quantidade){
        Compras compras = new Compras(nome, quantidade, preco);
        this.comprasList.add(compras);
    }

    public void removerCompra(String nome){
        List<Compras> comprasParaRemover = new ArrayList<>();
        if(!comprasList.isEmpty()) {
            for (Compras c : comprasList) {
                if (c.getNome().equalsIgnoreCase(nome)) {
                    comprasParaRemover.add(c);
                }
            }
            comprasList.removeAll(comprasParaRemover);
        } else {
            System.out.println("A lista está vazia..");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!comprasList.isEmpty()) {
            for (Compras compras : comprasList) {
                double valorItem = compras.getPreco() * compras.getQuantidade();
                valorTotal += valorItem; //valorTotal = valorTotal + valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("O carrinho de compras está vazio!");
        }
    }

    public void exibirCompras(){
        if(!comprasList.isEmpty()){
            System.out.println(comprasList);
        }else {
            System.out.println("O carrinho de compras está vazio!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoCompras{" +
                "comprasList=" + comprasList +
                '}';
    }

    public static void main(String[] args) {
        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();
        carrinhoCompras.adicionarCompra("Shorts", 100.00, 1);
        carrinhoCompras.adicionarCompra("Camiseta", 125.00, 1);
        carrinhoCompras.adicionarCompra("Relógio", 350.99, 1);
        carrinhoCompras.adicionarCompra("Perfume", 120.00, 2);

        carrinhoCompras.exibirCompras();

        carrinhoCompras.removerCompra("Shorts");
        System.out.println("Status: Item removido ");
        carrinhoCompras.exibirCompras();

        System.out.println("O valor total da compra é = R$" + carrinhoCompras.calcularValorTotal());
    }
}
