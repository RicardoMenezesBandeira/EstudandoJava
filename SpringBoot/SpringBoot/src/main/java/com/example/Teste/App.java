package com.example.Teste;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext factory =new AnnotationConfigApplicationContext(AppConfig.class);
        Livros livro = factory.getBean(Livros.class);
        livro.setNome("Harry pote");
        livro.setCodigo("df32f");

        Autor autor = factory.getBean(Autor.class);
        autor.setNome("Rk");
        livro.setAutor(autor);
        livro.exibir();

    }
}
