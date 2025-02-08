package main;

import produto.Produto;

public class Main {

    public static void main(String[] args) {
        Produto produto = new Produto(1, "Notebook", 5300.35);
        System.out.println(produto.obterDetalhes());
    }

}
