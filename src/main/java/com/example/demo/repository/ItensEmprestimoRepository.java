package com.example.demo.repository;

import com.example.demo.model.ItensEmprestimo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItensEmprestimoRepository extends JpaRepository<ItensEmprestimo, Long> {
}
