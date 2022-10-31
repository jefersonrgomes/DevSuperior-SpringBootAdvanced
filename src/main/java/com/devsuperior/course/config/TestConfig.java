package com.devsuperior.course.config;

import com.devsuperior.course.Entities.Userentitie;
import com.devsuperior.course.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
        Userentitie user1 = new Userentitie(null,"Maria Conseição dos Santos", "maria@mail.com", "365478526", "Mudar1234");
        Userentitie user2 = new Userentitie(null,"Joao Alexandre Dias", "joao@mail.com", "789456321", "Mudar1234");
        Userentitie user3 = new Userentitie(null,"Carlos Eduardo Borba", "carlos@mail.com", "951357456", "Mudar1234");
        Userentitie user4 = new Userentitie(null,"Marcos Firmino", "firmino@mail.com", "357357951", "Mudar1234");

        userRepository.saveAll(Arrays.asList(user1, user2, user3,user4));
    }
}
