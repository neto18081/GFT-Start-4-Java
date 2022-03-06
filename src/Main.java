import br.dio.pedro.bootcamp.Bootcamp;
import br.dio.pedro.bootcamp.Conteudo;
import br.dio.pedro.bootcamp.Curso;
import br.dio.pedro.bootcamp.Dev;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Curso java", "Curso sobre java", 15);
        Set<Conteudo> conteudos = new LinkedHashSet<>();
        conteudos.add(curso1);

        Bootcamp bootcampJava = new Bootcamp("GFT 4 - Start", "Bootcamp de java", conteudos);

        Dev dev1 = new Dev();
        dev1.setNome("Pedro");

        dev1.inscreverBootcamp(bootcampJava);
        System.out.println(dev1.getConteudosInscritos());


    }
}
