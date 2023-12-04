package com.example.demo.service;

import com.example.demo.model.Editora;
import com.example.demo.repository.EditoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EditoraService {

    @Autowired
    private EditoraRepository editoraRepository;

    public List<Editora> getAllEditoras() {
        return editoraRepository.findAll();
    }

    public Optional<Editora> getEditoraById(Long id) {
        return editoraRepository.findById(id);
    }

    public Editora saveEditora(Editora editora) {
        return editoraRepository.save(editora);
    }

    public Editora updateEditora(Long id, Editora newEditora) {
        Optional<Editora> existingEditora = editoraRepository.findById(id);

        if (existingEditora.isPresent()) {
            Editora editora = existingEditora.get();
            editora.setNome(newEditora.getNome());
            editora.setLocalizacao(newEditora.getLocalizacao());
            return editoraRepository.save(editora);
        } else {
            return null;
        }
    }

    public void deleteEditora(Long id) {
        editoraRepository.deleteById(id);
    }
}
