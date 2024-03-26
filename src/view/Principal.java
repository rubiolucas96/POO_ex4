package view;

import model.Produto;

public class Principal {

    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Pão");
        produto.setPreco(1.5);
        produto.setQtdEstoque(100);
        Produto produto1 = new Produto();
        produto1.setNome("Alface");
        produto1.setPreco(2.0);
        produto1.setQtdEstoque(0);

        if (produto.verificaProdutoDisponivel()) {
            System.out.println("O produto " + produto.getNome() + " está disponível.");
        } else {
            System.out.println("O produto " + produto.getNome() + " não está disponível.");
        }

        System.out.println("Valor total em estoque: R$" + produto.totalValorEstoque());
        System.out.println("--------------------------------------------------------------------------");

        if (produto1.verificaProdutoDisponivel()) {
            System.out.println("O produto " + produto1.getNome() + " está disponível.");
        } else {
            System.out.println("O produto " + produto1.getNome() + " não está disponível.");
        }

        System.out.println("Valor total em estoque: R$" + produto1.totalValorEstoque());
    }
}
