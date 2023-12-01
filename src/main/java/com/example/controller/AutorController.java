package com.example.controller;
import com.example.service.AutorService;
import com.example.model.Autor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autores")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @GetMapping
    public List<Autor> getAllAutores() {
        return autorService.getAllAutores();
    }

    @GetMapping("/{id}")
    public Autor getAutorById(@PathVariable Long id) {
        return autorService.getAutorById(id);
    }

    @PostMapping
    public Autor createAutor(@RequestBody Autor autor) {
        return autorService.createAutor(autor);
    }

    @PutMapping("/{id}")
    public Autor updateAutor(@PathVariable Long id, @RequestBody Autor autor) {
        return autorService.updateAutor(id, autor);
    }

    @DeleteMapping("/{id}")
    public void deleteAutor(@PathVariable Long id) {
        autorService.deleteAutor(id);
    }
}
