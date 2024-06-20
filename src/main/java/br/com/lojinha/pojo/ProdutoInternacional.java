package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;

public class ProdutoInternacional extends Produto{

    public double taxaDeImportacao;

    public ProdutoInternacional(String marcaInicial, Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);
    }

    public void setValor(double valor) {
        if (valor > -100){
            this.valor = valor;
        } else {
            throw new IllegalArgumentException("valor deve ser maior que -100");
        }
    }

    public double getTaxaDeImportacao() {
        return taxaDeImportacao;
    }

    public void setTaxaDeImportacao(double taxaDeImportacao) {
        this.taxaDeImportacao = taxaDeImportacao;
    }
}
