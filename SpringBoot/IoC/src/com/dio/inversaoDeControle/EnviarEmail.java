package com.dio.inversaoDeControle;

import org.jetbrains.annotations.Contract;

public class EnviarEmail {
    public EnviarEmail(String tipo,String endereco,String senha){

    }
    public static EnviarEmail obterDadosEmail(){
        return new EnviarEmail("azul","contato@emial.com","senha");
    }
    public void retorna(String mensagem){
        System.out.println("Email Enviado");
    }
}
