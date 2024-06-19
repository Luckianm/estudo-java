package br.com.lojinha.pojo;

import java.util.List;

public class Produto {


    private String nome;
    private String marca;
    private double valor;
    private String tamanho;
    private List<String> itensInclusos;


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        if (valor > 0){
            this.valor = valor;
        } else {
            throw new IllegalArgumentException("valor nao pode ser menor que 0");
        }
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public List<String> getItensInclusos() {
        return itensInclusos;
    }

    public void setItensInclusos(List<String> itensInclusos) {
        this.itensInclusos = itensInclusos;
    }
}
