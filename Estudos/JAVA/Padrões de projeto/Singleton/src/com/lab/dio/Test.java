package com.lab.dio;

import com.lab.dio.facade.Facade;
import com.lab.dio.singleton.*;

import com.lab.dio.strategy.*;

import javax.xml.stream.FactoryConfigurationError;
/*
* @autor:ricardo
* Estudando Design Pattern*/

public class Test
{
    public static void main(String[] args) {
        //Test relacionados ao Design Pattern Singleton
        //Singleton
        System.out.println("----------------------");
        SingletonLazy lazy = SingletonLazy.getInstacia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstacia();
        System.out.println(lazy);
        System.out.println("----------------------");
        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        lazy = SingletonLazy.getInstacia();
        System.out.println(eager);
        System.out.println("----------------------");
        SingletonHolder holder = SingletonHolder.getInstance();
        System.out.println(holder);
        lazy = SingletonLazy.getInstacia();
        System.out.println(holder);
        System.out.println("----------------------");
        //Stratrgy
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensinvo();
        Comportamento agressivo = new ComportamentoAgressivo();
        Robo  robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        //Facade
        Facade facade = new Facade();
        facade.migrarCliente("Ricardo","27963502");


    }
}
