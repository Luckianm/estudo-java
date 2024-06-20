package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.ItemIncluso;
import br.com.lojinha.pojo.Produto;
import br.com.lojinha.pojo.ProdutoInternacional;
import br.com.lojinha.pojo.ProdutoNacional;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto("Sony",Tamanho.PEQUENO);

        meuProduto.setNome("Playstation 4");
        meuProduto.setValor(0.01);
        //meuProduto.setTamanho(Tamanho.GRANDE);

        //ItemIncluso meuItemAdicional = new ItemIncluso(1,"Adicional");
        //meuItemAdicional.setQuantidade(2);
        //meuItemAdicional.setNome("Controles");

        List<ItemIncluso> itensInclusos = new ArrayList<>();

        ItemIncluso primeiroItemIncluso = new ItemIncluso();
        primeiroItemIncluso.setNome("Controle");
        primeiroItemIncluso.setQuantidade(2);
        itensInclusos.add(primeiroItemIncluso);

        ItemIncluso segundoItemIncluso = new ItemIncluso();
        segundoItemIncluso.setNome("Jogo");
        segundoItemIncluso.setQuantidade(3);
        itensInclusos.add(segundoItemIncluso);

        ItemIncluso terceiroItemIncluso = new ItemIncluso();
        terceiroItemIncluso.setNome("Cabo");
        terceiroItemIncluso.setQuantidade(2);
        itensInclusos.add(terceiroItemIncluso);

        meuProduto.setItensInclusos(itensInclusos);

        //itensInclusos.add("2 controles");
        //itensInclusos.add("3 jogos");
        //itensInclusos.add("2 cabos de energia");
        //meuProduto.setItensInclusos(itensInclusos);
        //System.out.println(meuProduto.getItensInclusos().get(0));

        //System.out.println(meuItemAdicional.getQuantidade());
        //System.out.println(meuItemAdicional.getNome());
        System.out.println(meuProduto.getMarca());
        System.out.println(meuProduto.getTamanho());

        for (ItemIncluso itemAtual: meuProduto.getItensInclusos()) {
            System.out.println(itemAtual.getNome());
            System.out.println(itemAtual.getQuantidade());
        }

        ProdutoNacional meuProdutoNacional = new ProdutoNacional("Sony", Tamanho.GRANDE);
        meuProdutoNacional.setImpostoNacional(0.55789);
        meuProdutoNacional.setValor(30);
        //System.out.println(meuProdutoNacional.getImpostoNacional());


        ProdutoInternacional meuProdutointernacional = new ProdutoInternacional("Sony", Tamanho.MEDIO);
        meuProdutointernacional.setTaxaDeImportacao(15.0);
        meuProdutointernacional.setValor(-10);
        //System.out.println(meuProdutointernacional.getTaxaDeImportacao());
    }
}
