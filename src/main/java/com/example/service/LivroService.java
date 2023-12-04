package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Livro;
import com.example.repository.LivroRepository;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    public List<Livro> getAllLivros() {
        return livroRepository.findAll();
    }

    public Livro getLivroById(Long id) {
        Optional<Livro> livro = livroRepository.findById(id);
        return livro.orElse(null);
    }

    public Livro createLivro(Livro livro) {
        return livroRepository.save(livro);
    }

    public Livro updateLivro(Long id, Livro newLivro) {
        Optional<Livro> existingLivro = livroRepository.findById(id);

        if (existingLivro.isPresent()) {
            Livro livro = existingLivro.get();
            livro.setTitulo(newLivro.getTitulo());
            livro.setAnoPublicacao(newLivro.getAnoPublicacao());
            livro.setEditora(newLivro.getEditora());
            livro.setAutores(newLivro.getAutores());
            return livroRepository.save(livro);
        } else {
            return null;
        }
    }

    public void deleteLivro(Long id) {
        livroRepository.deleteById(id);
    }
}
