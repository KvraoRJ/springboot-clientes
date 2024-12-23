package br.com.josemar.clientes.controller;

public class Funcionalidade {

    private String icone;
    private String descricao;

    public Funcionalidade(String icone, String descricao) {
        this.icone = icone;
        this.descricao = descricao;
    }

    // Getters e Setters
    public String getIcone() { return icone; }
    public void setIcone(String icone) { this.icone = icone; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
}

