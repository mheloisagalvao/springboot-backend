package com.example.model;

import javax.persistence.*;
// import java.util.List; (vai ser utilizada quando o getter and setter de livro for implementado)

@Entity
@Table(name = "editora")
public class Editora {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String localizacao;

    // Adicionar a referência a Livro, após a classe ser criada
    // private List<Livro> livros;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    // Removido o getter e setter de livros até a classe ser implementada
    // public List<Livro> getLivros() {
    //     return livros;
    // }

    // public void setLivros(List<Livro> livros) {
    //     this.livros = livros;
    // }
}
