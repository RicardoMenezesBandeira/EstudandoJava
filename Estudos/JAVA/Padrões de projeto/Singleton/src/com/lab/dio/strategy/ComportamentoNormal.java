package com.lab.dio.strategy;

public class ComportamentoNormal implements Comportamento{
    @Override
    public void move() {
        System.out.println("andando normalmente");
    }
}
