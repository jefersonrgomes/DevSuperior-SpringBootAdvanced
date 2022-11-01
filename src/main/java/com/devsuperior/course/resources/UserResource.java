package com.devsuperior.course.resources;

import com.devsuperior.course.Entities.Userentitie;
import com.devsuperior.course.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserResource {

    private final UserService userService;

    public UserResource(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<Userentitie>> findAll(){
        List<Userentitie> listarTodosUsuarios = userService.findAll();
        return ResponseEntity.ok().body(listarTodosUsuarios);
                        }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Userentitie> findById(@PathVariable Long id){
        Userentitie userentitie = userService.findById(id);
        return ResponseEntity.ok().body(userentitie);
                        }
}
