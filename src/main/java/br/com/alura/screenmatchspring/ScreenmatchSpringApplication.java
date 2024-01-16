package br.com.alura.screenmatchspring;

import br.com.alura.screenmatchspring.main.Main;
import br.com.alura.screenmatchspring.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchSpringApplication implements CommandLineRunner {

    @Autowired
    private SerieRepository serieRepository;

    public static void main(String[] args) {
        SpringApplication.run(ScreenmatchSpringApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Main main = new Main(serieRepository);

        main.exibeMenu();

    }
}
