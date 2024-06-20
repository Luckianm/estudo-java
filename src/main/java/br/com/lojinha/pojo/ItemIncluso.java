package br.com.lojinha.pojo;

public class ItemIncluso {

    private int quantidade;
    private String nome;

   // public ItemIncluso(int QuantidadeInicial, String NomeInicial) {
   //     this.quantidade = QuantidadeInicial;
   //     this.nome = NomeInicial;
   // }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
