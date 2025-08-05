package com.course.mongodb.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "pessoas")
public class Pessoa {

    @Id
    private String id;

    @Field(name = "nome")
    private String nome;

    private Integer idade;

    private Profissao profissao;

    private List<Telefone> telefones;

    public Pessoa(String id, String nome, Integer idade, Profissao profissao, List<Telefone> telefones) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
        this.telefones = telefones;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }
}
