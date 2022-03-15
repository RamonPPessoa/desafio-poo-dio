import br.com.dio.desafio.dominio.Curso;
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


        System.out.println(curso1);
        System.out.println(curso2);

        System.out.println(mentoria);
    }
}
