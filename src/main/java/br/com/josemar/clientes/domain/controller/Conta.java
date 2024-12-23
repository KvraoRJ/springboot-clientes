package br.com.josemar.clientes.domain.controller;


import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_Contas")
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String numero;
    @Column(nullable = false)
    private String agencia;

    @Column(scale = 2, precision = 13)
    private BigDecimal saldo;
    @Column(scale = 2, precision = 13)
    private BigDecimal limite;

    public Conta(String numero, String agencia, BigDecimal saldo, BigDecimal limite) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.limite = limite;
    }

    public Conta() {
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

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal getLimite() {
        return limite;
    }

    public void setLimite(BigDecimal limite) {
        this.limite = limite;
    }
}
