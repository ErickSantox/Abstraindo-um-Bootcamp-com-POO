import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Bootcamp Java");
        curso1.setDescricao("Curso para trabalhar com java");
        curso1.setCargaHoraria(180);

        //--------------------------------------------------------------------

        Curso curso2 = new Curso();

        curso2.setTitulo("Bootcamp Python");
        curso2.setDescricao("Machine learning com Python");
        curso2.setCargaHoraria(70);

        //--------------------------------------------------------------------

        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("Mentoria Developers");
        mentoria1.setDescricao("Te ajuda com o programação");
        mentoria1.setData(LocalDate.now());

        System.out.println("==== Cursos e mentorias Disponíveis na DIO ====");
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);


        System.out.println("==========================================");

        //----------------------------------------



        Bootcamp bootcamp1 = new Bootcamp();

        bootcamp1.setNome("Curso Java");
        bootcamp1.setDescricao("Aprendendo POO com Java");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(mentoria1);

        Bootcamp bootcamp2 = new Bootcamp();
        bootcamp2.setNome("Curso Python");
        bootcamp2.setDescricao("Aprendendo Machine Learning com Python");
        bootcamp2.getConteudos().add(curso2);
        bootcamp2.getConteudos().add(mentoria1);

        //--------------------------------------------------------------------


        Dev dev1 = new Dev();
        dev1.setNome("Erick Santos");
        dev1.inscreverBootcamp(bootcamp1);
        System.out.println(dev1.getConteudosInscritos());
        dev1.progredir();

        System.out.println("==== Progresso do " + dev1.getNome() + " ====");
        System.out.println(dev1.calcularTotalXp());

        System.out.println("==== Cursos concluídos de " + dev1.getNome() + " ====");
        System.out.println(dev1.getConteudosConcluidos());



        Dev dev2 = new Dev();
        dev2.setNome("Melissa Lopes");
        dev2.inscreverBootcamp(bootcamp2);
        System.out.println(dev2.getConteudosInscritos());
        dev2.progredir();

        System.out.println("==== Progresso do " + dev2.getNome() + " ====");
        System.out.println(dev2.calcularTotalXp());

        System.out.println("==== Cursos concluídos de " + dev2.getNome() + " ====");
        System.out.println(dev2.getConteudosConcluidos());

    }
}