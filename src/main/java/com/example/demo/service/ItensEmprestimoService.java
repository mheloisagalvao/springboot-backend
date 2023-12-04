package com.example.demo.service;

import com.example.demo.model.ItensEmprestimo;
import com.example.demo.repository.ItensEmprestimoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItensEmprestimoService {
    private final ItensEmprestimoRepository itensEmprestimoRepository;

    @Autowired
    public ItensEmprestimoService(ItensEmprestimoRepository itensEmprestimoRepository) {
        this.itensEmprestimoRepository = itensEmprestimoRepository;
    }

    public List<ItensEmprestimo> getAllItensEmprestimo() {
        return itensEmprestimoRepository.findAll();
    }

    public ItensEmprestimo getItensEmprestimoById(Long id) {
        Optional<ItensEmprestimo> optionalItensEmprestimo = itensEmprestimoRepository.findById(id);
        return optionalItensEmprestimo.orElse(null);
    }

    public ItensEmprestimo createItensEmprestimo(ItensEmprestimo itensEmprestimo) {
        return itensEmprestimoRepository.save(itensEmprestimo);
    }

    public ItensEmprestimo updateItensEmprestimo(Long id, ItensEmprestimo itensEmprestimo) {
        if (itensEmprestimoRepository.existsById(id)) {
            itensEmprestimo.setId(id);
            return itensEmprestimoRepository.save(itensEmprestimo);
        } else {
            return null; // Ou lançar uma exceção indicando que o item não foi encontrado
        }
    }

    public void deleteItensEmprestimo(Long id) {
        itensEmprestimoRepository.deleteById(id);
    }
}
