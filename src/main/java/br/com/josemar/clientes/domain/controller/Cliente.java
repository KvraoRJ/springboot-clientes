package br.com.josemar.clientes.domain.controller;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "tb_Clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @OneToOne(cascade = CascadeType.ALL)
    private Conta conta;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Funcionalidade> funcionalidades;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Cartao> cartoes;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Novidade> novidades;

    public Cliente(String nome) {
        this.nome = nome;
        this.funcionalidades = new ArrayList<>();
        this.cartoes = new ArrayList<>();
        this.novidades = new ArrayList<>();
    }

    public Cliente() {
        super();
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public List<Funcionalidade> getFuncionalidades() {
        return funcionalidades;
    }

    public List<Cartao> getCartoes() {
        return cartoes;
    }

    public List<Novidade> getNovidades() {
        return novidades;
    }
}
