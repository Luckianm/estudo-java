package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.Produto;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto();

        meuProduto.setNome("Playstation 4");
        meuProduto.setValor(0.01);
        meuProduto.setMarca("Sony");
        meuProduto.setTamanho(Tamanho.GRANDE);

        List<String> itensInclusos = new ArrayList<String>();
        itensInclusos.add("2 controles");
        itensInclusos.add("3 jogos");
        itensInclusos.add("2 cabos de energia");
        meuProduto.setItensInclusos(itensInclusos);

        System.out.println(meuProduto.getItensInclusos().get(0));
        System.out.println(meuProduto.getTamanho());
    }
}
