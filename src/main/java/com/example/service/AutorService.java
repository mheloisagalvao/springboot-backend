package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.model.Autor;
import com.example.repository.AutorRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public List<Autor> getAllAutores() {
        return (List<Autor>) autorRepository.findAll();
    }

    public Autor getAutorById(Long id) {
        Optional<Autor> autor = autorRepository.findById(id);
        return autor.orElse(null);
    }

    public Autor createAutor(Autor autor) {
        return autorRepository.save(autor);
    }

    public Autor updateAutor(Long id, Autor newAutor) {
        Optional<Autor> existingAutor = autorRepository.findById(id);

        if (existingAutor.isPresent()) {
            Autor autor = existingAutor.get();
            autor.setNome(newAutor.getNome());
            autor.setPais(newAutor.getPais());
            return autorRepository.save(autor);
        } else {
            return null; 
        }
    }

    public void deleteAutor(Long id) {
        autorRepository.deleteById(id);
    }
}
