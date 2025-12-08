package net.osouf.demogitspring;

import net.osouf.demogitspring.entities.Patient;
import net.osouf.demogitspring.repository.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoGitSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoGitSpringApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository) {
        return args -> {
            //patientRepository.save(Patient.builder().nom("Liolios").build());
            //patientRepository.save(Patient.builder().nom("Dauphin").build());
            patientRepository.save(Patient.builder().nom("Giovani").build());

        };
    }
}
