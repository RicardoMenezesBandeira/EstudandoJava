package com.example.Teste;

import org.springframework.beans.factory.annotation.Autowired;

public class Livros {
    private String nome;
    private String codigo;

    @Autowired
    private AutorLivro autor;

    public AutorLivro getAutor() {
        return autor;
    }

    public void setAutor(AutorLivro autor) {
        this.autor = autor;
    }

    public void exibir(){
        System.out.println("nome: "+this.nome+" codigo: "+this.codigo);
        autor.exibirAutor();
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
