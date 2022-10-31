package com.devsuperior.course.Repositories;

import com.devsuperior.course.Entities.Userentitie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Userentitie, Long> {

}
