package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;
import java.util.Set;

@Entity
public class Emprestimo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date dataEmprestimo;

    private Date dataPrevisaoDevolucao;

    // Adicionar a referência a ItensEmprestimo, após a classe ser criada
    //private Set<ItensEmprestimo> itens;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataPrevisaoDevolucao() {
        return dataPrevisaoDevolucao;
    }

    public void setDataPrevisaoDevolucao(Date dataPrevisaoDevolucao) {
        this.dataPrevisaoDevolucao = dataPrevisaoDevolucao;
    }

    // Adicionar a referência a ItensEmprestimo, após a classe ser criada
//    public Set<ItensEmprestimo> getItens() {
//        return itens;
//    }
//
//    public void setItens(Set<ItensEmprestimo> itens) {
//        this.itens = itens;
//    }
}
