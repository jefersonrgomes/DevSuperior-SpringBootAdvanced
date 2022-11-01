package com.devsuperior.course.repositories;

import com.devsuperior.course.Entities.Userentitie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Userentitie, Long> {
}