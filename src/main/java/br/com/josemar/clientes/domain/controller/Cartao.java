package br.com.josemar.clientes.domain.controller;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_Cartoes")
public class Cartao {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String numero;

    private String validade;

    @Column(scale = 2, precision=13)
    private BigDecimal limite;

    public Cartao(String numero, String validade, BigDecimal limite) {
        this.numero = numero;
        this.validade = validade;
        this.limite = limite;
    }

    public Cartao() {
        super();
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public BigDecimal getLimite() {
        return limite;
    }

    public void setLimite(BigDecimal limite) {
        this.limite = limite;
    }


}
