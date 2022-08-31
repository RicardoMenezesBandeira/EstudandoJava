package com.lab.dio.singleton;
/*
 * Singleton "apressado"
 * explorando padroes de projeto
 * autor Ricardo
 * */
public class SingletonLazy {
    private static SingletonLazy instacia;
    private SingletonLazy(){
        super();
    }
    public static SingletonLazy getInstacia(){
        if(instacia==null){
            instacia = new SingletonLazy();
        }
        return instacia;
    }
}
