package com.capg.movie.capg.movie.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.movie.capg.movie.booking.entities.Theatre;
@Repository
public interface TheatreRepository extends JpaRepository<Theatre, Integer>{

}