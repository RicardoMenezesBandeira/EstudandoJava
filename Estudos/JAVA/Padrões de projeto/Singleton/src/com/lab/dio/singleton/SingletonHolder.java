 package com.lab.dio.singleton;
/*
* Singleton "LazyHolder"
* @see: <a href="https://stackoverflow.com/a/24018148">Referencia</a>
* explorando padroes de projeto
* @autor: Ricardo
* */
public class SingletonHolder {
    private static class InstanceHolder{
        private static SingletonHolder instancia = new SingletonHolder();
    }

    private SingletonHolder(){
        super();
    }
    public static SingletonHolder getInstance(){
        return InstanceHolder.instancia;
    }

}
