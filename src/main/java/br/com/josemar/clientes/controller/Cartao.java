package br.com.josemar.clientes.controller;

public class Cartao {

    private String numero;
    private String validade;
    private Double limite;

    public Cartao(String numero, String validade, Double limite) {
        this.numero = numero;
        this.validade = validade;
        this.limite = limite;
    }

    // Getters e Setters
    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }
    public String getValidade() { return validade; }
    public void setValidade(String validade) { this.validade = validade; }
    public Double getLimite() { return limite; }
    public void setLimite(Double limite) { this.limite = limite; }
}
