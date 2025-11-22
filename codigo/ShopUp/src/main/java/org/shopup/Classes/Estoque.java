package org.shopup.Classes;

public class Estoque {

    private int quantidade;

    public Estoque(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void reduzir(int valor) {
        if (valor > 0 && quantidade >= valor) {
            quantidade -= valor;
        }
    }

    public void adicionar(int valor) {
        if (valor > 0) {
            quantidade += valor;
        }
    }
}

