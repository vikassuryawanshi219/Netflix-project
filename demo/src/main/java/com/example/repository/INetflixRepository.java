package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Netflix;

@Repository
public interface INetflixRepository  extends JpaRepository<Netflix, Integer>{

}
