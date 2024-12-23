package br.com.josemar.clientes.controller;


public class Conta {
    private String numero;
    private String agencia;
    private Double saldo;
    private Double limite;

    public Conta(String numero, String agencia, Double saldo, Double limite) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.limite = limite;
    }

    // Getters e Setters
    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }
    public String getAgencia() { return agencia; }
    public void setAgencia(String agencia) { this.agencia = agencia; }
    public Double getSaldo() { return saldo; }
    public void setSaldo(Double saldo) { this.saldo = saldo; }
    public Double getLimite() { return limite; }
    public void setLimite(Double limite) { this.limite = limite; }
}
