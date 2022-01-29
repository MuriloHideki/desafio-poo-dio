import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMurilo = new Dev();
        devMurilo.setNome("Murilo");
        devMurilo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devMurilo.getNome() + devMurilo.getConteudosInscritos());
        devMurilo.progredir();
        devMurilo.progredir();
        System.out.println("*");
        System.out.println("Conteúdos Inscritos " + devMurilo.getNome() + devMurilo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + devMurilo.getNome() + devMurilo.getConteudosConcluidos());
        System.out.println("XP: " + devMurilo.calcularTotalXP());

        System.out.println("------------");

        Dev devAna = new Dev();
        devAna.setNome("Ana");
        devAna.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devAna.getNome() + devAna.getConteudosInscritos());
        devAna.progredir();
        System.out.println("*");
        System.out.println("Conteúdos Inscritos " + devAna.getNome() + devAna.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + devAna.getNome() + devAna.getConteudosConcluidos());
        System.out.println("XP: " + devAna.calcularTotalXP());
    }
}
