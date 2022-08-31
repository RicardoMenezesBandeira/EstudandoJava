package com.lab.dio.subsistema2.cep;

import com.lab.dio.singleton.SingletonEager;

public class CepApi {

        private static CepApi instancia = new CepApi();
        private CepApi(){super();}
    public static CepApi getInstance(){
            return instancia;
    }
    public String recuperarCidade(String cep){
            return "Araraquara";

    }
    public String recuperarEstado(String cep){
        return "SP";

    }
}
