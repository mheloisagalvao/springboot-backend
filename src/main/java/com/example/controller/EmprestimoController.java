package com.example.controller;

import com.example.model.Emprestimo;
import com.example.service.EmprestimoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/emprestimos")
public class EmprestimoController {

    @Autowired
    private EmprestimoService emprestimoService;

    @GetMapping
    public List<Emprestimo> getAllEmprestimos() {
        return emprestimoService.getAllEmprestimos();
    }

    @GetMapping("/{id}")
    public Optional<Emprestimo> getEmprestimoById(@PathVariable Long id) {
        return emprestimoService.getEmprestimoById(id);
    }

    @PostMapping
    public Emprestimo saveEmprestimo(@RequestBody Emprestimo emprestimo) {
        return emprestimoService.saveEmprestimo(emprestimo);
    }

    @PutMapping("/{id}")
    public Emprestimo updateEmprestimo(@PathVariable Long id, @RequestBody Emprestimo emprestimo) {
        return emprestimoService.updateEmprestimo(id, emprestimo);
    }

    @DeleteMapping("/{id}")
    public void deleteEmprestimo(@PathVariable Long id) {
        emprestimoService.deleteEmprestimo(id);
    }
}
