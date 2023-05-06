package tn.esprit.tic.skioussemaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SkiOussemaFApplication {

    public static void main(String[] args) {

        SpringApplication.run(SkiOussemaFApplication.class, args);
    }
}
