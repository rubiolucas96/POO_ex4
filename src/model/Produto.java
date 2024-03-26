package model;


public class Produto {
 private String nome;
 private double preco;
 private int qtdEstoque;


 public Produto() {
     nome = "";
     preco = 0.0;
     qtdEstoque = 0;
 }


 public String getNome() {
     return nome;
 }

 public void setNome(String nome) {
     this.nome = nome;
 }


 public double getPreco() {
     return preco;
 }

 public void setPreco(double preco) {
     if (preco >= 0) {
         this.preco = preco;
     } else {
         System.out.println("Preço inválido. O preço não pode ser negativo. Produto é " + nome);
     }
 }


 public int getQtdEstoque() {
     return qtdEstoque;
 }

 public void setQtdEstoque(int qtdEstoque) {
     if (qtdEstoque >= 0) {
         this.qtdEstoque = qtdEstoque;
     } else {
         System.out.println("Quantidade em estoque inválida. Não pode ser negativa. Produto é " + nome);
     }
 }


 public boolean verificaProdutoDisponivel() {
     return qtdEstoque > 0;
 }


 public double totalValorEstoque() {
     return preco * qtdEstoque;
 }
}

