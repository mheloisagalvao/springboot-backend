package com.example.service;

import com.example.model.Emprestimo;
import com.example.repository.EmprestimoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmprestimoService {

    @Autowired
    private EmprestimoRepository emprestimoRepository;

    public List<Emprestimo> getAllEmprestimos() {
        return emprestimoRepository.findAll();
    }

    public Optional<Emprestimo> getEmprestimoById(Long id) {
        return emprestimoRepository.findById(id);
    }

    public Emprestimo saveEmprestimo(Emprestimo emprestimo) {
        return emprestimoRepository.save(emprestimo);
    }

    public Emprestimo updateEmprestimo(Long id, Emprestimo newEmprestimo) {
        Optional<Emprestimo> existingEmprestimo = emprestimoRepository.findById(id);

        if (existingEmprestimo.isPresent()) {
            Emprestimo emprestimo = existingEmprestimo.get();
            emprestimo.setDataEmprestimo(newEmprestimo.getDataEmprestimo());
            emprestimo.setDataPrevisaoDevolucao(newEmprestimo.getDataPrevisaoDevolucao());
            return emprestimoRepository.save(emprestimo);
        } else {
            return null;
        }
    }

    public void deleteEmprestimo(Long id) {
        emprestimoRepository.deleteById(id);
    }
}
