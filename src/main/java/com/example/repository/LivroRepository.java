package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {
}
