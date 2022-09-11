package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.model.Movies;

@Repository
public interface IMoviesRepository extends JpaRepository<Movies, Integer> {

}
