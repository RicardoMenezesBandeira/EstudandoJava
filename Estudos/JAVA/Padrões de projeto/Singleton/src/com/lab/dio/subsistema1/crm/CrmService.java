package com.lab.dio.subsistema1.crm;

import jdk.swing.interop.SwingInterOpUtils;

public class CrmService {
    private CrmService(){
        super();
    }
    public static void gravarCliente(String nome,String cep,String cidade,String estado){
        System.out.println("Cliente salvo no sistema de CRM.");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);
    }
}
