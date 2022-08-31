package com.dio.inversaoDeControle;

import java.io.IOException;
import java.util.Scanner;

public class Problem {
    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        double soma =0d;


        String o = leitor.nextLine();
        for(int i = 0 ;i<12;i++){
            for(int j = 0 ; j<12;j++){
                if(i<j){

                    soma =soma+ leitor.nextDouble();
                }
            }
        }

        if(o.compareToIgnoreCase("s")==0){
           System.out.printf(" %.1f %n",(soma));

        }else{
            soma = soma/((144/2)-12);
            System.out.printf(" %.1f %n",(soma));

        }

    }
}
