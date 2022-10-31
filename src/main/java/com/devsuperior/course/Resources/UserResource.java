package com.devsuperior.course.Resources;

import com.devsuperior.course.Entities.Userentitie;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<Userentitie> findAll(){
        Userentitie userentitie = new Userentitie(
                1L,
                "Carlos",
                "carlos@mail.com",
                "1196548856",
                "!#$jk35kcksl#!%");
        return ResponseEntity.ok().body(userentitie);
    }
}
