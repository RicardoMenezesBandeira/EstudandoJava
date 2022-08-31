package com.example.Teste;

public class Autor implements AutorLivro {
    private String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String nome;

    @Override
    public void exibirAutor() {
        System.out.println("Autor "+this.nome);
    }
}
