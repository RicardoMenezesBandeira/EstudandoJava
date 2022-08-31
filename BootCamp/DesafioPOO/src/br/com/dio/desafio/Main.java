package br.com.dio.desafio;

import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 =new Curso("Java-Start","Java para iniciante",2);
        Curso curso2 =new Curso("Java-Play","Java para intermediário",3);
        Mentoria mentorando =new Mentoria("Tirando duvidas","Revisando os cursos anteriores",1,LocalDate.now());

        BootCamp bc = new BootCamp();
        bc.setNome("BOOTCAMP Java DEV");
        bc.setDescricao("descrevendo");
        bc.getConteudos().add(curso1);
        bc.getConteudos().add(curso2);
        bc.getConteudos().add(mentorando);
        Dev d1=new Dev();
        Dev d2=new Dev();
        d1.setNome("Camila");
        d2.setNome("Ricardo");

        d1.inscreverBootCamp(bc);
        d2.inscreverBootCamp(bc);
        System.out.println("Conteudos inscritos do(a) dev "+d1.getNome()+": "+d1.getConteudosInscritos());
        System.out.println("Conteudos inscritos do(a) dev "+d2.getNome()+": "+d2.getConteudosInscritos());
        System.out.println("Conteudos Concluidos do(a) dev "+d1.getNome()+": "+d1.getConteudosConcluidos());
        System.out.println("Conteudos Concluidos do(a) dev "+d2.getNome()+": "+d2.getConteudosConcluidos());
        d1.progredir();
        d2.progredir();
        d1.progredir();
        System.out.println("Conteudos inscritos do(a) dev "+d1.getNome()+": "+d1.getConteudosInscritos());
        System.out.println("Conteudos inscritos do(a) dev "+d2.getNome()+": "+d2.getConteudosInscritos());
        System.out.println("Conteudos Concluidos do(a) dev "+d1.getNome()+": "+d1.getConteudosConcluidos());
        System.out.println("Conteudos Concluidos do(a) dev "+d2.getNome()+": "+d2.getConteudosConcluidos());
        System.out.println("dev:"+d1.getNome()+" XP:"+d1.calcularXP());
        System.out.println("dev:"+d2.getNome()+" XP:"+d2.calcularXP());


    }
}
