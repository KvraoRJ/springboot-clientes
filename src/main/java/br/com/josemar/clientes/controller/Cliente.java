package br.com.josemar.clientes.controller;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private Conta conta;
    private List<Funcionalidade> funcionalidades;
    private List<Cartao> cartoes;
    private List<Novidade> novidades;

    public Cliente(String nome) {
        this.nome = nome;
        this.funcionalidades = new ArrayList<>();
        this.cartoes = new ArrayList<>();
        this.novidades = new ArrayList<>();
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public Conta getConta() { return conta; }
    public void setConta(Conta conta) { this.conta = conta; }
    public List<Funcionalidade> getFuncionalidades() { return funcionalidades; }
    public List<Cartao> getCartoes() { return cartoes; }
    public List<Novidade> getNovidades() { return novidades; }
}
