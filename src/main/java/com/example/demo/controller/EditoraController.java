package com.example.demo.controller;

import com.example.demo.model.Editora;
import com.example.demo.service.EditoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/editoras")
public class EditoraController {

    @Autowired
    private EditoraService editoraService;

    @GetMapping
    public List<Editora> getAllEditoras() {
        return editoraService.getAllEditoras();
    }

    @GetMapping("/{id}")
    public Optional<Editora> getEditoraById(@PathVariable Long id) {
        return editoraService.getEditoraById(id);
    }

    @PostMapping
    public Editora saveEditora(@RequestBody Editora editora) {
        return editoraService.saveEditora(editora);
    }

    @PutMapping("/{id}")
    public Editora updateEditora(@PathVariable Long id, @RequestBody Editora editora) {
        return editoraService.updateEditora(id, editora);
    }

    @DeleteMapping("/{id}")
    public void deleteEditora(@PathVariable Long id) {
        editoraService.deleteEditora(id);
    }
}
