package com.devsuperior.course.config;

import com.devsuperior.course.Entities.Userentitie;
import com.devsuperior.course.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    private final UserRepository userRepository;

    public TestConfig(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Userentitie user1 = new Userentitie(null,"Maria Conseição dos Santos", "maria.conseicao@mail.com", "11 976984565", "Mudar@1234!@#$");
        Userentitie user2 = new Userentitie(null,"Joao Alexandre Dias", "joao.alexandre@gmail.com", "11 989456321", "Mudar@1234!@#$");
        Userentitie user3 = new Userentitie(null,"Carlos Eduardo Borba", "carlos.eduardo@gmail.com", "11 951357456", "Mudar@1234!@#$");
        Userentitie user4 = new Userentitie(null,"Marcos Firmino", "marcos.firmino@gmail.com", "11 957357951", "Mudar@1234!@#$");

        userRepository.saveAll(Arrays.asList(user1, user2, user3,user4));
    }
}
