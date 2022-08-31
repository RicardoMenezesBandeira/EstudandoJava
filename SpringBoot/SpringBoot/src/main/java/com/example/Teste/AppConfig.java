package com.example.Teste;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Livros getLivro(){
        return new Livros();
    }
    @Bean
    public AutorLivro getAutorLivro(){
        return new Autor();
    }
}
