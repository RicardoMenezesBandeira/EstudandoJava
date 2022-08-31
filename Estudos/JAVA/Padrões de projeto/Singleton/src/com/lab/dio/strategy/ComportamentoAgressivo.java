package com.lab.dio.strategy;

public class ComportamentoAgressivo implements Comportamento{
    @Override
    public void move() {
        System.out.println("andando Agressivamente");
    }
}
