package com.example.mtb.repository;

import com.example.mtb.entity.movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<movie,String>{
}
