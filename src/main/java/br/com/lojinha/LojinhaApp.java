package br.com.lojinha;

import br.com.lojinha.pojo.Produto;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto();

        meuProduto.setNome("Playstation 4");
        meuProduto.setValor(0.01);
        meuProduto.setMarca("Sony");
        meuProduto.setTamanho("Medio");

        List<String> itensInclusos = new ArrayList<String>();
        itensInclusos.add("2 controles");
        itensInclusos.add("3 jogos");
        itensInclusos.add("2 cabos de energia");
        meuProduto.setItensInclusos(itensInclusos);

        System.out.println(meuProduto.getItensInclusos().get(0));
    }
}
