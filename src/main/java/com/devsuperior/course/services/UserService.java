package com.devsuperior.course.services;

import com.devsuperior.course.Entities.Userentitie;
import com.devsuperior.course.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<Userentitie> findAll(){
        return userRepository.findAll();
    }

    public Userentitie findById(Long id){
        Optional<Userentitie> userentitie = userRepository.findById(id);
        return userentitie.get()
;    }
}
