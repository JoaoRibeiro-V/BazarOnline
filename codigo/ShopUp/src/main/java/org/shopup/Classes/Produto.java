package org.shopup.Classes;

public class Produto {

    private int id;
    private String nome;
    private double preco;
    private String tamanho;
    private Estoque estoque;

    public Produto(int id, String nome, double preco, String tamanho, Estoque estoque) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.tamanho = tamanho;
        this.estoque = estoque;
    }

    public double getPreco() {
        return preco;
    }

    public String getTamanho() {
        return tamanho;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public boolean aplicarDesconto(double porcentagem) {
        if (porcentagem < 0 || porcentagem > 100) return false;
        this.preco -= this.preco * (porcentagem / 100.0);
        return true;
    }
}
