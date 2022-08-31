 package com.lab.dio.singleton;
/*
* Singleton "apressado"
* explorando padroes de projeto
* autor Ricardo
* */
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();
    private SingletonEager(){
        super();
    }
    public static  SingletonEager getInstance(){
        return instancia;
    }

}
