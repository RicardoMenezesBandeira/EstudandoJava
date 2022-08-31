package com.comSpringWeb.projeto1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUnitController {
    @Test
    public void TestUnit(){
        TestController test = new TestController();
        String resultado;
        resultado = test.saudacao("DIO");
        assertEquals("Bem vindo, DIO",resultado);
    }
}
