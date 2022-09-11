package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Geners;

@Repository
public interface IGenersRepository extends JpaRepository<Geners, Integer> {

}
