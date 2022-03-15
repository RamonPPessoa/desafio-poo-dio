import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
            Curso curso1 = new Curso();


            curso1.setTitulo("Curso Java");
            curso1.setDescricao("Do básico ao Simpring framework");
            curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();


        curso1.setTitulo("Curso Python");
        curso1.setDescricao("Do básico ao Django e flask framework");
        curso1.setCargaHoraria(10);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Java");
        mentoria.setDescricao("Melhores praticas e metcado de trabalho");
        mentoria.setData(LocalDate.now());



        /*System.out.println(curso1);
        System.out.println(curso2);

        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java developer");
        bootcamp.setDescricao("Java do básico ao avançado");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRamonPessoa = new Dev();
        devRamonPessoa.setNome("Ramon Palheta Pessôa de Souza");
        devRamonPessoa.inscreverBootcamp(bootcamp);
        System.out.println("COnteudo(os) inscrito(os) "+ devRamonPessoa.getConteudosInscritos());
        devRamonPessoa.progredir();

        System.out.println("COnteudo(os) inscrito(os) "+ devRamonPessoa.getConteudosInscritos());
        System.out.println("COnteudo(os) concluído(os) "+ devRamonPessoa.getConteudoConcluidos());
        System.out.println("XP:" + devRamonPessoa.calcularTotalXp());
    }
}
