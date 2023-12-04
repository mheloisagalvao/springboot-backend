package com.example.demo.controller;


import com.example.demo.model.ItensEmprestimo;
import com.example.demo.service.ItensEmprestimoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/itens-emprestimo")
public class ItensEmprestimoController {
    private final ItensEmprestimoService itensEmprestimoService;

    @Autowired
    public ItensEmprestimoController(ItensEmprestimoService itensEmprestimoService) {
        this.itensEmprestimoService = itensEmprestimoService;
    }

    @GetMapping
    public ResponseEntity<List<ItensEmprestimo>> getAllItensEmprestimo() {
        List<ItensEmprestimo> itensEmprestimoList = itensEmprestimoService.getAllItensEmprestimo();
        return new ResponseEntity<>(itensEmprestimoList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ItensEmprestimo> getItensEmprestimoById(@PathVariable Long id) {
        ItensEmprestimo itensEmprestimo = itensEmprestimoService.getItensEmprestimoById(id);
        return new ResponseEntity<>(itensEmprestimo, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ItensEmprestimo> createItensEmprestimo(@RequestBody ItensEmprestimo itensEmprestimo) {
        ItensEmprestimo createdItensEmprestimo = itensEmprestimoService.createItensEmprestimo(itensEmprestimo);
        return new ResponseEntity<>(createdItensEmprestimo, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ItensEmprestimo> updateItensEmprestimo(@PathVariable Long id, @RequestBody ItensEmprestimo itensEmprestimo) {
        ItensEmprestimo updatedItensEmprestimo = itensEmprestimoService.updateItensEmprestimo(id, itensEmprestimo);
        return new ResponseEntity<>(updatedItensEmprestimo, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteItensEmprestimo(@PathVariable Long id) {
        itensEmprestimoService.deleteItensEmprestimo(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
